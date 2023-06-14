SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "python39-libcreg-20210625-5.7.aarch64.rpm"
RPM_HASH = "5846109ef5416d2ca7183a36612be3bea5bb3cd3ad20a438862274669b9b9b5d2fe4c8a523a36beae0fb5b53d40d16b730d6a862c28b2c97bb5a549e2d5a1376"

RPROVIDES:${PN} += "python39-libcreg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcreg.so.1 \
python-abi"

inherit rpm
