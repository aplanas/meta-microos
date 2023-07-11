SUMMARY = "Compact Disc Digital audio extraction library"
DESCRIPTION = "libparanoia is a Compact Disc Digital Audio (CD-DA) Digital Audio \
Extraction (DAE) library for reading audio from the CD-ROM directly \
as data, with no analog step between. Cdparanoia can read audio data \
from inexpensive drives prone to misalignment, frame jitter and loss \
of streaming during atomic reads, and attempt to repair data from CDs \
that have been damaged in some way by use of the error correction \
stored on the disc."
LICENSE = "LGPL-2.1-only"

PV = "3.02~a10"

RPM_NAME = "libparanoia1_0-3.02~a10-47.4.aarch64.rpm"
RPM_HASH = "7373f2d20db66eeedc34c347fb90485e826b035289004a1a26e2c955f9936f6e9344587645814212925a09ddd13903d80b60dd4629ef0367df4fe599777ac145"

RPROVIDES:${PN} += "libparanoia.so.1.0 \
libparanoia1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
