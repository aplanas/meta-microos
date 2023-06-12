SUMMARY = "Helper library for libpmemkv"
DESCRIPTION = "pmemkv is a local/embedded key-value datastore optimized for persistent memory. \
Rather than being tied to a single language or backing implementation, `pmemkv` \
provides different options for language bindings and storage engines."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "libpmemkv_json_config1-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "c5b38888401466ac40d176d9e553a4b3f5d8ca60afc686851a3ae38c74ed75455198e445d508b74fe1552f1a81dce55972a332fff630c0af3b3fcc442ecbac33"

RPROVIDES:${PN} += "libpmemkv_json_config.so.1()(64bit) \
libpmemkv_json_config.so.1(LIBPMEMKV_JSON_CONFIG_1.0)(64bit) \
libpmemkv_json_config1 \
libpmemkv_json_config1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpmemkv.so.1()(64bit) \
libpmemkv.so.1(LIBPMEMKV_1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
