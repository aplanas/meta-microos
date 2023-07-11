SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "python311-libcreg-20210625-5.9.aarch64.rpm"
RPM_HASH = "605e921fd1e4c6cb42f6475e0f63f8c736a416c5f2aaa38c17e189b9cdb7b8c8f2eba877ee80f9b23620d28118145d679a92fa30846c642ecd7f4ff7c513bb39"

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
