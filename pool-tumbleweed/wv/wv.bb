SUMMARY = "Tools for Importing Microsoft Word (tm) Documents"
DESCRIPTION = "WV is a program that can understand the Microsoft Word 8 binary file \
format (Office97). It currently converts Word into HTML, which can then \
be read with a web browser."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "wv-1.2.9-2.9.aarch64.rpm"
RPM_HASH = "4cb766da013ef70c2ec9d405c4d702e3e031471756ba10299fec9ae3641c236801f73550e59595fb23d2ff62b0ef2f932f767472bc003220317c6f29629d0513"

RPROVIDES:${PN} += "wv \
wv(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsf-1.so.114()(64bit) \
libwmf-0.2.so.7()(64bit) \
libwmflite-0.2.so.7()(64bit) \
libwv-1.2.so.4()(64bit) \
w3m"

inherit rpm
