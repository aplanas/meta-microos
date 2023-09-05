SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-ppc64le-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "dec4c844e54a49e29e51b6225c27233d6f5903458e04f49f7723d86d9e2934a45c08abaf2ac490e0a343d1236f60a430b34901eaebb0c97dd29b3ed2360d139f"

RPROVIDES:${PN} += "cross-ppc64le-gcc13 \
powerpc64le-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64le-binutils \
cross-ppc64le-glibc-devel \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
