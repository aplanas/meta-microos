SUMMARY = "Qt5/KDE Frameworks interface for LibreOffice"
DESCRIPTION = "This package contains Qt5/KDE Frameworks interface rendering options for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-qt5-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "2d1bd706e739f01de685deff8519264ca4073f8f17ddb4a499ae6cc2c69137a2db8df8e88d34c7dd58c13be785304b63bf105c055b4847ed0befc6e59fd517a6"

RPROVIDES:${PN} += "libkf5be1lo.so()(64bit) \
libreoffice-kde4 \
libreoffice-qt5 \
libreoffice-qt5(aarch-64) \
libvclplug_gtk3_kde5lo.so()(64bit) \
libvclplug_kf5lo.so()(64bit) \
libvclplug_qt5lo.so()(64bit) \
metainfo() \
metainfo(org.libreoffice.kde.metainfo.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libepoxy.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libi18nlangtag.so()(64bit) \
libjvmaccesslo.so()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmergedlo.so()(64bit) \
libpango-1.0.so.0()(64bit) \
libreoffice \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libuno_cppu.so.3()(64bit) \
libuno_cppu.so.3(LIBO_UDK_4.4)(64bit) \
libuno_cppu.so.3(UDK_3.1)(64bit) \
libuno_cppu.so.3(UDK_3_0_0)(64bit) \
libuno_cppuhelpergcc3.so.3()(64bit) \
libuno_cppuhelpergcc3.so.3(LIBO_UDK_3.9)(64bit) \
libuno_cppuhelpergcc3.so.3(UDK_3.6)(64bit) \
libuno_cppuhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libuno_sal.so.3()(64bit) \
libuno_sal.so.3(LIBO_UDK_3.6)(64bit) \
libuno_sal.so.3(LIBO_UDK_4.0)(64bit) \
libuno_sal.so.3(LIBO_UDK_4.1)(64bit) \
libuno_sal.so.3(LIBO_UDK_4.2)(64bit) \
libuno_sal.so.3(LIBO_UDK_5.1)(64bit) \
libuno_sal.so.3(PRIVATE_1.6)(64bit) \
libuno_sal.so.3(UDK_3.1)(64bit) \
libuno_sal.so.3(UDK_3.3)(64bit) \
libuno_sal.so.3(UDK_3.6)(64bit) \
libuno_sal.so.3(UDK_3.8)(64bit) \
libuno_sal.so.3(UDK_3_0_0)(64bit) \
libuno_salhelpergcc3.so.3()(64bit) \
libuno_salhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libvclplug_genlo.so()(64bit) \
libxcb-icccm.so.4()(64bit) \
libxcb.so.1()(64bit) \
rtld(GNU_HASH)"

inherit rpm
