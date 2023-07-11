SUMMARY = "HTTP server for Teletext pages"
DESCRIPTION = "alevtd reads the teletext pages from /dev/vbi and allows to fetch them \
via http, i.e. you can read the teletext pages with a web browser."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "alevtd-3.107-2.11.aarch64.rpm"
RPM_HASH = "ce39810c7d858b198118bbcb930aaab972ff40d84a7c6cc0c239ecfa7fae529feb2135c92bdc962a70e89f2e4c767689f34e7addb173e6962bf47352657df4f4"

RPROVIDES:${PN} += "alevtd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libzvbi.so.0"

inherit rpm
