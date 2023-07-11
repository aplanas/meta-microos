SUMMARY = "Debug Utils Library for Recastnavigation"
DESCRIPTION = "This package contains the debug utilities library for the recastnavigation."
LICENSE = "Zlib"

PV = "1.5.1+git20210305.c5cbd53"

RPM_NAME = "libDebugUtils1-1.5.1+git20210305.c5cbd53-1.8.aarch64.rpm"
RPM_HASH = "a8de3285c45ae52be9014f728d5790ea29bbe1acc277720643e2b16abdb3ede2cc75e0898b5c74ade2df73129113fc2b9392dd4474a1f366c449a96acbf0d529"

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
