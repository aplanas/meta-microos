SUMMARY = "OpenGL window and compositing manager plugins"
DESCRIPTION = "This package contains the non-default Compiz compositing manager \
plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-main-0.8.18-1.16.aarch64.rpm"
RPM_HASH = "e7a492b71c85686cc93a8581091430e1183e7681a11de8f7a94dd516d2ed286b3feab7a47cbd5192ba8a4d73c1cc007b0993fb251ffa0261857a85854d25ec7c"

RPROVIDES:${PN} += "compiz-plugins-main \
libanimation.so \
libcolorfilter.so \
libexpo.so \
libezoom.so \
libfocuspoll.so \
libimgjpeg.so \
libmag.so \
libmousepoll.so \
libneg.so \
libopacify.so \
libput.so \
libresizeinfo.so \
libring.so \
libscaleaddon.so \
libsession.so \
libshift.so \
libsnap.so \
libstaticswitcher.so \
libtext.so \
libthumbnail.so \
libtitleinfo.so \
libvpswitch.so \
libwinrules.so \
libworkarounds.so"

RDEPENDS:${PN} += "compiz-plugins \
ld-linux-aarch64.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libXrender.so.1 \
libatspi.so.0 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
