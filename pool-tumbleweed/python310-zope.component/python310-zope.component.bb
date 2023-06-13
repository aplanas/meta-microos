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

RPM_NAME = "python310-zope.component-6.0-2.1.aarch64.rpm"
RPM_HASH = "ce433e9c32c6fcea6b0d4e2cabd847744bdba1e625522e3fbce735a69503b312b40ec481ca50933d4572a32eb0b1d365c125c87fed0a8baa969892c59978a7b6"

RPROVIDES:${PN} += "python3-zope.component \
python3.10dist(zope.component) \
python310-zope.component \
python310-zope.component(aarch-64) \
python3dist(zope.component)"

RDEPENDS:${PN} += "python(abi) \
python310-zope.event \
python310-zope.hookable \
python310-zope.interface"

inherit rpm
