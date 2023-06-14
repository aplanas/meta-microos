SUMMARY = "The BibTeX (Latex) bibliography manager by KDE"
DESCRIPTION = "KBibTeX is a BibTeX editor by KDE to edit bibliographies used with \
LaTeX. Features include comfortable input masks, starting web queries \
(e. g. Google or PubMed) and exporting to PDF, PostScript, RTF and \
XML/HTML. As KBibTeX is using KDE's KParts technology, KBibTeX can be \
embedded into Kile or Konqueror."
LICENSE = "GPL-2.0-only"

PV = "0.9.3.2"

RPM_NAME = "kbibtex-0.9.3.2-1.4.aarch64.rpm"
RPM_HASH = "236fcc4a023bc0303c21618caf6ef5a0c2b80e3d1255e57e86cf8062f0484bc3ea8ef9f5e3ad67c76e4a2c8261c9cc4fc8bf7dda0bc8eb49d94c765480a69b11"

RPROVIDES:${PN} += "kbibtex \
libkbibtexconfig.so.0 \
libkbibtexdata.so.0 \
libkbibtexgui.so.0 \
libkbibtexio.so.0 \
libkbibtexnetworking.so.0 \
libkbibtexproc.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5TextEditor.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libicui18n.so.73 \
libicuuc.so.73 \
libpoppler-qt5.so.1 \
libqoauth.so.2 \
libstdc++.so.6 \
shared-mime-info"

inherit rpm
