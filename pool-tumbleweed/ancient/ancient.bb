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

PV = "2.0.0"

RPM_NAME = "ancient-2.0.0-1.4.aarch64.rpm"
RPM_HASH = "0b3a5c40b1f716bab48c967df570b86b9e26da63f43fbd0f3b2075e0e6d564f716784107dae01ee4fd8f9271663de112f9d2b1b7fe63f6af41e091baa13dd1e7"

RPROVIDES:${PN} += "ancient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libancient.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
