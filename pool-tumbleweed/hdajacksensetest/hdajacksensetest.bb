SUMMARY = "Tool to check HD-audio jack/pin status"
DESCRIPTION = "hdajacksensetest is a small program to check the current pin/jack status \
of the HD-audio codec."
LICENSE = "GPL-2.0-or-later"

PV = "0.20141006"

RPM_NAME = "hdajacksensetest-0.20141006-24.4.aarch64.rpm"
RPM_HASH = "3b6d138b0f36065974324028faf6aa62ed57f906d3058519dcab4f14af1d42f0fbd22a79d471a527547404d04546166dd307c55ddfc5e5dbc1bb14b8ae01d178"

RPROVIDES:${PN} += "hdajacksensetest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
