SUMMARY = "Shared Library part of libnfdump"
DESCRIPTION = "Shared Library part of libnfdump."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "libnfdump1_7_1-1.7.1-1.3.aarch64.rpm"
RPM_HASH = "ebfa9753097c29ee06a511371bf2b972cd108031d453fdeb54584739f6fb6b2b61dbd5101cc01ebb8d2693f9b89ff9efd961587ce2e67247690d740802aaab56"

RPROVIDES:${PN} += "libnfdump-1.7.1.so()(64bit) \
libnfdump1_7_1 \
libnfdump1_7_1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
