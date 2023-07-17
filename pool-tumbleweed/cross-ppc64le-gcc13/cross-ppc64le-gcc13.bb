SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-ppc64le-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "5be087a29af71858b901f4d01cb72016c3effcb7e2aa40bd3e35bcece53422e14a671fdd5d2691d3da1eaa92463ba57e337ec8efa07e328e4f74dcf4ef04ff5c"

RPROVIDES:${PN} += "cross-ppc64le-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64le-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
