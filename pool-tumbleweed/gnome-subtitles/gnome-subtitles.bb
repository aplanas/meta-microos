SUMMARY = "Subtitle editor for GNOME"
DESCRIPTION = "Gnome Subtitles is a subtitle editor for the GNOME desktop. It supports \
the most common text-based subtitle formats and allows for subtitle \
editing, translation and synchronization."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.2"

RPM_NAME = "gnome-subtitles-1.7.2-1.7.aarch64.rpm"
RPM_HASH = "18e6b049384fcf2f53f39945d25cafc38d58162cefd139f073511b72815a9e096631a19adf29c4a48483790e5827746821d8640e0537b2d875a80ae9c52a2521"

RPROVIDES:${PN} += "application() \
application(org.gnome.GnomeSubtitles.desktop) \
gnome-subtitles \
gnome-subtitles(aarch-64) \
libgst_backend.so()(64bit) \
metainfo() \
metainfo(org.gnome.GnomeSubtitles.appdata.xml) \
mimehandler(application/x-subrip) \
mimehandler(text/vtt) \
mimehandler(text/x-microdvd) \
mimehandler(text/x-mpsub) \
mimehandler(text/x-ssa) \
mimehandler(text/x-subviewer) \
mono(gnome-subtitles)"

RDEPENDS:${PN} += "/bin/bash \
gstreamer-plugins-base \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
mono(Mono.Posix) \
mono(System) \
mono(cairo-sharp) \
mono(gdk-sharp) \
mono(gio-sharp) \
mono(glib-sharp) \
mono(gtk-sharp) \
mono(mscorlib) \
mono(pango-sharp) \
mono-core"

inherit rpm
