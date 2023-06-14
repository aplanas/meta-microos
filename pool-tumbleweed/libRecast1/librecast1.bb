SUMMARY = "Recast Library for Recastnatnaviagtion"
DESCRIPTION = "This package contains the recast library of Recastnatnaviagtion."
LICENSE = "Zlib"

PV = "1.5.1+git20210305.c5cbd53"

RPM_NAME = "libRecast1-1.5.1+git20210305.c5cbd53-1.7.aarch64.rpm"
RPM_HASH = "8aa09d55e2957476f4a9a676d4033fc342f6593f694e7d4f32cbdbf5b111ba68daf1596ee013e758ac7d338689d007629b810cdfd376cb6a3a2f70b8015869f4"

RPROVIDES:${PN} += "libRecast.so.1 \
libRecast1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
