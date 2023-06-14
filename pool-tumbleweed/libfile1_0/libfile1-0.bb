SUMMARY = "Library for heuristic file type determination based on content"
DESCRIPTION = "The library implements a heuristic file type determinator, \
similar to file/libmagic1."
LICENSE = "BSD-2-Clause"

PV = "2022.10.16"

RPM_NAME = "libfile1_0-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "81e1918989c92efa2be49852e7f6ae33706f7f2f8a5ce90b759ee9fda75ed8a0d633680c7174f6fa2ca6ce94949ef6175e19bd09f0d9758eef67b27aea885e06"

RPROVIDES:${PN} += "libfile.so.1.0 \
libfile1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
