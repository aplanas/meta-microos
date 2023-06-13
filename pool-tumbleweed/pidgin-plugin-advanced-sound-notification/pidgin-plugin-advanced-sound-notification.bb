SUMMARY = "Pidgin plugin adding sound notifications"
DESCRIPTION = "This plugin adds sounds for some sound notifications to Pidgin \
(e.g. 'Incoming Filetransfer' or 'Authentication requested')."
LICENSE = "GPL-2.0+"

PV = "1.2.1"

RPM_NAME = "pidgin-plugin-advanced-sound-notification-1.2.1-11.25.aarch64.rpm"
RPM_HASH = "76973dfbf3fb0f661a6124233d9571dab670b46936d0fdfaf6ebde16e064257e0daac09bae5a8118b8979945284b1ce5d61762843e6c6fec20e25bb7c48c8cb7"

RPROVIDES:${PN} += "pidgin-plugin-advanced-sound-notification \
pidgin-plugin-advanced-sound-notification(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpurple.so.0()(64bit) \
pidgin"

inherit rpm
