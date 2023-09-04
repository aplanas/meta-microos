SUMMARY = "Perl interface for cyclic redundancy check generation"
DESCRIPTION = "The *CRC32* module calculates CRC sums of 32 bit lengths as integers. It \
generates the same CRC values as ZMODEM, PKZIP, PICCHECK and many others. \
 \
Despite its name, this module is able to compute the checksum of files as \
well as strings."
LICENSE = "SUSE-Public-Domain"

PV = "2.100"

RPM_NAME = "perl-String-CRC32-2.100-1.14.aarch64.rpm"
RPM_HASH = "9b904bbb65b73c148c9a806d42ae58c0ee2494ba8014976931ff0e84289865c4cf7a78c767e7603cbaa10552f7f0d50ad864bafd6937b31c08f1bef4a84ad031"

RPROVIDES:${PN} += "perl-String--CRC32 \
perl-String-CRC32"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
