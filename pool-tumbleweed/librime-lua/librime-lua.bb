SUMMARY = "Lua plugin for librime"
DESCRIPTION = "Lua plugin for librime."
LICENSE = "SUSE-Permissive"

PV = "0.0.0+git20211220.8b37d55"

RPM_NAME = "librime-lua-0.0.0+git20211220.8b37d55-2.11.aarch64.rpm"
RPM_HASH = "ffebeb438cab4a1a3dea857cbb89af84e1271989a80330d92c30c7da974d19deada06678b0abdb86a9f562e5e3aa937f018b23a02015e6fd687384edd81f4472"

RPROVIDES:${PN} += "librime-lua \
librime-lua.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglog.so.0 \
liblua5.4.so.5 \
libopencc.so.1.1 \
librime.so.1 \
libstdc++.so.6"

inherit rpm
