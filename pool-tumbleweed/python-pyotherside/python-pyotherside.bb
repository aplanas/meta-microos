SUMMARY = "Asynchronous Python 3 Bindings for Qt 5"
DESCRIPTION = "A QML Plugin that provides access to a Python 3 interpreter from QML."
LICENSE = "ISC"

PV = "1.5.9"

RPM_NAME = "python-pyotherside-1.5.9-1.28.aarch64.rpm"
RPM_HASH = "f61ebfa0c89a15d9c50d4c507689bb7d9671d137ecb1329ceb9cc61b01bbaac73dedf5b91b665335a66f194c22fa22d80003228749e0093ac3dcb7806918902b"

RPROVIDES:${PN} += "libpyothersideplugin.so \
pyotherside \
python-pyotherside \
python3-pyotherside \
qt5qmlimport-io.thp.pyotherside.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Svg.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6"

inherit rpm
