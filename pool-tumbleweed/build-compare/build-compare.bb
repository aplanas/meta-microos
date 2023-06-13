SUMMARY = "Build Result Compare Script"
DESCRIPTION = "This package contains scripts to find out if the build result differs \
to a former build."
LICENSE = "GPL-2.0-or-later"

PV = "20230428T221133.82ffb27"

RPM_NAME = "build-compare-20230428T221133.82ffb27-1.1.noarch.rpm"
RPM_HASH = "3d52b2f5c1fdc606d741b2dcbd5564febd866da755feab211dcafa4279dd094c6afaca0816b57862aa9297e9f71c1a18e592db60f886f8b2ab4dc2a290bc5e6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-compare"

RDEPENDS:${PN} += "/bin/bash \
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
