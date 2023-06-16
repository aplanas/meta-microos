SUMMARY = "Subtitle editor for GNOME"
DESCRIPTION = "Gnome Subtitles is a subtitle editor for the GNOME desktop. It supports \
the most common text-based subtitle formats and allows for subtitle \
editing, translation and synchronization."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.2"

RPM_NAME = "gnome-subtitles-1.7.2-1.7.aarch64.rpm"
RPM_HASH = "18e6b049384fcf2f53f39945d25cafc38d58162cefd139f073511b72815a9e096631a19adf29c4a48483790e5827746821d8640e0537b2d875a80ae9c52a2521"

RPROVIDES:${PN} += "gnome-subtitles \
libgst-backend.so \
mono-gnome-subtitles"

RDEPENDS:${PN} += "/usr/bin/bash \
gstreamer-plugins-base \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
mono-Mono.Posix \
mono-System \
mono-cairo-sharp \
mono-core \
mono-gdk-sharp \
mono-gio-sharp \
mono-glib-sharp \
mono-gtk-sharp \
mono-mscorlib \
mono-pango-sharp"

inherit rpm
