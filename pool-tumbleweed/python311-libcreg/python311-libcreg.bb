SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "python311-libcreg-20210625-5.7.aarch64.rpm"
RPM_HASH = "3cfc36e983ace4a4b426f76206d0aaecbb464467673c012acdf9a6db7cc99088a2b213e79ff903dbdfc6d79dcb35927a18857a87995c6d96b38d9b37ea3c3074"

RPROVIDES:${PN} += "python311-libcreg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcreg.so.1 \
python-abi"

inherit rpm
