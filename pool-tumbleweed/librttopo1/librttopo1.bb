SUMMARY = "RT Topology Library"
DESCRIPTION = "The RT Topology Library exposes an API to create and manage standard \
(ISO 13249 aka SQL/MM) topologies using user-provided [data stores]"
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "librttopo1-1.1.0-2.5.aarch64.rpm"
RPM_HASH = "b87e25789792d59674d334daf00ab22991f9f86a0689fba0938d0bf253394b98bffba7409a3315edcb98c7fe168d133f4f086b75bf54ba423d06e8a15d151a8b"

RPROVIDES:${PN} += "librttopo.so.1 \
librttopo1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgeos-c.so.1 \
libm.so.6"

inherit rpm
