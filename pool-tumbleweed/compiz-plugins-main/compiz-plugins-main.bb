SUMMARY = "OpenGL window and compositing manager plugins"
DESCRIPTION = "This package contains the non-default Compiz compositing manager \
plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-main-0.8.18-1.15.aarch64.rpm"
RPM_HASH = "c8bac429710e293342eb4f1fc980ed3e638f7890eeae7c705a88dd5405a2f0a74397d4e967190f463817abbd197d01ed231b2060f18d01a15e8425a7a4cffb79"

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
