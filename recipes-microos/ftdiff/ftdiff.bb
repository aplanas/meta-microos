SUMMARY = "Compare font hinting modes"
DESCRIPTION = "Compare font hinting modes \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftdiff-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "029acbed62e7a165440280a7681911f39186a5e7b62f2224d36522df5827368e1205f6546f3a07385ab65fed09035582a9f17f719a4c5776ee4e21b1c4182e30"

RPROVIDES:${PN} += "ftdiff ftdiff(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) librsvg-2.so.2()(64bit)"

inherit rpm
