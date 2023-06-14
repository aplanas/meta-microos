SUMMARY = "Tool to check HD-audio jack/pin status"
DESCRIPTION = "hdajacksensetest is a small program to check the current pin/jack status \
of the HD-audio codec."
LICENSE = "GPL-2.0-or-later"

PV = "0.20141006"

RPM_NAME = "hdajacksensetest-0.20141006-24.3.aarch64.rpm"
RPM_HASH = "c09ed9ebdaf5ac53a4ed6822cc28a4f3bee2e536af502bd2e49e6ab6f8f2e22bb8f6c151cc3da20572f3bb64273eff5730311d16927e753761e0f3cf3d5434de"

RPROVIDES:${PN} += "hdajacksensetest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
