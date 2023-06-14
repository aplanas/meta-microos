SUMMARY = "OpenGL window and compositing manager experimental plugins"
DESCRIPTION = "This package contains the experimental Compiz compositing \
manager plugins. \
 \
Contains: \
 * Atlantis: Render some sea animals inside of the transparent cube. \
 * Cubemodel: Render still/animated 3D mesh models inside of the \
   transparent cube. \
 * Elements: Draw elements on screen. \
 * Fakeargb: Makes a special colour of a window transparent. \
 * Mswitch: Enables the switching of viewports with mouse gestures. \
 * Snow: Displays falling snow over the desktop and windows. \
 * Tile: Enables the tiling of windows on the desktop in a manner \
   similar to awesome. \
 * ... and more."
LICENSE = "GPL-2.0-or-later & GPL-2.0-only"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-experimental-0.8.18-1.16.aarch64.rpm"
RPM_HASH = "b1dde7d2cf98d33921de43c797792750216202cb8edda1dc05b1a8c1b5e5729f3b44b31875ebd8761caea77c2bd8b6397868a2dfe804d32ae0ed7b8491a64c64"

RPROVIDES:${PN} += "compiz-plugin-photowheel \
compiz-plugins-experimental \
compiz-plugins-git \
compiz-plugins-unsupported \
libanaglyph.so \
libanimationsim.so \
libatlantis.so \
libcubemodel.so \
libdialog.so \
libearth.so \
libelements.so \
libfakeargb.so \
libfireflies.so \
libfreewins.so \
libghost.so \
libmswitch.so \
libphoto.so \
libputplus.so \
libscreensaver.so \
libsmartput.so \
libsnow.so \
libsnowglobe.so \
libstackswitch.so \
libstar.so \
libstatic.so \
libswap.so \
libthrow.so \
libtile.so \
libtoggledeco.so \
libwizard.so"

RDEPENDS:${PN} += "compiz \
compiz-plugins-extra \
compiz-plugins-main \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libGLU.so.1 \
libX11.so.6 \
libXext.so.6 \
libXss.so.1 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
