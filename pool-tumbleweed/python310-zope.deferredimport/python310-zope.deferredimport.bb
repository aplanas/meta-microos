SUMMARY = "On-demand import name resolver"
DESCRIPTION = "Often, especially for package modules, you want to import names for \
convenience, but not actually perform the imports until necessary. \
The zope.deferredimport package provided facilities for defining names \
in modules that will be imported from somewhere else when used.  You \
can also cause deprecation warnings to be issued when a variable is \
used. \
 \
Documentation is hosted at https://zopedeferredimport.readthedocs.io/"
LICENSE = "ZPL-2.1"

PV = "4.4"

RPM_NAME = "python310-zope.deferredimport-4.4-3.3.noarch.rpm"
RPM_HASH = "d8c27f9cd5826e6bc85083aba8e76418be504c3793ca53dc5d61df9b6c28d75816f96c74c667dd9b75d49720caa5e2f8d4c078ff8a277a49f498e477b1ad7a71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zope.deferredimport \
python310-zope.deferredimport \
python3dist-zope.deferredimport"

RDEPENDS:${PN} += "python-abi \
python310-zope.proxy"

inherit rpm
