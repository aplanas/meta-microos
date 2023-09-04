SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "python310-libregf-20230319-2.1.aarch64.rpm"
RPM_HASH = "37323eddf987d4eb5bee69b2b6feaf484d9db9bbb5e3b33b10b7308a4792e7ef76c2d3511f3f65db08a987d20fc2582d8d56b583eec54d992b8fd61b230daefc"

RPROVIDES:${PN} += "python310-libregf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libregf.so.1 \
python-abi"

inherit rpm
