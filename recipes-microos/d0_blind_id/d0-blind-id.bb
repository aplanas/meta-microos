SUMMARY = "Blind-ID library"
DESCRIPTION = "Blind-ID library for user identification using RSA blind signatures"
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "d0_blind_id-1.0-3.12.aarch64.rpm"
RPM_HASH = "b0bd4a38103fc2f2c3a7394a360baff3ec39da82d2b16105cbeb50054231dffbe6ea602c6cfb7716ca91b925d8c00d1493e29ae1b27339e6ad5545b96dc26845"

RPROVIDES:${PN} += "d0_blind_id d0_blind_id(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libd0_blind_id.so.0()(64bit)"

inherit rpm
