SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "python39-libregf-20230319-1.6.aarch64.rpm"
RPM_HASH = "e12e2b5a8308c616e6fdb39ea2c1cc5b2db029fd1523cf8fa85e9172185658dbbb91781dcb62bc4a74d6bc864b5831b96075b056b379e85a8295157819d08e1b"

RPROVIDES:${PN} += "python39-libregf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libregf.so.1 \
python-abi"

inherit rpm
