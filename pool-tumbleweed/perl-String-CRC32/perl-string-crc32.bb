SUMMARY = "Perl interface for cyclic redundancy check generation"
DESCRIPTION = "The *CRC32* module calculates CRC sums of 32 bit lengths as integers. It \
generates the same CRC values as ZMODEM, PKZIP, PICCHECK and many others. \
 \
Despite its name, this module is able to compute the checksum of files as \
well as strings."
LICENSE = "SUSE-Public-Domain"

PV = "2.100"

RPM_NAME = "perl-String-CRC32-2.100-1.13.aarch64.rpm"
RPM_HASH = "6c385bbfd7cf47f1755f609895a6123df83e9abaa5fb773925e04de4c0c61cf512a3d57a308df0453fac2eb2da25b32797f3948d737603e011cce400718a4bd5"

RPROVIDES:${PN} += "perl-String--CRC32 \
perl-String-CRC32"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
