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

PV = "5.0+git20230617.2a908f54"

RPM_NAME = "xpra-5.0+git20230617.2a908f54-1.2.aarch64.rpm"
RPM_HASH = "bfcd83edac553435a377423240d53548b5246631d51f35ff9b5aff186c86f73454e1658168d1b5522e5967e4277c336eb04071d66c32a3fe682e313b171535bf"

RPROVIDES:${PN} += "config-xpra \
python3.11dist-xpra \
python3dist-xpra \
xpra"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
dbus-1-x11 \
fillup \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-utils \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXRes.so.1 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXrandr.so.2 \
libXtst.so.6 \
libavcodec.so.59 \
libavformat.so.59 \
libavutil.so.57 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgobject-2.0.so.0 \
liblz4.so.1 \
libpam-misc.so.0 \
libpam.so.0 \
libprocps.so.8 \
libqrencode.so.4 \
libswscale.so.6 \
libsystemd.so.0 \
libturbojpeg.so.0 \
libvpx.so.8 \
libwebp.so.7 \
libxkbfile.so.1 \
pulseaudio-daemon \
pulseaudio-utils \
python-abi \
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
typelib-AppIndicator3 \
typelib-AyatanaAppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gst \
typelib-Gtk \
typelib-Notify \
typelib-Pango \
typelib-PangoCairo \
typelib-Rsvg \
xf86-video-dummy \
xorg-x11-xauth"

inherit rpm
