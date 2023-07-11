SUMMARY = "Collection data type for C"
DESCRIPTION = "A data-type to collect data in a hierarchical structure for easy iteration \
and serialization"
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.0"

RPM_NAME = "libcollection4-0.7.0-28.1.aarch64.rpm"
RPM_HASH = "d169ffb5d612a854fb04ccf9cf698423e63bfe6350619a732ff5a1a4ec517333de86cecb2806b5da9a607bc2affa55d183b062a197c766bf4fc85927eb3da392"

RPROVIDES:${PN} += "libcollection.so.4 \
libcollection4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
