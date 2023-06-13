SUMMARY = "Simple font tester"
DESCRIPTION = "Simple font tester \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftlint-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "fb56464557d74dcee098bf61498c148fd5d8a04a936335441bd716678516a00052d79c7c113ba950619ae129df18e25ec472df9c330dc78ccc8b3f1c7392fd06"

RPROVIDES:${PN} += "ftlint \
ftlint(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreetype.so.6()(64bit)"

inherit rpm
