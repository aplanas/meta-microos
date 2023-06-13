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

RPM_NAME = "python311-zope.deferredimport-4.4-2.3.noarch.rpm"
RPM_HASH = "c376fe9fae4d6397203601c158a019befd1cd739c9822fdef58d0d03ba286346ce4b6e82bf87ac497dc7d68567650f5bb9c73a385b5c06c26a310beb2c8cf1fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zope.deferredimport) \
python311-zope.deferredimport \
python3dist(zope.deferredimport)"

RDEPENDS:${PN} += "python(abi) \
python311-zope.proxy"

inherit rpm
