SUMMARY = "Zooming Predictive Text Entry System"
DESCRIPTION = "Dasher is a zooming predictive text entry system, designed for \
situations where keyboard input is impractical (for instance: \
accessibility or PDAs). It is usable with greatly limited amounts of \
physical input while still allowing high rates of text entry."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "dasher-5.0.0-1.7.aarch64.rpm"
RPM_HASH = "4676111cf43453c51e2c2b7a668ba23749bd4ffdbca35b3f68a5ee7dacd4ab053da4e05d3c082071c6228309b34098078b3d2f43b84cf7d6faf0ee8fa5c01f71"

RPROVIDES:${PN} += "application() \
application(dasher.desktop) \
dasher \
dasher(aarch-64) \
dasher-data-extras \
dasher-data-recommended"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatspi.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
