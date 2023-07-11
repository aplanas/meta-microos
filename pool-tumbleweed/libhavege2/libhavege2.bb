SUMMARY = "Haveged interface library"
DESCRIPTION = "Shared object for the haveged library. \
This package contains the haveged implementation of the HAVEGE \
algorithm and supporting features."
LICENSE = "GPL-3.0-only"

PV = "1.9.18"

RPM_NAME = "libhavege2-1.9.18-2.4.aarch64.rpm"
RPM_HASH = "ddae791b90e280bff9f2eb2fe70bd4b216f9fd12bd4f48ca16175b9ce382a61aa1445dad77806c0f59dd03bee67f2d74c38845cb7d4cd487209f1ca9b1e7a2c9"

RPROVIDES:${PN} += "libhavege.so.2 \
libhavege2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
