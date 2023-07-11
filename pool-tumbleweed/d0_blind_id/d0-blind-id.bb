SUMMARY = "Blind-ID library"
DESCRIPTION = "Blind-ID library for user identification using RSA blind signatures"
LICENSE = "BSD-3-Clause"

PV = "0.8.6"

RPM_NAME = "d0_blind_id-0.8.6-1.1.aarch64.rpm"
RPM_HASH = "02b2b09d4f4bf2d53f9b35e0adfef474a56c5b3439b4666a7262eae7b808b775de1df14e3f9f3ea850328b93ad2a446be34f9bfcf627d1712c3e3b1f051fcc89"

RPROVIDES:${PN} += "d0-blind-id"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libd0-blind-id.so.0"

inherit rpm
