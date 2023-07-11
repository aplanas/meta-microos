SUMMARY = "Helper library for libpmemkv"
DESCRIPTION = "pmemkv is a local/embedded key-value datastore optimized for persistent memory. \
Rather than being tied to a single language or backing implementation, `pmemkv` \
provides different options for language bindings and storage engines."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "libpmemkv_json_config1-1.5.0-1.2.aarch64.rpm"
RPM_HASH = "1252432addb03ea082f32faa49cfd6eb3c02afead35db679cee372655f4ab8ac711cc6aae0c3334604dda0f485e24a955e6bb31e9ee9ebeec7a3932dc9060903"

RPROVIDES:${PN} += "libpmemkv-json-config.so.1 \
libpmemkv-json-config1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpmemkv.so.1 \
libstdc++.so.6"

inherit rpm
