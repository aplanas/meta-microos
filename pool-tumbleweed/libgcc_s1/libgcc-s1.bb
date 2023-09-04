SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libgcc_s1-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "9b5b3c0cbd1db711efe1d62655dc0c9e1b30bda231919040397770d19a9cf9fc8e7c95c89556b95a41945c11fba0e672cae8bb26bb068609e3d59725c7a3d026"

RPROVIDES:${PN} += "libgcc-s.so.1 \
libgcc-s1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
