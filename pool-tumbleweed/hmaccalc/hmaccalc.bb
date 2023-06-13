SUMMARY = "Tools for computing and checking HMAC values for files"
DESCRIPTION = "The hmaccalc package contains tools which can calculate HMAC (hash-based \
message authentication code) values for files.  The names and interfaces are \
meant to mimic the sha*sum tools provided by the coreutils package."
LICENSE = "BSD-3-Clause"

PV = "0.9.14"

RPM_NAME = "hmaccalc-0.9.14-2.18.aarch64.rpm"
RPM_HASH = "739c0c29a014c12d5bb604c3c13a94c66e87fcb91f35acc8bbcd8d2cedbb4124d4e31aa0c5dd100bf1670835ec598aade6ac3303332b8d58f5bd7d189b759747"

RPROVIDES:${PN} += "hmaccalc \
hmaccalc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit)"

inherit rpm
