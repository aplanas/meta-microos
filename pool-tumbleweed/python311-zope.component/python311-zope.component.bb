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

RPM_NAME = "python311-zope.component-6.0-2.2.aarch64.rpm"
RPM_HASH = "a358912b95bd79102126dcade38f7889c83f9d50418d24f86dc1ba32c6efc6551d7e141b7b540894dee1a2b15d664dac2f921a8723562ee2f70ce204edb33e6b"

RPROVIDES:${PN} += "python3-zope.component \
python3.11dist-zope.component \
python311-zope.component \
python3dist-zope.component"

RDEPENDS:${PN} += "python-abi \
python311-zope.event \
python311-zope.hookable \
python311-zope.interface"

inherit rpm
