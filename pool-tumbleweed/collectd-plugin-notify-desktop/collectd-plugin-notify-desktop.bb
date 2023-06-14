SUMMARY = "Desktop Notification Plugin for collectd"
DESCRIPTION = "Desktop Notification Support for collectd allow you to receive \
message delivery on your desktop."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-notify-desktop-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "b8f3ac64239074eb74cec67f138e99bbd079d60b5dbb571ae48016f49afb4cfd4cf83594ed0c653e4233661bfa9d669d599ee1234e033ef5b899d430fe6e1b54"

RPROVIDES:${PN} += "collectd-plugin-notify-desktop"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libnotify.so.4"

inherit rpm
