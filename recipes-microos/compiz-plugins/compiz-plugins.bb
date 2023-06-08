SUMMARY = "OpenGL window and compositing manager default plugins"
DESCRIPTION = "This package contains the default Compiz compositing manager \
plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-0.8.18-2.8.aarch64.rpm"
RPM_HASH = "6d4d5a9e9b6d4b2fd0df7b94994183c01f3c0e75ca6b85004f2f399eb63829b341340c2a17c7b4793d007fd5ebdd7e4847570df0b7bfa0fb638375af6f40bcb5"

RPROVIDES:${PN} += "compiz-plugins compiz-plugins(aarch-64) libannotate.so()(64bit) libblur.so()(64bit) libclone.so()(64bit) libcommands.so()(64bit) libcube.so()(64bit) libdbus.so()(64bit) libdecoration.so()(64bit) libfade.so()(64bit) libfs.so()(64bit) libglib.so()(64bit) libini.so()(64bit) libinotify.so()(64bit) libmatecompat.so()(64bit) libminimize.so()(64bit) libmove.so()(64bit) libobs.so()(64bit) libplace.so()(64bit) libpng.so()(64bit) libregex.so()(64bit) libresize.so()(64bit) librotate.so()(64bit) libscale.so()(64bit) libscreenshot.so()(64bit) libsvg.so()(64bit) libswitcher.so()(64bit) libwall.so()(64bit) libwater.so()(64bit) libwobbly.so()(64bit) libzoom.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGLU.so.1()(64bit) libX11.so.6()(64bit) libXrender.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libdecoration.so.0()(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.4)(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) librsvg-2.so.2()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
