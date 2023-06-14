SUMMARY = "Vacuum-IM spellchecker plugin"
DESCRIPTION = "Highlights words that may not be spelled correctly."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1571036065.9f3952b2"

RPM_NAME = "vacuum-im-plugins-spellchecker-1.3.0+git1571036065.9f3952b2-1.20.aarch64.rpm"
RPM_HASH = "dbd288518619b4171b363209d49b2fa98475ba96d81df21bc26e2fead8aa16c451654a88e7f37ffe73f6db998253360929bf406382eb2bbfb60e392bd183b937"

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
