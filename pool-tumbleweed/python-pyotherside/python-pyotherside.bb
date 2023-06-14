SUMMARY = "Asynchronous Python 3 Bindings for Qt 5"
DESCRIPTION = "A QML Plugin that provides access to a Python 3 interpreter from QML."
LICENSE = "ISC"

PV = "1.5.9"

RPM_NAME = "python-pyotherside-1.5.9-1.26.aarch64.rpm"
RPM_HASH = "816c886ab4ad957afab30762535f61c9195b904080e936550be99b280127fdb215b432439c4d08f30519622df4eddb0f8eae0678ef09cbcaa509832ef20549f5"

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
libpython3.10.so.1.0 \
libstdc++.so.6"

inherit rpm
