SUMMARY = "Compel library for CRIU"
DESCRIPTION = "This package contains the compel library for CRIU to execute a parasite code."
LICENSE = "LGPL-2.1-only"

PV = "3.18"

RPM_NAME = "libcompel1-3.18-1.2.aarch64.rpm"
RPM_HASH = "9a4352dc050cd358055beca05dd2696cd6977f660d973eadab16b5496878c34c15a5c17665e2cadacffc38133344fc6ae403e7bcfc2ef6917eb9435c1dd0809b"

RPROVIDES:${PN} += "libcompel.so.1 \
libcompel1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
