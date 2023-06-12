SUMMARY = "GStreamer integration for the VLC media player"
DESCRIPTION = "This package enhances the functionality of the VLC media player by \
using GStreamer and its submodules as a backend to decode streams."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-codec-gstreamer-3.0.18-7.1.aarch64.rpm"
RPM_HASH = "9d44a9f3345eabdd4716673fba477218e39edd345673a08edf48f1abe9adb7dfa69ab314aae22a203ef953d1b02460d8d2deb3b96d4335d64f22a764ddc27172"

RPROVIDES:${PN} += "libgstdecode_plugin.so()(64bit) \
vlc-codec-gstreamer \
vlc-codec-gstreamer(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libvlccore.so.9()(64bit) \
vlc-noX"

inherit rpm
