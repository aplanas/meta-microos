SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "libexe1-20210424-4.9.aarch64.rpm"
RPM_HASH = "e7b21655be9aabd62d25bf773ef9611307edd11aa70fb6e12d23709c399f006eb36f55ce6eee9ae560a4fb7d00f9adf7ef45cb0bcaf09c61fea142b4acc058e5"

RPROVIDES:${PN} += "libexe.so.1 \
libexe1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdata.so.1 \
libuna.so.1"

inherit rpm
