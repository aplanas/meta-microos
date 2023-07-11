SUMMARY = "Desktop Notification Plugin for collectd"
DESCRIPTION = "Desktop Notification Support for collectd allow you to receive \
message delivery on your desktop."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-notify-desktop-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "0b85280d4a89047cd350dc86554d813c8739a0248f7698bc4eb3844f5489754049959b6439550677dd0b09c916c4d23f00afe345a01d718143b82860df6646af"

RPROVIDES:${PN} += "collectd-plugin-notify-desktop"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libnotify.so.4"

inherit rpm
