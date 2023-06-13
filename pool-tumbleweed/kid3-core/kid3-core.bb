SUMMARY = "Efficient ID3 Tag Editor: Libraries and Data"
DESCRIPTION = "This package contains common libraries and data files used by kid3, kid3-qt, and kid3-cli."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.3"

RPM_NAME = "kid3-core-3.9.3-1.3.aarch64.rpm"
RPM_HASH = "100b479fa29ee80d039db3ca901aea47e200686439d4096430bc8af6f521d79102cf3ca6b9a57ab9df894f22800e0b6b6c7d293783ffaf693436b7290868c41a"

RPROVIDES:${PN} += "config(kid3-core) \
kid3-core \
kid3-core(aarch-64) \
libacoustidimport.so()(64bit) \
libamazonimport.so()(64bit) \
libdiscogsimport.so()(64bit) \
libfreedbimport.so()(64bit) \
libid3libmetadata.so()(64bit) \
libkid3-core.so()(64bit) \
libkid3-gui.so()(64bit) \
libkid3qml.so()(64bit) \
libmusicbrainzimport.so()(64bit) \
liboggflacmetadata.so()(64bit) \
libqmlcommand.so()(64bit) \
libtaglibmetadata.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC++.so.10()(64bit) \
libFLAC.so.12()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libchromaprint.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libid3-3.8.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libogg.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libswresample.so.3.9()(64bit) \
libswresample.so.3.9(LIBSWRESAMPLE_3)(64bit) \
libtag.so.1()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisfile.so.3()(64bit) \
qt5qmlimport(QtQml.2) \
qt5qmlimport(QtQuick.2)"

inherit rpm
