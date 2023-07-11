SUMMARY = "Library which provides basic support for uncompressed multimedia data"
DESCRIPTION = "Gavl is short for Gmerlin Audio Video Library. It is a low level library, upon \
which multimedia APIs can be built. Gavl handles all the details of audio and \
video formats like colorspaces, samplerates, multichannel configurations etc. It \
provides standardized definitions for those formats as well as container \
structures for carrying audio samples or video images inside an application. \
 \
In addition, it handles the sometimes ugly task to convert between all these \
formats and provides some elementary operations (copying, scaling, alpha"
LICENSE = "GPL-3.0+"

PV = "1.4.0rsvn4256"

RPM_NAME = "libgavl1-1.4.0rsvn4256-2.31.aarch64.rpm"
RPM_HASH = "25c3c5940e1ccc1d69152e634058fa72ccc80cb8ee7026d3a0efe598ea0cd3c20b99c58c85e5a178f4e66428a6494b71360c519265d41e30d759cff5a4c2d60a"

RPROVIDES:${PN} += "libgavl.so.1 \
libgavl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6"

inherit rpm
