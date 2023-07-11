SUMMARY = "Atomic parsley in gtkpod"
DESCRIPTION = "This is the core library for atomic parsley of mp4 files in gtkpod. \
Library including read/write lyric support for the first time and \
write metadata function."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "libatomicparsley0-2.1.5-6.19.aarch64.rpm"
RPM_HASH = "c70c440c836fa56d1ff05eee08d48bd9fabd0b53546437b762b3ec36a3c01275aff6ec3b2b5b37f2dc58dbe0c78d1a97596588c11e12ab3a38d49c21423c5a96"

RPROVIDES:${PN} += "libatomicparsley.so.0 \
libatomicparsley0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpod.so.4 \
libgtkpod.so.1 \
libm.so.6"

inherit rpm
