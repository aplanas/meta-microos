SUMMARY = "Screen gamma calibration helper"
DESCRIPTION = "Screen gamma calibration helper \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftgamma-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "e2708c781b06aac3769c454b3037b4db8d132f3865e92b4757832dad3e565f0b73c4f4e3b261e3193216123bcbe21bed51696217ceed5fdf39aea27a9dafcc8c"

RPROVIDES:${PN} += "ftgamma \
ftgamma(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreetype.so.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
librsvg-2.so.2()(64bit)"

inherit rpm
