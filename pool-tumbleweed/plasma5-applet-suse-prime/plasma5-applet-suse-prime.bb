SUMMARY = "Plasma 5 applet for controlling SUSE Prime"
DESCRIPTION = "A Plasma 5 applet for controlling SUSE Prime."
LICENSE = "Unlicense"

PV = "1.1"

RPM_NAME = "plasma5-applet-suse-prime-1.1-3.5.noarch.rpm"
RPM_HASH = "60837eb1c0fc62562d0fe26c6d0e552f1b789ccd68b9814c87b034063f214a2ea30b8ae7c1b91d499d6fa2d6f9b37400cdb97344e1213068094e09ef659fdbc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metainfo() \
metainfo(org.kde.plasma.prime.appdata.xml) \
plasma5-applet-suse-prime"

RDEPENDS:${PN} += "kdialog \
libqt5-qdbus \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.plasma.components.2) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.extras.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2)"

inherit rpm
