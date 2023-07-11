SUMMARY = "Exchange-correlation functionals with arbitrary-order derivatives"
DESCRIPTION = "XCFun is a library of exchange-correlation (XC) functionals to be used in \
density-functional theory (DFT) codes."
LICENSE = "MPL-2.0"

PV = "2.1.1"

RPM_NAME = "libxcfun2-2.1.1-1.11.aarch64.rpm"
RPM_HASH = "09403647e0eb79f59376233190d78d36d18d5464d82291368089679cd6b00a5ba6eeaed6bd55b627522d4f9a0600f39665c3f6a63a62276a0a583f6fe3d48ac7"

RPROVIDES:${PN} += "libxcfun.so.2 \
libxcfun2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
