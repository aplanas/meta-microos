SUMMARY = "Collection data type for C"
DESCRIPTION = "A data-type to collect data in a hierarchical structure for easy iteration \
and serialization"
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.0"

RPM_NAME = "libcollection4-0.7.0-27.18.aarch64.rpm"
RPM_HASH = "f2038f51cc99e4d2801acf3f659f1cec5176efa2b64fe81391d56d814ab43259b7f3e8317489840d5083ad68156b216a22c45fe9ee08a5d79fb525b6ce79325f"

RPROVIDES:${PN} += "libcollection.so.4()(64bit) \
libcollection.so.4(COLLECTION_0.6.2)(64bit) \
libcollection.so.4(COLLECTION_0.7)(64bit) \
libcollection4 \
libcollection4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
