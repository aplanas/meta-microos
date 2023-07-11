SUMMARY = "Secure Reliable Transport (SRT) library"
DESCRIPTION = "This package contains a shared system library for Secure Reliable \
Transport (SRT)."
LICENSE = "MPL-2.0"

PV = "1.5.1"

RPM_NAME = "libsrt1_5-1.5.1-1.5.aarch64.rpm"
RPM_HASH = "0f34309ef901cbe64edf2de9817b9e2f72356d502243b0f9eeba77d15696e0527eff4d0a7cbf603901bf84a3b92c94acf9e7c2c0628e08413784cf020c1a5a76"

RPROVIDES:${PN} += "libsrt.so.1.5 \
libsrt1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
