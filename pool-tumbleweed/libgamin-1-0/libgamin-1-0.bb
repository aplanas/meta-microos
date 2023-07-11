SUMMARY = "Library providing the FAM File Alteration Monitor API"
DESCRIPTION = "This C library provides an API and ABI compatible file alteration \
monitor mechanism compatible with FAM, but not dependent on a system wide \
daemon."
LICENSE = "LGPL-2.1-only"

PV = "0.1.10"

RPM_NAME = "libgamin-1-0-0.1.10-18.2.aarch64.rpm"
RPM_HASH = "b075b196f21695a15ec0efa9502820f73e2a18e76d0291dbf69d7b78b7c88bc50be0130b109978b5981d2ae0caac4abd9faec5760e6ff233cf7be443bbfa18d7"

RPROVIDES:${PN} += "libgamin \
libgamin-1-0 \
libgamin-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gamin-server \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
