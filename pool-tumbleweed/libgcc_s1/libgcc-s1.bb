SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libgcc_s1-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "cb2c37339f9cda9bfe046851b7bac22a7d64a54ad16cdfdd2de194c7a2d40e7d59bf52ca9af8a7234ac3bcdc4bbae17e28a1311ebc262720a00af43841cba43d"

RPROVIDES:${PN} += "libgcc-s.so.1 \
libgcc-s1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
