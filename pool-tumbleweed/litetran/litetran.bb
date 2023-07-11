SUMMARY = "A translator on Qt"
DESCRIPTION = "LiteTran is a GUI for text translation (like Yandex.Translate). \
 \
 * Translate by text selection: select text, press the key combination \
   (Ctrl+Shift+T by default), and get the translation result in \
   a pop-up. It will not be necessary to open a web browser for \
   translation. \
 * Text speech (up to 100 characters). \
 * 37 supported languages."
LICENSE = "GPL-3.0-or-later"

PV = "1.3+git20161111"

RPM_NAME = "litetran-1.3+git20161111-3.10.aarch64.rpm"
RPM_HASH = "bb6610d69b94ea3dee823a605f9fcc783a1a08716ad175fcf2094315afcdb2ec167f7f50e9e0c4fcbbffc73542593a7568e916df4af811c706a52dd9100c1902"

RPROVIDES:${PN} += "litetran"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
