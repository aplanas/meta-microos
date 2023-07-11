SUMMARY = "GMailNotify plugin for Vacuum-IM"
DESCRIPTION = "Vacuum-IM plugin for gmail notifications."
LICENSE = "GPL-3.0"

PV = "1.0.5+git1518929179.2d687c8"

RPM_NAME = "vacuum-im-plugins-gmailnotify-1.0.5+git1518929179.2d687c8-1.27.aarch64.rpm"
RPM_HASH = "14ffc7a5ba73c7758b03b283f443d01a57a898f360d0011fd5a70d5575b3a8c2f19014d5d66185b3a4c056e4828cd1f18ab54846be6f70582a750f5551b66658"

RPROVIDES:${PN} += "libgmailnotify.so \
vacuum-im-plugins-gmailnotify"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvacuumutils.so.37"

inherit rpm
