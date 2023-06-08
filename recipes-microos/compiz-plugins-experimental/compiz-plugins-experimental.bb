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

RPROVIDES:${PN} += "compiz-plugin-photowheel compiz-plugins-experimental compiz-plugins-experimental(aarch-64) compiz-plugins-git compiz-plugins-unsupported libanaglyph.so()(64bit) libanimationsim.so()(64bit) libatlantis.so()(64bit) libcubemodel.so()(64bit) libdialog.so()(64bit) libearth.so()(64bit) libelements.so()(64bit) libfakeargb.so()(64bit) libfireflies.so()(64bit) libfreewins.so()(64bit) libghost.so()(64bit) libmswitch.so()(64bit) libphoto.so()(64bit) libputplus.so()(64bit) libscreensaver.so()(64bit) libsmartput.so()(64bit) libsnow.so()(64bit) libsnowglobe.so()(64bit) libstackswitch.so()(64bit) libstar.so()(64bit) libstatic.so()(64bit) libswap.so()(64bit) libthrow.so()(64bit) libtile.so()(64bit) libtoggledeco.so()(64bit) libwizard.so()(64bit)"
RDEPENDS:${PN} += "compiz compiz-plugins-extra compiz-plugins-main ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLEW.so.2.2()(64bit) libGLU.so.1()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXss.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
