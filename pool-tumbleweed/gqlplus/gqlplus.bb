SUMMARY = "A drop-in replacement for sqlplus, an Oracle SQL client"
DESCRIPTION = "GQLPlus is a drop-in replacement for sqlplus, an Oracle SQL client, for \
UNIX and UNIX-like platforms. The difference between GQLPlus and sqlplus is \
command-line editing and history, plus table-name and column-name \
completion."
LICENSE = "GPL-2.0-only"

PV = "1.15"

RPM_NAME = "gqlplus-1.15-1.1.aarch64.rpm"
RPM_HASH = "040a205ee8c0c7e13b0ae3d4194072a56c69088f1f364930c33983e039576c8fa71598fb890d7f63d64c2ca3d87985c58a5d232a02a3e59a7954b3e62aaec7e5"

RPROVIDES:${PN} += "gqlplus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
