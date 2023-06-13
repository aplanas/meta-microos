SUMMARY = "Remote display server for applications and desktops"
DESCRIPTION = "Xpra is 'screen for X': it allows you to run X programs, usually on a remote \
host, direct their display to your local machine, and then to disconnect from \
these programs and reconnect from the same or another machine, without losing \
any state. It gives you remote access to individual applications. \
 \
Xpra is 'rootless' or 'seamless': programs you run under it show up on your \
desktop as regular programs, managed by your regular window manager. \
Sessions can be accessed over SSH, or password protected over plain TCP sockets. \
Xpra is usable over reasonably slow links and does its best to adapt to changing \
network bandwidth constraints."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-3.0-or-later & MIT"

PV = "5.0+git20221127.3e61ef1c"

RPM_NAME = "xpra-5.0+git20221127.3e61ef1c-2.5.aarch64.rpm"
RPM_HASH = "8cd529d1646f1460ef80123c141339475174f90061dbe3ab0de204e85fbd62ffccf65f3f05562fbd0890798989d765a388c6e37859cc65f34b672037a00efe05"

RPROVIDES:${PN} += "application() \
application(xpra-gui.desktop) \
application(xpra-launcher.desktop) \
application(xpra-shadow.desktop) \
application(xpra.desktop) \
config(xpra) \
metainfo() \
metainfo(xpra.appdata.xml) \
mimehandler(application/x-xpraconfig) \
mimehandler(x-scheme-handler/xpra) \
mimehandler(x-scheme-handler/xpra+ssh) \
mimehandler(x-scheme-handler/xpra+ssl) \
mimehandler(x-scheme-handler/xpra+tcp) \
mimehandler(x-scheme-handler/xpra+tls) \
mimehandler(x-scheme-handler/xpra+ws) \
mimehandler(x-scheme-handler/xpra+wss) \
mimehandler(x-scheme-handler/xpras) \
mimehandler(x-scheme-handler/xprassh) \
mimehandler(x-scheme-handler/xprassl) \
mimehandler(x-scheme-handler/xpratcp) \
mimehandler(x-scheme-handler/xpratls) \
mimehandler(x-scheme-handler/xpraws) \
mimehandler(x-scheme-handler/xprawss) \
python3.10dist(xpra) \
python3dist(xpra) \
xpra \
xpra(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/touch \
dbus-1-x11 \
fillup \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-utils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXRes.so.1()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libavcodec.so.59()(64bit) \
libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) \
libavformat.so.59()(64bit) \
libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) \
libavutil.so.57()(64bit) \
libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) \
libbrotlidec.so.1()(64bit) \
libbrotlienc.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
liblz4.so.1()(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpam_misc.so.0()(64bit) \
libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) \
libprocps.so.8()(64bit) \
libprocps.so.8(LIBPROCPS_0)(64bit) \
libqrencode.so.4()(64bit) \
libswscale.so.6()(64bit) \
libswscale.so.6(LIBSWSCALE_6.7_SUSE)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libturbojpeg.so.0()(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.0)(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.2)(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.4)(64bit) \
libvpx.so.8()(64bit) \
libwebp.so.7()(64bit) \
libxkbfile.so.1()(64bit) \
pulseaudio-daemon \
pulseaudio-utils \
python(abi) \
python3-Pillow \
python3-cairo \
python3-dbus-python \
python3-gobject-Gdk \
python3-gst \
python3-lz4 \
python3-opencv \
python3-pycups \
python3-rencode \
shared-mime-info \
typelib(AppIndicator3) \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(GdkX11) \
typelib(Gio) \
typelib(Gst) \
typelib(Gtk) \
typelib(Notify) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(Rsvg) \
xf86-video-dummy \
xorg-x11-xauth"

inherit rpm
