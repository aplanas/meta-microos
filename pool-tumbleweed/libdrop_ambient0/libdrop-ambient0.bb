SUMMARY = "Library for dropping ambient capabilities"
DESCRIPTION = "This library can be used via LD_PRELOAD to force an application started with ambient capabilities to drop them. \
It leaves other capabilities intact. This can also be linked against and automatically does the right thing. \
You do not need to make any calls into the library because all the work is done in the constructor which runs before main() is called."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libdrop_ambient0-0.8.3-2.3.aarch64.rpm"
RPM_HASH = "169241338a8a551a616263c40d45cc5641c159c3c2e487229b8d44fa4088b5ac19743bd2ad5102a34d8592fcc7baec470ca9c1692877a9c03bab2e45a27c219b"

RPROVIDES:${PN} += "libdrop-ambient.so.0 \
libdrop-ambient0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcap-ng0"

inherit rpm
