SUMMARY = "GNU m4"
DESCRIPTION = "GNU m4 is an implementation of the traditional Unix macro processor."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.18"

RPM_NAME = "m4-1.4.18-7.5.aarch64.rpm"
RPM_HASH = "7a3e0f58bfa591438f39468610cf68973c17010ccec94829f78032ba446181881c5b19731d89185f4fa4be38c1988a00bcbf6aaa3c1c8a8c5a8fe09ad02c256c"

RPROVIDES:${PN} += "base:/usr/bin/m4 \
m4 \
m4(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
