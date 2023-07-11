SUMMARY = "Light-weight C++ XML Processing Library"
DESCRIPTION = "pugixml is a light-weight C++ XML processing library. It features: \
 \
- DOM-like interface with rich traversal/modification capabilities \
- Extremely fast non-validating XML parser which constructs the DOM tree from \
  an XML file/buffer \
- XPath 1.0 implementation for complex data-driven tree queries \
- Full Unicode support with Unicode interface variants and automatic encoding \
  conversions"
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "libpugixml1-1.13-1.4.aarch64.rpm"
RPM_HASH = "3586a0a88834ce840a72159a59cd63de7f15af87bab442833ab8989a7d3e0beafea59a073c3aee6d82900a2bd91671e258ae2a030db2e40eeae958935c827de3"

RPROVIDES:${PN} += "libpugixml.so.1 \
libpugixml1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
