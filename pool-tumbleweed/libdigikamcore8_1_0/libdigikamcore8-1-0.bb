SUMMARY = "The main digikam libraries"
DESCRIPTION = "The main digikam libraries that are being shared between showfoto and digikam"
LICENSE = "GPL-2.0-or-later"

PV = "8.1.0"

RPM_NAME = "libdigikamcore8_1_0-8.1.0-2.1.aarch64.rpm"
RPM_HASH = "37992d61dcced29e870c48896128f16589f08c8100301b690090d3616c6c9f4cc7c40f6dd571fb9807d2c980a0c30ea6a52b184cf9d66b6078ba0fb78310e43f"

RPROVIDES:${PN} += "libdigikamcore.so.8.1.0 \
libdigikamcore8-1-0 \
libdigikamdatabase.so.8.1.0 \
libdigikamgui.so.8.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiContact.so.5 \
libOpenGL.so.0 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5OpenGL.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libXext.so.6 \
libavcodec.so.60 \
libavdevice.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libexiv2.so.28 \
libexpat.so.1 \
libgcc-s.so.1 \
libgomp.so.1 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libheif.so.1 \
libjpeg.so.8 \
liblcms2.so.2 \
liblensfun.so.1 \
liblqr-1.so.0 \
libm.so.6 \
libmarblewidget-qt5.so.28 \
libopencv-core.so.407 \
libopencv-dnn.so.407 \
libopencv-imgcodecs.so.407 \
libopencv-imgproc.so.407 \
libopencv-ml.so.407 \
libpng16.so.16 \
libpulse.so.0 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7 \
libz.so.1"

inherit rpm
