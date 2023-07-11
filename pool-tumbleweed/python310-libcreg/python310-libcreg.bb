SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "python310-libcreg-20210625-5.9.aarch64.rpm"
RPM_HASH = "e24ca6f53ad67ea86ab480ff60c36a435c6bcade6daad0ba79e6c4b46cb90076326e0d74cd5a765247e4c37756daf14436e4433256082a46a4d74a2a6a15ff09"

RPROVIDES:${PN} += "python310-libcreg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcreg.so.1 \
python-abi"

inherit rpm
