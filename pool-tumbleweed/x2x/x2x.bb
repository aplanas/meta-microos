SUMMARY = "X Window System Display Remote Control"
DESCRIPTION = "x2x allows the keyboard and mouse on one ('from') X Window System \
display to be used to control another ('to') X Window System display."
LICENSE = "GPL-2.0+"

PV = "1.30rc1+git.20180517"

RPM_NAME = "x2x-1.30rc1+git.20180517-1.18.aarch64.rpm"
RPM_HASH = "cad47aaac019ea81a99d2609bfb270b9a06b6f7c2444653f5b8746fcb83423578cb359f4a9b07100e7802a978e3bb6374df3f8b0f92e142ebe9e8797d08325f1"

RPROVIDES:${PN} += "x2x"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXtst.so.6 \
libc.so.6"

inherit rpm
