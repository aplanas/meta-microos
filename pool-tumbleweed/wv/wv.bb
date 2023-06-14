SUMMARY = "Tools for Importing Microsoft Word (tm) Documents"
DESCRIPTION = "WV is a program that can understand the Microsoft Word 8 binary file \
format (Office97). It currently converts Word into HTML, which can then \
be read with a web browser."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "wv-1.2.9-2.9.aarch64.rpm"
RPM_HASH = "4cb766da013ef70c2ec9d405c4d702e3e031471756ba10299fec9ae3641c236801f73550e59595fb23d2ff62b0ef2f932f767472bc003220317c6f29629d0513"

RPROVIDES:${PN} += "wv"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libwmf-0.2.so.7 \
libwmflite-0.2.so.7 \
libwv-1.2.so.4 \
w3m"

inherit rpm
