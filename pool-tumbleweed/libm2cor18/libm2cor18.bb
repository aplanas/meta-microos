SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.2.1+git7683"

RPM_NAME = "libm2cor18-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "c90aa9bb6231ecfdd0c40466bc8d06b13e9b044d0ef86974d9cc0500ab040f55b386967a6aa924cd439325934e6799c8a9fd7b2291c66c33010fa39671778c48"

RPROVIDES:${PN} += "libm2cor.so.18 \
libm2cor18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
