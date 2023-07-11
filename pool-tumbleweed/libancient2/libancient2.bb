SUMMARY = "Decompression library for ancient formats"
DESCRIPTION = "This package provides the shared library for the decompression routines \
for ancient formats."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "libancient2-2.0.0-1.4.aarch64.rpm"
RPM_HASH = "e0fa8f37b66fadcecc50f828a1d9e274cbd3820323fab8732f6fffc3101ff63bed6caf8873ab21edf828cef8efe61e81867cd3be4fa7994f7d85442e692e4e5e"

RPROVIDES:${PN} += "libancient.so.2 \
libancient2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
