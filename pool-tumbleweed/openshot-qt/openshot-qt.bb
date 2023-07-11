SUMMARY = "Non-linear video editor with broad format support"
DESCRIPTION = "OpenShot Video Editor is a non-linear video editor. It can create and \
edit videos and movies using many video, audio, and image formats."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.1"

RPM_NAME = "openshot-qt-3.1.1-1.1.noarch.rpm"
RPM_HASH = "2fecbb1ede76ef893a92e41bdf6caaa84bd559e2335339030c7faa935f5d2a098e3509ce02d0dbd5ba51281e45ed285134979cd129f5c4648c59e609a8928d06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openshot \
openshot-qt \
python3.11dist-openshot-qt \
python3dist-openshot-qt"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-openshot \
python3-pyxdg \
python3-pyzmq \
python3-qt5 \
python3-qtwebengine-qt5 \
python3-requests"

inherit rpm
