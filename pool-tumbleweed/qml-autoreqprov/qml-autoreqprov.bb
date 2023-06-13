SUMMARY = "Automatic dependency generator for QML files and modules"
DESCRIPTION = "Automatic dependency generator for QML files and modules. \
If installed, rpm uses this to generate Requires of .qml files \
and Provides of QML modules."
LICENSE = "GPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "qml-autoreqprov-1.1-2.6.noarch.rpm"
RPM_HASH = "1a5ee82f4fa68d21c3919501bef1bf9bc7e8ab3022e7e64fe3c10557d387aa4e2ab6eab4423c4c68c8eeebab9e077b38c16f95e3c091ee5fab3b3d2f8eb51786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qml-autoreqprov"

RDEPENDS:${PN} += "(libqt5-qtdeclarative-tools if libQtQuick5) \
(qmlpluginexports-qt5 if libqt5-qtdeclarative-devel) \
(qmlpluginexports-qt6 if qt6-qml-devel) \
(qt6-declarative-tools if libQt6Qml6) \
/bin/bash \
jq \
rpm"

inherit rpm
