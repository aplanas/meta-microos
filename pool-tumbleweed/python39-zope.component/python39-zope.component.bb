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

RPM_NAME = "python39-zope.component-6.0-2.2.aarch64.rpm"
RPM_HASH = "a7248f1010c15818a79f7b76b5832f55b4e28ba1a024178ed969d3826c214fe8125208f488a0abdb788ad8c4315ce053cdeabab403162e4f6ec7a63925da0eaf"

RPROVIDES:${PN} += "python3.9dist-zope.component \
python39-zope.component \
python3dist-zope.component"

RDEPENDS:${PN} += "python-abi \
python39-zope.event \
python39-zope.hookable \
python39-zope.interface"

inherit rpm
