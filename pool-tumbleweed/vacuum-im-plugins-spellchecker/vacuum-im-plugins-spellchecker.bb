SUMMARY = "Vacuum-IM spellchecker plugin"
DESCRIPTION = "Highlights words that may not be spelled correctly."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1571036065.9f3952b2"

RPM_NAME = "vacuum-im-plugins-spellchecker-1.3.0+git1571036065.9f3952b2-1.21.aarch64.rpm"
RPM_HASH = "514dbc315c40b0cdb2cf08a88b27e191485094f151ef1046d21cb9985c466019bd4e414fd285ae3130105de1a5f93b76f3335e09ec156ceea7f1300f8e056800"

RPROVIDES:${PN} += "libspellchecker.so \
vacuum-im-plugins-spellchecker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libstdc++.so.6 \
libvacuumutils.so.37 \
libvacuumutils37 \
vacuum-im"

inherit rpm
