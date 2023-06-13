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

RPM_NAME = "libpugixml1-1.13-1.3.aarch64.rpm"
RPM_HASH = "1b25f130811b7e1ae9fc2b472ad35f9a8aede252e93bcbd7f8516990ec4e755100e36455de35a871e3a572e4fa4788e14c180da58ed84fde249810e5140c89af"

RPROVIDES:${PN} += "libpugixml.so.1()(64bit) \
libpugixml1 \
libpugixml1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
