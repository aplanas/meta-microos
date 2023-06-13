SUMMARY = "Library to generate UUIDs"
DESCRIPTION = "A library to generate universally unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.38.1"

RPM_NAME = "libuuid1-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "aa78bf27d8ef5bf91b5018d1c49a73a7b681a9f0aa2629466773a7398d0e9c0fd9cd585d4d8db4ff5e2547bcae0cc2342cd59681486720c5d309497139a11754"

RPROVIDES:${PN} += "libuuid.so.1()(64bit) \
libuuid.so.1(UUIDD_PRIVATE)(64bit) \
libuuid1 \
libuuid1(aarch-64) \
libuuid__uuid_generate_time_cont"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
