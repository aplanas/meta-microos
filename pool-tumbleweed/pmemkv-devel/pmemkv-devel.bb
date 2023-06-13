SUMMARY = "Key/Value Datastore for Persistent Memory"
DESCRIPTION = "This package contains the header files for libpmemkv and libpmemkv_json_config"
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "pmemkv-devel-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "7292ca143838e1e7218823e0cd526deee1b3da2ca5b9a8677cc5b197992315880048ffbaf7cb009eb96ca5eb5b15bf374a97182392435cd982f389618590be04"

RPROVIDES:${PN} += "pkgconfig(libpmemkv) \
pkgconfig(libpmemkv_json_config) \
pmemkv-devel \
pmemkv-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpmemkv1 \
libpmemkv_json_config1 \
libpmemobj++-devel \
pkgconfig(RapidJSON) \
pkgconfig(libpmemkv) \
pkgconfig(libpmemobj++) \
pkgconfig(memkind)"

inherit rpm
