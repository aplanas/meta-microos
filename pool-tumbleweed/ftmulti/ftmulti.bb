SUMMARY = "Multiple masters font viewer"
DESCRIPTION = "Multiple masters font viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftmulti-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "dcc1d74708be2072126efbadf9c12caf093ba8ebe1e41e0f435b92da0d70768d6cc87cf4bd24b0efb5d1b373fd418549b514953da59b160efa74117c4e5d3f1f"

RPROVIDES:${PN} += "ftmulti \
ftmulti(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreetype.so.6()(64bit) \
librsvg-2.so.2()(64bit)"

inherit rpm
