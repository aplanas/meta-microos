SUMMARY = "Include Files for Recastnavigation Libraries"
DESCRIPTION = "This package contains files and libraries needed for develeopment with \
recastnavigation libraries."
LICENSE = "Zlib"

PV = "1.5.1+git20210305.c5cbd53"

RPM_NAME = "recastnavigation-devel-1.5.1+git20210305.c5cbd53-1.7.aarch64.rpm"
RPM_HASH = "4f51aae2b3f818b5303697255dd9a28d9ed0744483802bab2379368656d8eb0d28e54f07b38ff59618561d7cdb15af56e2a1627d111e2c0e6549c13792a7a32b"

RPROVIDES:${PN} += "pkgconfig(recastnavigation) \
recastnavigation-devel \
recastnavigation-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libDebugUtils1 \
libDetour1 \
libDetourCrowd1 \
libDetourTileCache1 \
libRecast1"

inherit rpm
