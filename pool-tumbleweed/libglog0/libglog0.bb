SUMMARY = "Logging library for C++"
DESCRIPTION = "The glog library implements application-level logging. \
This library provides logging APIs based on C++-style \
streams and various helper macros."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "libglog0-0.5.0-1.8.aarch64.rpm"
RPM_HASH = "1a1cc022cf3478b865c77d0aea54353044bb8e2053075b7be5973c364d9c2fe40198b830331b2394e4c87e83fc320c6e4a107398adbbdec70faa427f9ebdd5db"

RPROVIDES:${PN} += "libglog.so.0 \
libglog0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
