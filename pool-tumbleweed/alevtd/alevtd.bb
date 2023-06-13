SUMMARY = "HTTP server for Teletext pages"
DESCRIPTION = "alevtd reads the teletext pages from /dev/vbi and allows to fetch them \
via http, i.e. you can read the teletext pages with a web browser."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "alevtd-3.107-2.10.aarch64.rpm"
RPM_HASH = "2d493f9b2ee1098a55989d77d737f699812b13930fcd318fb407d29542d8823be4c6084eff1e801ba1b5ad947c204e4cab26d70f2a5640f45e94ae9c80b40ae7"

RPROVIDES:${PN} += "alevtd \
alevtd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libzvbi.so.0()(64bit)"

inherit rpm
