SUMMARY = "EFA runtime library"
DESCRIPTION = "This package contains the efa runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libefa1-47.0-1.1.aarch64.rpm"
RPM_HASH = "2d66cd00a8cab3732295662c87439a42905e585cc72edcc0d1c29da160c967c921ca0f2a6a807531bd2632e44e4967676bff33043ad98e4c5207f8b519b1bbc3"

RPROVIDES:${PN} += "libefa.so.1 \
libefa1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
