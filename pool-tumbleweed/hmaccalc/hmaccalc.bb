SUMMARY = "Tools for computing and checking HMAC values for files"
DESCRIPTION = "The hmaccalc package contains tools which can calculate HMAC (hash-based \
message authentication code) values for files.  The names and interfaces are \
meant to mimic the sha*sum tools provided by the coreutils package."
LICENSE = "BSD-3-Clause"

PV = "0.9.14"

RPM_NAME = "hmaccalc-0.9.14-2.19.aarch64.rpm"
RPM_HASH = "9dcbb585de78baae89e8839cd84a41f7c2276980105bafb08b1ebd8482783d73e7362b089ae42494c72a4829ceaa597a3ba7fa76b207aa35de1d1cacc36ebe7e"

RPROVIDES:${PN} += "hmaccalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so"

inherit rpm
