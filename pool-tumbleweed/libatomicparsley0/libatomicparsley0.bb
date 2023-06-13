SUMMARY = "Atomic parsley in gtkpod"
DESCRIPTION = "This is the core library for atomic parsley of mp4 files in gtkpod. \
Library including read/write lyric support for the first time and \
write metadata function."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "libatomicparsley0-2.1.5-6.18.aarch64.rpm"
RPM_HASH = "4dff315b7c99daeab1a7d353f42cb4e9e7efc36a513a7764228c2846ea1affe6f02b06a0a901e717c85fd08972d7ca2bcdce406beaea137820c212fcb5e6bf0d"

RPROVIDES:${PN} += "libatomicparsley.so.0()(64bit) \
libatomicparsley0 \
libatomicparsley0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpod.so.4()(64bit) \
libgtkpod.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
