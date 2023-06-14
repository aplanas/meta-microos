SUMMARY = "Debug Utils Library for Recastnavigation"
DESCRIPTION = "This package contains the debug utilities library for the recastnavigation."
LICENSE = "Zlib"

PV = "1.5.1+git20210305.c5cbd53"

RPM_NAME = "libDebugUtils1-1.5.1+git20210305.c5cbd53-1.7.aarch64.rpm"
RPM_HASH = "7aa2cdbf192eed89750548ea31c1c9bf3aace75eab0a3091c8b99b21390615ed7f1b0b2f21ccfbf392f9c75c2c942501c0a86fe155eb580bd88a00bd664b9ee1"

RPROVIDES:${PN} += "libDebugUtils.so.1 \
libDebugUtils1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libDetour.so.1 \
libRecast.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
