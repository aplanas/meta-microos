SUMMARY = "Enlightenment Foundation Libraries - set of libraries used (not only) by E17"
DESCRIPTION = "EFL is library collection providing various functionality used (not only) \
by Enlightenment 17, Terminology, Tizen mobile platform and much more."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & Zlib"

PV = "1.26.3"

RPM_NAME = "efl-1.26.3-30.6.aarch64.rpm"
RPM_HASH = "dca3abf6c0c392c1b057c5697d93939b06122833dc3d359dfe90d9ceb6ac5ca59220c6f10d8749d38d430cca494bf4e0706bf97ec67c58effb93428255d4a15b"

RPROVIDES:${PN} += "application() \
application(elementary_config.desktop) \
application(elementary_perf.desktop) \
application(elementary_test.desktop) \
ecore \
edje \
edje-utils \
eet \
eeze \
efl \
efl(aarch-64) \
efreet \
eina \
elementary \
embryo \
emotion \
ethumb \
evas \
libecore.so.1()(64bit) \
libecore1 \
libecore_audio.so.1()(64bit) \
libecore_con.so.1()(64bit) \
libecore_drm2.so.1()(64bit) \
libecore_evas.so.1()(64bit) \
libecore_fb.so.1()(64bit) \
libecore_file.so.1()(64bit) \
libecore_imf.so.1()(64bit) \
libecore_imf_evas.so.1()(64bit) \
libecore_input.so.1()(64bit) \
libecore_input_evas.so.1()(64bit) \
libecore_ipc.so.1()(64bit) \
libecore_wl2.so.1()(64bit) \
libecore_x.so.1()(64bit) \
libector.so.1()(64bit) \
libector1 \
libedje.so.1()(64bit) \
libedje1 \
libeet.so.1()(64bit) \
libeet1 \
libeeze.so.1()(64bit) \
libeeze1 \
libefl.so.1()(64bit) \
libefl1 \
libefl_canvas_wl.so.1()(64bit) \
libefreet.so.1()(64bit) \
libefreet1 \
libefreet_mime.so.1()(64bit) \
libefreet_mime1 \
libefreet_trash.so.1()(64bit) \
libefreet_trash1 \
libeina.so.1()(64bit) \
libeina1 \
libeio.so.1()(64bit) \
libeio1 \
libeldbus.so.1()(64bit) \
libeldbus1 \
libelementary.so.1()(64bit) \
libelementary1 \
libelput.so.1()(64bit) \
libelput1 \
libelua1 \
libembryo.so.1()(64bit) \
libembryo1 \
libemile.so.1()(64bit) \
libemile1 \
libemotion.so.1()(64bit) \
libemotion1 \
libeo.so.1()(64bit) \
libeo1 \
libeolian.so.1()(64bit) \
libeolian1 \
libephysics.so.1()(64bit) \
libephysics1 \
libethumb.so.1()(64bit) \
libethumb1 \
libethumb_client.so.1()(64bit) \
libethumb_client1 \
libevas.so.1()(64bit) \
libevas1 \
libexactness_play.so.1()(64bit) \
libexactness_record.so.1()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
libBulletCollision.so.3.17()(64bit) \
libBulletDynamics.so.3.17()(64bit) \
libBulletSoftBody.so.3.17()(64bit) \
libEGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libLinearMath.so.3.17()(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXcursor.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
libXss.so.1()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libfribidi.so.0()(64bit) \
libgbm.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgif.so.7()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libinput.so.10()(64bit) \
libjpeg.so.8()(64bit) \
libluajit-5.1.so.2()(64bit) \
libm.so.6()(64bit) \
libmount.so.1()(64bit) \
libopenjp2.so.7()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libudev.so.1(LIBUDEV_199)(64bit) \
libunwind-aarch64.so.8()(64bit) \
libunwind.so.8()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-egl.so.1()(64bit) \
libwayland-server.so.0()(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libxkbcommon-x11.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libz.so.1()(64bit) \
systemd"

inherit rpm
