SUMMARY = "OpenGL window and compositing manager plugins"
DESCRIPTION = "This package contains the non-default Compiz compositing manager \
plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-main-0.8.18-1.15.aarch64.rpm"
RPM_HASH = "c8bac429710e293342eb4f1fc980ed3e638f7890eeae7c705a88dd5405a2f0a74397d4e967190f463817abbd197d01ed231b2060f18d01a15e8425a7a4cffb79"

RPROVIDES:${PN} += "compiz-plugins-main \
compiz-plugins-main(aarch-64) \
libanimation.so()(64bit) \
libcolorfilter.so()(64bit) \
libexpo.so()(64bit) \
libezoom.so()(64bit) \
libfocuspoll.so()(64bit) \
libimgjpeg.so()(64bit) \
libmag.so()(64bit) \
libmousepoll.so()(64bit) \
libneg.so()(64bit) \
libopacify.so()(64bit) \
libput.so()(64bit) \
libresizeinfo.so()(64bit) \
libring.so()(64bit) \
libscaleaddon.so()(64bit) \
libsession.so()(64bit) \
libshift.so()(64bit) \
libsnap.so()(64bit) \
libstaticswitcher.so()(64bit) \
libtext.so()(64bit) \
libthumbnail.so()(64bit) \
libtitleinfo.so()(64bit) \
libvpswitch.so()(64bit) \
libwinrules.so()(64bit) \
libworkarounds.so()(64bit)"

RDEPENDS:${PN} += "compiz-plugins \
ld-linux-aarch64.so.1()(64bit) \
libGLU.so.1()(64bit) \
libX11.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXrender.so.1()(64bit) \
libatspi.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
