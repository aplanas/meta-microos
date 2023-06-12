SUMMARY = "Download Manager with a GTK+ user interface"
DESCRIPTION = "Uget is a download manager written with GTK+. It supports \
pause and resume, and the ability to classify download, with every \
category having an independent configuration."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.3"

RPM_NAME = "uget-2.2.3-3.14.aarch64.rpm"
RPM_HASH = "cab51dd8299bad732c6edf2915797012eb53c1b64417e675331a4565ab8c96cf1c46f18c9d06e7e82394679185aea4045b284b5681928b940c7198f03d2f3a49"

RPROVIDES:${PN} += "application() \
application(uget-gtk.desktop) \
uget \
uget(aarch-64)"
RDEPENDS:${PN} += "aria2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcurl.so.4()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit)"

inherit rpm
