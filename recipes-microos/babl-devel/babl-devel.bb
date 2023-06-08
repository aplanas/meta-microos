SUMMARY = "Dynamic Pixel Format Translation Library"
DESCRIPTION = "babl is a dynamic, any to any, pixel format translation library."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.1.102"

RPM_NAME = "babl-devel-0.1.102-2.3.aarch64.rpm"
RPM_HASH = "82b20e34b4e500f1200a6b1e69d3a2237920afe0a5b66d5c56320b280638fc67e5a7ccbf8a0e7307a383b1ce38f5fb5fad62a77747f05cf3caa0ee74b41a5aa6"

RPROVIDES:${PN} += "babl-devel babl-devel(aarch-64) pkgconfig(babl-0.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbabl-0.1.so.0()(64bit) libbabl-0.1.so.0(V0_1_0)(64bit) libbabl-0_1-0 libc.so.6(GLIBC_2.34)(64bit) pkgconfig(lcms2) typelib-1_0-Babl-0_1"

inherit rpm
