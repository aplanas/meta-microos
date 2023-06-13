SUMMARY = "GMailNotify plugin for Vacuum-IM"
DESCRIPTION = "Vacuum-IM plugin for gmail notifications."
LICENSE = "GPL-3.0"

PV = "1.0.5+git1518929179.2d687c8"

RPM_NAME = "vacuum-im-plugins-gmailnotify-1.0.5+git1518929179.2d687c8-1.26.aarch64.rpm"
RPM_HASH = "be4892b601ecf825e258d4bb94ec8c572b340da840de0476ff5a77b72ee4f196e79d449cfab7076492dc5d2b5d9ccf3c1aad0ab89072a521a068b5bc33b3e7c1"

RPROVIDES:${PN} += "libgmailnotify.so()(64bit) \
vacuum-im-plugins-gmailnotify \
vacuum-im-plugins-gmailnotify(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libvacuumutils.so.37()(64bit)"

inherit rpm
