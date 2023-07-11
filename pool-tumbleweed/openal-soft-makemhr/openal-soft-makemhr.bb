SUMMARY = "OpenAL Soft HRTF generation utility"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
This package contains the makemhr utility for creating head-related \
transfer functions (HRTF)."
LICENSE = "GPL-2.0-or-later"

PV = "1.22.2"

RPM_NAME = "openal-soft-makemhr-1.22.2-1.5.aarch64.rpm"
RPM_HASH = "711765e7c559a5da252a6099c9dc3ce13a8d2df0afa126fcdcd98fbcabe853b77a8d1b9fa310aea9894330eb021767fa8313a65c87bbd0f86d57197f29ccbcf4"

RPROVIDES:${PN} += "makehrtf \
openal-soft-devel-/usr/bin/makehrtf \
openal-soft-makemhr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmysofa.so.1 \
libstdc++.so.6"

inherit rpm
