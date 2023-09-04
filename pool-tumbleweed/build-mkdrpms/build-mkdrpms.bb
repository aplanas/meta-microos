SUMMARY = "Tools to generate delta rpms"
DESCRIPTION = "This package contains the parts which may be installed in the inner build system \
for generating delta rpm packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230808"

RPM_NAME = "build-mkdrpms-20230808-1.1.noarch.rpm"
RPM_HASH = "1471e99e811acbd409627fa027772ce44d6766caf61509febfd0f3ea449989971f15659839acacd894ac93dc22fdcb8475306efd7dc39ef43c32ca8edb72b56a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-mkdrpms"

RDEPENDS:${PN} += "/usr/bin/perl \
build \
deltarpm"

inherit rpm
