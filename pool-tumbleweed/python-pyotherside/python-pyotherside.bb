SUMMARY = "Asynchronous Python 3 Bindings for Qt 5"
DESCRIPTION = "A QML Plugin that provides access to a Python 3 interpreter from QML."
LICENSE = "ISC"

PV = "1.5.9"

RPM_NAME = "python-pyotherside-1.5.9-1.26.aarch64.rpm"
RPM_HASH = "816c886ab4ad957afab30762535f61c9195b904080e936550be99b280127fdb215b432439c4d08f30519622df4eddb0f8eae0678ef09cbcaa509832ef20549f5"

RPROVIDES:${PN} += "libpyothersideplugin.so()(64bit) \
pyotherside \
python-pyotherside \
python-pyotherside(aarch-64) \
python3-pyotherside \
qt5qmlimport(io.thp.pyotherside.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
