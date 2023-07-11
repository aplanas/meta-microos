SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "python310-libexe-20210424-4.9.aarch64.rpm"
RPM_HASH = "918405f7e15bd8b7de2eea4945abfedbc3956a265426dd58768bdbab0a96818f3667d22087a00a7e9e14431aea8a821aee4f414c71f34a79f93e7b986ab63986"

RPROVIDES:${PN} += "python310-libexe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libexe.so.1 \
python-abi"

inherit rpm
