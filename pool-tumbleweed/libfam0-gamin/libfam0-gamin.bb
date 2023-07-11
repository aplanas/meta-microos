SUMMARY = "Library providing the FAM File Alteration Monitor API"
DESCRIPTION = "This C library provides an API and ABI compatible file alteration \
monitor mechanism compatible with FAM, but not dependent on a system wide \
daemon."
LICENSE = "LGPL-2.1-only"

PV = "0.1.10"

RPM_NAME = "libfam0-gamin-0.1.10-18.2.aarch64.rpm"
RPM_HASH = "6459ad26bf9b84292acb00c315efabe82275b38c3e5a5a8d86357c60d6a27f3ad175fe7ba740d5a4ae2354410308d04e76e0890069ffd693945ab91d6ae30b72"

RPROVIDES:${PN} += "libfam.so.0 \
libfam0-gamin"

RDEPENDS:${PN} += "/sbin/ldconfig \
gamin-server \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
