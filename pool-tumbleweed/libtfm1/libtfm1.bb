SUMMARY = "Large integer arithmetic library"
DESCRIPTION = "TomsFastMath is a large integer arithmetic library written in ISO C. It \
performs modular exponentiations and other related \
functions required for ECC, DH and RSA cryptosystems."
LICENSE = "SUSE-Public-Domain | WTFPL"

PV = "0.13.1"

RPM_NAME = "libtfm1-0.13.1-1.7.aarch64.rpm"
RPM_HASH = "fc8e619c51d71f891593cdf60901d5bbbc70c1c3244f6bf84791a8878443d06e8762b8a015dab0a84918636e2e22b0fad176cc34b19e0c1571c21ad379b642af"

RPROVIDES:${PN} += "libtfm.so.1 \
libtfm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
