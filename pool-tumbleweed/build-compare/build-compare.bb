SUMMARY = "Build Result Compare Script"
DESCRIPTION = "This package contains scripts to find out if the build result differs \
to a former build."
LICENSE = "GPL-2.0-or-later"

PV = "20230617T171717.50241a8"

RPM_NAME = "build-compare-20230617T171717.50241a8-1.1.noarch.rpm"
RPM_HASH = "0c863ee5bdb4d32b06b761cc8a371b7140931d7d26c35cbe73e07a0cbc21158cbbc604e8023fc21f10be98aff9b6858d5e9113a90c162222c6ca76f2fcdb8ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-compare"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
coreutils \
cpio \
diffutils \
file \
gawk \
grep \
rpm \
sed"

inherit rpm
