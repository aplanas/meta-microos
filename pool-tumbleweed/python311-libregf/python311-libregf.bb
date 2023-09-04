SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "python311-libregf-20230319-2.1.aarch64.rpm"
RPM_HASH = "8f4332cbc8c3a35fb27e2a7a6c0684dd3abf845b0908b2ece015f1b1e0c9f83d8542bbdbd986aad47a883a05e1b7393f21c654677a347d40aa30ec37ef3a683d"

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
