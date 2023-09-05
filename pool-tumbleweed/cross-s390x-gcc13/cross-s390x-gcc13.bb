SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-s390x-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "308fab0f0593d0f80856abf20dd057dcf91e7bd89c24f0138568b1930cc3128d1f8e6976c8bdc6764338c09cd420ef861bfdcec2bbe6e1e65f0f25536a2c3651"

RPROVIDES:${PN} += "cross-s390x-gcc13 \
s390x-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-s390x-binutils \
cross-s390x-glibc-devel \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
