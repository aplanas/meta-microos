SUMMARY = "Multi-Page Scanning Application"
DESCRIPTION = "Skanpage is a simple scanning application designed for \
multi-page scanning and saving of documents and images. \
 \
Features: \
- Scanning from flatbed and ADF scanners \
- Configurable options for scanning device \
- Reordering, rotation and deletion of scanned pages \
- Saving to multi-page PDF documents and image files"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "skanpage-23.08.0-2.1.aarch64.rpm"
RPM_HASH = "0e977606382a5278d15d219c5b8555ccfe550b76f601cd947280d038ed4a5088cfda21f53480725ca345bebf33d09e96c9629dd4fdaf4a6ab8c25d371ed0364a"

RPROVIDES:${PN} += "skanpage"

RDEPENDS:${PN} += "kirigami2 \
kquickimageeditor-imports \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5XmlGui.so.5 \
libKSaneCore.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleptonica.so.6 \
libqt5-qtquickcontrols \
libstdc++.so.6 \
libtesseract.so.5"

inherit rpm
