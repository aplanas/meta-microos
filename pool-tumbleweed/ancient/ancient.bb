SUMMARY = "Decompression routines for ancient formats"
DESCRIPTION = "This is a collection of decompression routines for old formats popular \
in the Amiga, Atari computers and some other systems from 80's and 90's \
as well as some that are currently used which were used in a some \
specific way in these old systems. \
 \
For simple usage both a simple command line application as well as a \
simple API to use the decompressors are provided. The compression \
algorithm is automatically detected in most cases, however there are some \
corner cases where it is not entirely reliable due to weaknesses in the \
old format used."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "ancient-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "e9c991d6e23c70546cff4e1d6c188221162446bbadd35ee3e3325772f0a2794c00d0323c9a2aa7c98da8300a4fb009ab9c2ae0ec467b1ad844dae074ce5e0617"

RPROVIDES:${PN} += "ancient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libancient.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
