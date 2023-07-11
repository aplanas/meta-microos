SUMMARY = "Zope Component Architecture"
DESCRIPTION = "This package is intended to be independently reusable in any Python project. It \
is maintained by the Zope Toolkit project. \
 \
This package represents the core of the Zope Component Architecture. Together \
with the 'zope.interface' package, it provides facilities for defining, \
registering and looking up components. \
 \
Please see http://docs.zope.org/zope.component/ or doc package for the \
documentation."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python310-zope.component-6.0-2.2.aarch64.rpm"
RPM_HASH = "168019601da0af02f2327a03661cb3d92300e885e5d8b48295fc16a08b74fa694f38678654488fb9ac6e48cdd9417fe9960d221018753475c5ccd15e2e8ca3f2"

RPROVIDES:${PN} += "python3.10dist-zope.component \
python310-zope.component \
python3dist-zope.component"

RDEPENDS:${PN} += "python-abi \
python310-zope.event \
python310-zope.hookable \
python310-zope.interface"

inherit rpm
