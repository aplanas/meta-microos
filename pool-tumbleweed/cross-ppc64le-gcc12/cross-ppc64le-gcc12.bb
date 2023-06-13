SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-ppc64le-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "abcfcf56400fd22123068b5da84e2440cb3f8960c754b1ae3b82f4c4ec90d39acd23f7899dd52e11a33ec6cf3c92001a51f90e3775d0e023920e30c699323af0"

RPROVIDES:${PN} += "cross-ppc64le-gcc12 \
cross-ppc64le-gcc12(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
cross-ppc64le-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
