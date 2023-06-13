SUMMARY = "SASL for Python"
DESCRIPTION = "Cyrus-SASL bindings for Python."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python311-sasl-0.3.1-1.4.aarch64.rpm"
RPM_HASH = "9dd11d3546f35b2110d08522b82d12c083bec9f9cf7385ecf6046f94a3473d6bc79945da4d34a09d7c86a62ab8888a7c04f97d69c0457ee9f4d6dabdd5006237"

RPROVIDES:${PN} += "python3.11dist(sasl) \
python311-sasl \
python311-sasl(aarch-64) \
python3dist(sasl)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libsasl2.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi) \
python311-six"

inherit rpm
