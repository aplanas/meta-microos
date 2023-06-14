SUMMARY = "OpenGL window and compositing manager default plugins"
DESCRIPTION = "This package contains the default Compiz compositing manager \
plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-0.8.18-2.8.aarch64.rpm"
RPM_HASH = "6d4d5a9e9b6d4b2fd0df7b94994183c01f3c0e75ca6b85004f2f399eb63829b341340c2a17c7b4793d007fd5ebdd7e4847570df0b7bfa0fb638375af6f40bcb5"

RPROVIDES:${PN} += "compiz-plugins \
libannotate.so \
libblur.so \
libclone.so \
libcommands.so \
libcube.so \
libdbus.so \
libdecoration.so \
libfade.so \
libfs.so \
libglib.so \
libini.so \
libinotify.so \
libmatecompat.so \
libminimize.so \
libmove.so \
libobs.so \
libplace.so \
libpng.so \
libregex.so \
libresize.so \
librotate.so \
libscale.so \
libscreenshot.so \
libsvg.so \
libswitcher.so \
libwall.so \
libwater.so \
libwobbly.so \
libzoom.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXrender.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdecoration.so.0 \
libfuse.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpng16.so.16 \
librsvg-2.so.2 \
libxml2.so.2"

inherit rpm
