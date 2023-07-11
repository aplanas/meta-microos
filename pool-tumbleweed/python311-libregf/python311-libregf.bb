SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "python311-libregf-20230319-1.5.aarch64.rpm"
RPM_HASH = "a8aed42a35f895c9f5f28dc2a97ce722b2064d6e0d578e9f7012f119de8878d387a70bbc424d4fee609c672747a3e733875ab013e9dd5610bf72f822ce676b7c"

RPROVIDES:${PN} += "python3-libregf \
python311-libregf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libregf.so.1 \
python-abi"

inherit rpm
