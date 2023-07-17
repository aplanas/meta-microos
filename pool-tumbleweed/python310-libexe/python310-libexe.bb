SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "python310-libexe-20210424-4.10.aarch64.rpm"
RPM_HASH = "6dcc4a02c9b3be2f08bcfdf398e9f75c99e1e481506627b242fccb7ba4a77377f4afb6e306955013dec82051ee7d031842379f7b583b9c6ff9fa3837e5f074f7"

RPROVIDES:${PN} += "python310-libexe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libexe.so.1 \
python-abi"

inherit rpm
