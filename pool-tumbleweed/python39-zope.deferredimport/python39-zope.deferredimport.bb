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

RPM_NAME = "python39-zope.deferredimport-4.4-2.3.noarch.rpm"
RPM_HASH = "933edae472bd063a4a76de8df2bc4d1c2bd9815532613997ee98ae9a81f8df4d76569e5fc57d52dd29f96c612a4bf49cb93b433139249518d4144d9e49eef207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.deferredimport \
python39-zope.deferredimport \
python3dist-zope.deferredimport"

RDEPENDS:${PN} += "python-abi \
python39-zope.proxy"

inherit rpm
