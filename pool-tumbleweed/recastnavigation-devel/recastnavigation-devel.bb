SUMMARY = "Include Files for Recastnavigation Libraries"
DESCRIPTION = "This package contains files and libraries needed for develeopment with \
recastnavigation libraries."
LICENSE = "Zlib"

PV = "1.5.1+git20210305.c5cbd53"

RPM_NAME = "recastnavigation-devel-1.5.1+git20210305.c5cbd53-1.8.aarch64.rpm"
RPM_HASH = "3e8ed1a5a5583b3c8e4ad5bb3cb403448be42040e8bc408daf46039b151c044c9a23e9af3cd6a010a9fb752708c8c6548b2f4fed595b60f69efbb34bedab29cc"

RPROVIDES:${PN} += "pkgconfig-recastnavigation \
recastnavigation-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libDebugUtils1 \
libDetour1 \
libDetourCrowd1 \
libDetourTileCache1 \
libRecast1"

inherit rpm
