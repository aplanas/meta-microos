SUMMARY = "PMI-X plugins version 1"
DESCRIPTION = "This package contains plugins used by libpmix2."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "pmix-plugins-3.2.3-10.1.aarch64.rpm"
RPM_HASH = "4efb42c3022194321f199d5ff1233180d86d8080c316a4e8a0bb18e8e9bd68542eea79d6b6781a93c4f08a590ac04f71e80e9f0e7f0d9d38f34315142afb6c64"

RPROVIDES:${PN} += "pmix-plugins"

RDEPENDS:${PN} += "-pmix-plugin-munge = 3.2.3 if munge \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libmca-common-dstore.so.1 \
libmca-common-dstore1 \
libpmix.so.2 \
libz.so.1"

inherit rpm
