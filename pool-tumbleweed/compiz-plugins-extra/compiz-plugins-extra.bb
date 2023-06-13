SUMMARY = "OpenGL window and compositing manager community extra plugins"
DESCRIPTION = "This package contains the community extra Compiz compositing \
manager plugins. \
 \
Contains: addhelper crashhandler extrawm firepaint goto-viewport \
mswitch scalefilter splash bench cubereflex fadedesktop gears group \
mblur reflex showdesktop trailfocus."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-extra-0.8.18-1.15.aarch64.rpm"
RPM_HASH = "7c03984e9cebe6903299ef6e1b206b5d337b585e8f1f8406387652052d19e56bd28f57bec39d985a00b484a45a803067f41394d5b88aa1bd4bd010b6acd15621"

RPROVIDES:${PN} += "compiz-fusion-plugins-extra \
compiz-plugins-extra \
compiz-plugins-extra(aarch-64) \
lib3d.so()(64bit) \
libaddhelper.so()(64bit) \
libanimationaddon.so()(64bit) \
libbench.so()(64bit) \
libbicubic.so()(64bit) \
libcrashhandler.so()(64bit) \
libcubeaddon.so()(64bit) \
libextrawm.so()(64bit) \
libfadedesktop.so()(64bit) \
libfirepaint.so()(64bit) \
libgears.so()(64bit) \
libgrid.so()(64bit) \
libgroup.so()(64bit) \
libhighlightcontent.so()(64bit) \
libloginout.so()(64bit) \
libmaximumize.so()(64bit) \
libmblur.so()(64bit) \
libnotification.so()(64bit) \
libreflex.so()(64bit) \
libscalefilter.so()(64bit) \
libshelf.so()(64bit) \
libshowdesktop.so()(64bit) \
libshowmouse.so()(64bit) \
libsplash.so()(64bit) \
libtrailfocus.so()(64bit) \
libvidcap.so()(64bit) \
libwallpaper.so()(64bit) \
libwidget.so()(64bit) \
libworkspacenames.so()(64bit)"

RDEPENDS:${PN} += "compiz \
compiz-plugins-main \
ld-linux-aarch64.so.1()(64bit) \
libGLU.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnotify.so.4()(64bit)"

inherit rpm
