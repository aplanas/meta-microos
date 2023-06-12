SUMMARY = "The main digikam libraries"
DESCRIPTION = "The main digikam libraries that are being shared between showfoto and digikam"
LICENSE = "GPL-2.0-or-later"

PV = "8.0.0"

RPM_NAME = "libdigikamcore8_0_0-8.0.0-3.2.aarch64.rpm"
RPM_HASH = "f27ed0a3e1283456a675aedaf1d46ed88e9b1349f761e4eccb12d9aefbe5493607052b7c26c025b5ee55da9ce64faa60e859ad586d6cece7858ac26897ff7d82"

RPROVIDES:${PN} += "libdigikamcore.so.8.0.0()(64bit) \
libdigikamcore8_0_0 \
libdigikamcore8_0_0(aarch-64) \
libdigikamdatabase.so.8.0.0()(64bit) \
libdigikamgui.so.8.0.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5FileMetaData.so.3()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5SonnetCore.so.5()(64bit) \
libKF5SonnetUi.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5AkonadiContact.so.5()(64bit) \
libMagick++-7.Q16HDRI.so.5()(64bit) \
libMagickCore-7.Q16HDRI.so.10()(64bit) \
libMagickWand-7.Q16HDRI.so.10()(64bit) \
libMagickWand-7.Q16HDRI.so.10(VERS_10.0)(64bit) \
libOpenGL.so.0()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5OpenGL.so.5()(64bit) \
libQt5OpenGL.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libavcodec.so.59()(64bit) \
libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) \
libavdevice.so.59()(64bit) \
libavdevice.so.59(LIBAVDEVICE_59.7_SUSE)(64bit) \
libavfilter.so.8()(64bit) \
libavfilter.so.8(LIBAVFILTER_8.44_SUSE)(64bit) \
libavformat.so.59()(64bit) \
libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) \
libavutil.so.57()(64bit) \
libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexiv2.so.27()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(GOMP_4.5)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libgphoto2.so.6()(64bit) \
libgphoto2_port.so.12()(64bit) \
libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) \
libheif.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
liblensfun.so.1()(64bit) \
liblqr-1.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libmarblewidget-qt5.so.28()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_dnn.so.407()(64bit) \
libopencv_imgcodecs.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libopencv_ml.so.407()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libswresample.so.4.ff5()(64bit) \
libswresample.so.4.ff5(LIBSWRESAMPLE_4.7_SUSE)(64bit) \
libswscale.so.6()(64bit) \
libswscale.so.6(LIBSWSCALE_6.7_SUSE)(64bit) \
libz.so.1()(64bit)"

inherit rpm