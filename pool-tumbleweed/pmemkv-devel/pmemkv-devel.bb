SUMMARY = "Key/Value Datastore for Persistent Memory"
DESCRIPTION = "This package contains the header files for libpmemkv and libpmemkv_json_config"
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "pmemkv-devel-1.5.0-1.2.aarch64.rpm"
RPM_HASH = "8d9c4ff9affda0a2385d739f5e879f11fdf48aae0d8a1befa04b6bed8f912e2a25a50dc866b9c0f3d0ab8bc0119b914072716a8cfc86a7b4ea61cc09ee1bc8e5"

RPROVIDES:${PN} += "pkgconfig-libpmemkv \
pkgconfig-libpmemkv-json-config \
pmemkv-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpmemkv-json-config1 \
libpmemkv1 \
libpmemobj++-devel \
pkgconfig-RapidJSON \
pkgconfig-libpmemkv \
pkgconfig-libpmemobj++ \
pkgconfig-memkind"

inherit rpm
