SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "python311-libcreg-20210625-6.1.aarch64.rpm"
RPM_HASH = "c7276b2b8aef888b676ff0720e1d728734e2ceb0bab08e4ca311314a93f51bdf8733a758f2c62ebaade691325383e84bedcf6cf461560313cb639189959747e1"

RPROVIDES:${PN} += "python3-libcreg \
python311-libcreg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcreg.so.1 \
python-abi"

inherit rpm
