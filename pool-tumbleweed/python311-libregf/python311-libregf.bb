SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "python311-libregf-20230319-1.2.aarch64.rpm"
RPM_HASH = "f2b19dab306724c68417cf6b8153f68a508c211285b3b4dc3e92e81163dd8eeabfd9ef8d3f529f21ca13ddd74c60e37e0891bae29bb14d816f18bc0f49acbaeb"

RPROVIDES:${PN} += "python311-libregf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libregf.so.1 \
python-abi"

inherit rpm
