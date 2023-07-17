SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-s390x-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "90d51eaea43d19b051b928796291c97fd99cf7386d51e38d9f8d13636ab196ff130ea35b742b4706d35e85382acb778ec157fab0b89e071bdb4e784b6db3256c"

RPROVIDES:${PN} += "cross-s390x-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-s390x-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
