SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "python39-libsmdev-20221028-3.1.aarch64.rpm"
RPM_HASH = "266a91ccd6e4da89bb3a01e9a82d0b62693683795f72e1299f84995218feaf963630a011ca2b31509ee08b4547b77db1040dddd308bdd392a247bd92e886952c"

RPROVIDES:${PN} += "python39-libsmdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmdev.so.1 \
python-abi"

inherit rpm
