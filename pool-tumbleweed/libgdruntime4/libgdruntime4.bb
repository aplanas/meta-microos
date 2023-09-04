SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.2.1+git7683"

RPM_NAME = "libgdruntime4-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "43e4e19ab89aaea355f05dfe2e8b11a19889ec08a356f43b7c2d54fd07bf31e45457718a13e24538a6c13e74d503b3a19766b59b1ce4b24675162b5139f7b899"

RPROVIDES:${PN} += "libgdruntime.so.4 \
libgdruntime4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
