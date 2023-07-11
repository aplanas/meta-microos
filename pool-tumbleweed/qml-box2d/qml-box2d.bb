SUMMARY = "QML Box2D plugin"
DESCRIPTION = "This plugin is meant to be installed to your Qt/imports directory, or shipped \
in a directory of which the parent is added as import path. \
 \
The goal is to expose the functionality of Box2D as QML components, in order \
to make it easy to write physics-based games in QML."
LICENSE = "Zlib"

PV = "0+git.1523004651.b7212d5"

RPM_NAME = "qml-box2d-0+git.1523004651.b7212d5-1.12.aarch64.rpm"
RPM_HASH = "c61ff95fbfffb74098b82cfef228c48d573a49b07729fd1fd2611314427e7d311f063ff609f2bd48fd7d58296bf3cf607763f16529cff5a57eff4c84747a1804"

RPROVIDES:${PN} += "libBox2D.so \
qml-box2d \
qt5qmlimport-Box2D.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
