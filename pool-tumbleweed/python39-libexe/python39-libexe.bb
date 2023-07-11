SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "python39-libexe-20210424-4.9.aarch64.rpm"
RPM_HASH = "843823795daf339987d8735961195e4d85f17ff635238f776b40178b8f085230519ca014f5eb88d08e39c1da9af1c4765b996cb4a4b7ba6d5c407e5b09f7ed36"

RPROVIDES:${PN} += "python39-libexe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libexe.so.1 \
python-abi"

inherit rpm
