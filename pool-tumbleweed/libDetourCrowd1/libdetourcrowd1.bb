SUMMARY = "Detour Crowd Library for Recastnatnaviagtion"
DESCRIPTION = "This package contains the detour crowd library part of Recastnatnaviagtion."
LICENSE = "Zlib"

PV = "1.5.1+git20210305.c5cbd53"

RPM_NAME = "libDetourCrowd1-1.5.1+git20210305.c5cbd53-1.8.aarch64.rpm"
RPM_HASH = "29fb436dc890d31e1a6a4059b4c85545e6cb84da5ade8feea487e5b125bd477df4131625207e7947b3bca397ac2f51175665fdf6ed7acb098e057fe494aaf85a"

RPROVIDES:${PN} += "libDetourCrowd.so.1 \
libDetourCrowd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libDetour.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
