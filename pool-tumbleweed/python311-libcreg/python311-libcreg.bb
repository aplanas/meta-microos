SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "python311-libcreg-20210625-5.10.aarch64.rpm"
RPM_HASH = "0b23ac5732e695b0dccd530f39d823f7715e7157d3ce9793b95926b0ceb3b1b4a1779bd92b57352fc410259729dceb1f82ea5e5684872d3e356f2b0d52172b70"

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
