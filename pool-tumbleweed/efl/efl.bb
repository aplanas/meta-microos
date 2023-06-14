SUMMARY = "Enlightenment Foundation Libraries - set of libraries used (not only) by E17"
DESCRIPTION = "EFL is library collection providing various functionality used (not only) \
by Enlightenment 17, Terminology, Tizen mobile platform and much more."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & Zlib"

PV = "1.26.3"

RPM_NAME = "efl-1.26.3-30.6.aarch64.rpm"
RPM_HASH = "dca3abf6c0c392c1b057c5697d93939b06122833dc3d359dfe90d9ceb6ac5ca59220c6f10d8749d38d430cca494bf4e0706bf97ec67c58effb93428255d4a15b"

RPROVIDES:${PN} += "ecore \
edje \
edje-utils \
eet \
eeze \
efl \
efreet \
eina \
elementary \
embryo \
emotion \
ethumb \
evas \
libecore-audio.so.1 \
libecore-con.so.1 \
libecore-drm2.so.1 \
libecore-evas.so.1 \
libecore-fb.so.1 \
libecore-file.so.1 \
libecore-imf-evas.so.1 \
libecore-imf.so.1 \
libecore-input-evas.so.1 \
libecore-input.so.1 \
libecore-ipc.so.1 \
libecore-wl2.so.1 \
libecore-x.so.1 \
libecore.so.1 \
libecore1 \
libector.so.1 \
libector1 \
libedje.so.1 \
libedje1 \
libeet.so.1 \
libeet1 \
libeeze.so.1 \
libeeze1 \
libefl-canvas-wl.so.1 \
libefl.so.1 \
libefl1 \
libefreet-mime.so.1 \
libefreet-mime1 \
libefreet-trash.so.1 \
libefreet-trash1 \
libefreet.so.1 \
libefreet1 \
libeina.so.1 \
libeina1 \
libeio.so.1 \
libeio1 \
libeldbus.so.1 \
libeldbus1 \
libelementary.so.1 \
libelementary1 \
libelput.so.1 \
libelput1 \
libelua1 \
libembryo.so.1 \
libembryo1 \
libemile.so.1 \
libemile1 \
libemotion.so.1 \
libemotion1 \
libeo.so.1 \
libeo1 \
libeolian.so.1 \
libeolian1 \
libephysics.so.1 \
libephysics1 \
libethumb-client.so.1 \
libethumb-client1 \
libethumb.so.1 \
libethumb1 \
libevas.so.1 \
libevas1 \
libexactness-play.so.1 \
libexactness-record.so.1"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
ld-linux-aarch64.so.1 \
libBulletCollision.so.3.17 \
libBulletDynamics.so.3.17 \
libBulletSoftBody.so.3.17 \
libEGL.so.1 \
libGLESv2.so.2 \
libLinearMath.so.3.17 \
libX11-xcb.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libXss.so.1 \
libXtst.so.6 \
libc.so.6 \
libcrypto.so.3 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libgbm.so.1 \
libgcc-s.so.1 \
libgif.so.7 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libharfbuzz.so.0 \
libinput.so.10 \
libjpeg.so.8 \
libluajit-5.1.so.2 \
libm.so.6 \
libmount.so.1 \
libopenjp2.so.7 \
libpng16.so.16 \
libssl.so.3 \
libstdc++.so.6 \
libtiff.so.6 \
libudev.so.1 \
libunwind-aarch64.so.8 \
libunwind.so.8 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libwayland-server.so.0 \
libwebp.so.7 \
libwebpdemux.so.2 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libz.so.1 \
systemd"

inherit rpm
