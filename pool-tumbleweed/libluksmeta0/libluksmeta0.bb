SUMMARY = "Simple library for storing metadata in the LUKSv1 header"
DESCRIPTION = "LUKSMeta is a simple library for storing metadata in the LUKSv1 header."
LICENSE = "LGPL-2.1-or-later"

PV = "9"

RPM_NAME = "libluksmeta0-9-1.1.aarch64.rpm"
RPM_HASH = "d2c04b630b8b1fb57a94f4c4774498c9ee443c35da1691e15ac4e27836307a0e6e1a145227bc70af16f273a14a8a4540c7c1c576b897558f5bfa2175d3a211c7"

RPROVIDES:${PN} += "libluksmeta.so.0 \
libluksmeta0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcryptsetup.so.12"

inherit rpm
