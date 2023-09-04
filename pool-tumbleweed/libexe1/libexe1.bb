SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "libexe1-20210424-5.1.aarch64.rpm"
RPM_HASH = "af25b907694b03d2b9eccabc9ba3b7f7c591b09264115d67860b012e3cfe4e8c99c9040567cd78176f2f397a88c4110bea59499b8df7ac9feca18b204349b26d"

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
