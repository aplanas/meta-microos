SUMMARY = "String viewer"
DESCRIPTION = "String viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftstring-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "3bfb53a6b0da20bba8e92c52fd87825faa2d9499f4ab258d2975a5ed41eeb2a50c51504d0cbcb487d1646cf8969e60d4a4a18c404128e3b724a42574a1eb90d0"

RPROVIDES:${PN} += "ftstring ftstring(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfreetype.so.6()(64bit) libgobject-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) librsvg-2.so.2()(64bit)"

inherit rpm
