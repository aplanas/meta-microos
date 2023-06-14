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

RPM_NAME = "litetran-1.3+git20161111-3.9.aarch64.rpm"
RPM_HASH = "8f13abb596b9dd36806526fa407df2e774f3e91aa0658597047345698ac802999ada1b2839b15114ef7184b81d0c9817bfbcecb90d38303fe3a720f9c824130b"

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
