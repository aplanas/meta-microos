SUMMARY = "Buddyinfo plugin for collectd"
DESCRIPTION = "Optional collectd plugin for memory fragmentation."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-buddyinfo-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "3b86979eb525229551886d947fb6cbf9c72b7847440ec5eba88d08cd8d5ccf345217c6eb47c53a18203fe455a6181f10d9b6d4645a3cc5151b442cf3ced56241"

RPROVIDES:${PN} += "collectd-plugin-buddyinfo"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
