SUMMARY = "Large integer arithmetic library"
DESCRIPTION = "TomsFastMath is a large integer arithmetic library written in ISO C. It \
performs modular exponentiations and other related \
functions required for ECC, DH and RSA cryptosystems."
LICENSE = "SUSE-Public-Domain | WTFPL"

PV = "0.13.1"

RPM_NAME = "libtfm1-0.13.1-1.8.aarch64.rpm"
RPM_HASH = "4b683513b62f20e2d13c6c2ddb8722bcc1acb5a354a461427ef6b86325c71710771448fb917a059ba020b2daec24c6485bd2204ff7a698279ec4aae7a30c5657"

RPROVIDES:${PN} += "libtfm.so.1 \
libtfm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
