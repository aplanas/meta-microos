SUMMARY = "A background browser and setter for X windows"
DESCRIPTION = " \
Nitrogen is a background browser and setter for X windows. It is written \
in C++ using the gtkmm toolkit. It can be used in two modes: browser and \
recall. Some of the features are: \
 \
* Multihead and Xinerama aware. \
* Recall mode to used via startup script. \
* Uses freedesktop.org standard for thumbnails. \
* Can set GNOME background. \
* Command line set modes for script use. \
* Inotify monitoring of browse directory. \
* Lazy loading of thumbnails - conserves memory . \
* 'Automatic' set mode - determines best mode to set an image based on \
  its size. \
* Display preview images in a tiled icon layout"
LICENSE = "GPL-2.0-only & CC-BY-SA-3.0"

PV = "1.6.1"

RPM_NAME = "nitrogen-1.6.1-1.23.aarch64.rpm"
RPM_HASH = "43c27bc05e79fe9bdf49a1cfa0ca79a2fa63e237676172b42806ae02ef8fd4497f9aede11a6e3289a0eeb5fd27e892d390af8e4a3cbecb87d47bce04efa096c2"

RPROVIDES:${PN} += "nitrogen"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXinerama.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libgdkmm-2.4.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtkmm-2.4.so.1 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
