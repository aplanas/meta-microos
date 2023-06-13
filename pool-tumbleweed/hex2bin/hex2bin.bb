SUMMARY = "Converts Motorola and Intel hex files to binary"
DESCRIPTION = "Converts Motorola and Intel hex files to binary. For other formats, check this \
project also on sourceforge: srecord"
LICENSE = "BSD-2-Clause"

PV = "2.5"

RPM_NAME = "hex2bin-2.5-2.11.aarch64.rpm"
RPM_HASH = "097880d500781672664855b8d583a2f5925cf53eb6acf1c74310d444400b3b53b2ed1d6cad8657e6ad0284507d9e30c2da116b2a128f443ef1e1f462b36c0a83"

RPROVIDES:${PN} += "hex2bin \
hex2bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
