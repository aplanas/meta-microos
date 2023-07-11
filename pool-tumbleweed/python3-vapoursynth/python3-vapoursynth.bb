SUMMARY = "Python interface for VapourSynth"
DESCRIPTION = "Python interface for VapourSynth/VSSCript."
LICENSE = "LGPL-2.1-only"

PV = "63"

RPM_NAME = "python3-vapoursynth-63-1.1.aarch64.rpm"
RPM_HASH = "0f13acdd320781c15f1dba69d64aa664f3965a85c3e2d3b941b3c03a0e4a1727fd1147cd30ad0dff4b21b62261ab4db96774cd6a4f79e5b3265901215ae62e10"

RPROVIDES:${PN} += "python3-vapoursynth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvapoursynth-63.so \
python-abi"

inherit rpm
