SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "python39-libexe-20210424-5.1.aarch64.rpm"
RPM_HASH = "74a6162984f32b68c9c56547d983262355db8e569beef9966ab01c14ede514ebfc320799735854f8addf78c9eb01a09bfbc5feb971e9685b8e21e4125c24147a"

RPROVIDES:${PN} += "python39-libexe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libexe.so.1 \
python-abi"

inherit rpm
