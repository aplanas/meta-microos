SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "libexe1-20210424-4.10.aarch64.rpm"
RPM_HASH = "ded1c5a428e9f86d9db12a73dec438048e4bcca4de4232590a4bca47e94fa37aafe18af7930a7fc611f553823b36ceb371f50e1e31fa4dd5d9990290b2798103"

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
