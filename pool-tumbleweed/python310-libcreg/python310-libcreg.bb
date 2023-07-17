SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "python310-libcreg-20210625-5.10.aarch64.rpm"
RPM_HASH = "137453d165c7118fd870b58b37508d5e86de15b92f81d469b17c4289b438ecebeba848719a6036913490c210c3ad8d797d1ff763249969ee6b620de0f7fa2e4d"

RPROVIDES:${PN} += "python310-libcreg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcreg.so.1 \
python-abi"

inherit rpm
