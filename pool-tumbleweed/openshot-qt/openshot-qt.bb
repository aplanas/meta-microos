SUMMARY = "Non-linear video editor with broad format support"
DESCRIPTION = "OpenShot Video Editor is a non-linear video editor. It can create and \
edit videos and movies using many video, audio, and image formats."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.0"

RPM_NAME = "openshot-qt-3.1.0-1.1.noarch.rpm"
RPM_HASH = "322cc9e5a07bf27b40de219ef1c3d78cbcffed49b4e172735f12fc502e26e9587911a41d8c019c4e39ffbc484eab29131e203c5cc1eca75ecc8e6a60eb6d5e30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openshot \
openshot-qt \
python3.10dist-openshot-qt \
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
