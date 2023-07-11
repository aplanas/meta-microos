SUMMARY = "Python wrapper for hiredis"
DESCRIPTION = "Python wrapper for hiredis C connector."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "python310-hiredis-2.2.2-3.3.aarch64.rpm"
RPM_HASH = "99640478ce0b14569a1dab842bf49ad387df17db0ff4c1ecf08d5b4b2f82664d2f619a4dd25a45613c94593e427c427db1654b29214c424b0823fef2aecbbfe8"

RPROVIDES:${PN} += "python3.10dist-hiredis \
python310-hiredis \
python3dist-hiredis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhiredis.so.1.1.0 \
python-abi"

inherit rpm
