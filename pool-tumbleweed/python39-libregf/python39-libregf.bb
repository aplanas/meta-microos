SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "python39-libregf-20230319-1.2.aarch64.rpm"
RPM_HASH = "5798c108808b32dfa634fc80cdf4568b8375433f9b5a2a1ab41e1e0e3f4eb0bc2cf2508bef80e706e89bc2a457d144993b59b42ac70ccbbf6cb230c281c4d834"

RPROVIDES:${PN} += "python39-libregf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libregf.so.1 \
python-abi"

inherit rpm
