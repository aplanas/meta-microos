SUMMARY = "File viewer and pager"
DESCRIPTION = "Most is a paging program. \
It supports multiple windows and can scroll left and right."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "most-5.2.0-1.6.aarch64.rpm"
RPM_HASH = "a18adb534e33e575e693f1720da36280bf2025c70a07b05168283f41fa9b49a8756c4a4f005118147b31ab266ae3644f9753ceeea4e2efc8c222e76df7bd819e"

RPROVIDES:${PN} += "most"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslang.so.2"

inherit rpm
