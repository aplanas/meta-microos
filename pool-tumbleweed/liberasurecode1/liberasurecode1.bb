SUMMARY = "Erasure Code API library with pluggable Erasure Code backends"
DESCRIPTION = "liberasurecode is an Erasure Code API library written in C with \
pluggable Erasure Code backends."
LICENSE = "BSD-3-Clause"

PV = "1.6.3"

RPM_NAME = "liberasurecode1-1.6.3-1.5.aarch64.rpm"
RPM_HASH = "2bdc59776a5de497d17f3fd5488edce0225d38acc39abd0cddb78ab00d69b0996497fa55a35f77c4a738e756e2b1b853236396ee883fd66ea07ac37827118442"

RPROVIDES:${PN} += "libXorcode.so.1 \
liberasurecode-rs-vand.so.1 \
liberasurecode.so.1 \
liberasurecode1 \
libnullcode.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
