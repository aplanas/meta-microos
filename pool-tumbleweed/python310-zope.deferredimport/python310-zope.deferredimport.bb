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

RPM_NAME = "python310-zope.deferredimport-4.4-2.3.noarch.rpm"
RPM_HASH = "2677ca6824800d158c23535ce8bc8cc020b941404f1c3d8ee154a28824dbdd816224ff1faf6e368e6ab84f6f130b58d43f9588b229f2ae59ba31b09cf017d8a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.deferredimport \
python3.10dist(zope.deferredimport) \
python310-zope.deferredimport \
python3dist(zope.deferredimport)"

RDEPENDS:${PN} += "python(abi) \
python310-zope.proxy"

inherit rpm
