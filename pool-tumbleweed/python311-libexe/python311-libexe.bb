SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "python311-libexe-20210424-4.9.aarch64.rpm"
RPM_HASH = "3ec05023e1af1921943caf93c098ffb2272997ba4b9d9ec7bdfe32cbe6447266950d92e2b41e38d8a6c0f4f893ce7b68e213f92bfdc05d25ddfb079ee6bba2c3"

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
