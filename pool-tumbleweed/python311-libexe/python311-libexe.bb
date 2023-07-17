SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "python311-libexe-20210424-4.10.aarch64.rpm"
RPM_HASH = "95b0456d654d3e6636880a03fcf8be2d98e6087abfe5c2d9285f14b0d1eaca5c9f01dbffa3f85e7b38df698d3db9d8836f70fce069719d64be0877638e6c80e8"

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
