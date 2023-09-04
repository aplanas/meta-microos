SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "python311-libexe-20210424-5.1.aarch64.rpm"
RPM_HASH = "8c6bd3748c16b4107c06a07ab3ac51c53a74a9768b26eecc0d81966c40a453b585184dd0f51a2edbc099abd57c3827c6c6670daaebee60654462c82d9e7fa026"

RPROVIDES:${PN} += "python3-libexe \
python311-libexe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libexe.so.1 \
python-abi"

inherit rpm
