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

PV = "23.04.1"

RPM_NAME = "skanpage-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a40b71a3971c18ae124bc75e777fbcdcc2942cbc64452bb7f5176dae7155a8cccd7ca95e2485b08ac9c77b38992457ba6905c0eb19e9c541d24e72b18638cb44"

RPROVIDES:${PN} += "skanpage"

RDEPENDS:${PN} += "kirigami2 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
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
libtesseract.so.5.3.0"

inherit rpm
