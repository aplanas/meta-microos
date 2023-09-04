SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "python310-libexe-20210424-5.1.aarch64.rpm"
RPM_HASH = "02ce7788ee8cb4004c9aa5126b682e3b38b4acb74866ed3117941af9ff098e74d0898954aeba5d45e1f95c6abeb52f07b0dfa617e5cb6e16614bbd15b1ef7455"

RPROVIDES:${PN} += "python310-libexe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libexe.so.1 \
python-abi"

inherit rpm
