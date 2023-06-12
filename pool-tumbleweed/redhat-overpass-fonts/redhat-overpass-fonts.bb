SUMMARY = "A font family inspired by Highway Gothic"
DESCRIPTION = "Overpass is a (sans-serif) font family inspired by Highway Gothic. \
 \
This package contains the proportional variants in OpenType format."
LICENSE = "OFL-1.1"

PV = "3.0.5"

RPM_NAME = "redhat-overpass-fonts-3.0.5-1.1.noarch.rpm"
RPM_HASH = "7d1be30490fc01ca31bc78fd8511163502f9844d10d08a2f2ba5647c3119e9382bf3df786d3757f47badc9d856c81df45cf04f600a55ae9b3052f15a68e0d451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "redhat-overpass-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
