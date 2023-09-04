SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-ppc64-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "0377b84338ad4f76daef8045f7d09d49dd451169655c63e163e314852a32427e41281d84452bb55d4e07869675f924a904514d26b3abb3cfec2f3809b5edbc9d"

RPROVIDES:${PN} += "cross-ppc64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
