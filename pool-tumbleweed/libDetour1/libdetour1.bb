SUMMARY = "Detour Library for Recastnatnaviagtion"
DESCRIPTION = "This package contains the detour library part of Recastnatnaviagtion."
LICENSE = "Zlib"

PV = "1.5.1+git20210305.c5cbd53"

RPM_NAME = "libDetour1-1.5.1+git20210305.c5cbd53-1.7.aarch64.rpm"
RPM_HASH = "2bb46f382b1cd66cd6542d4e9e3d4fcfd1b675214e84346eb25df27c7e0660ee984b713f623ab582affe9e4baec60b20ba7cd68d6b769720a927f592ab4637b7"

RPROVIDES:${PN} += "libDetour.so.1 \
libDetour1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
