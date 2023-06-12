SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.54.0"

RPM_NAME = "python311-grpcio-tools-1.54.0-1.1.aarch64.rpm"
RPM_HASH = "08dc63321f9e91b9f232aca5b9f0c46b18cc87f372cee2b8f5e50d5b3f43c1d81fdc4c663118d50f7f2c4b36d5af2efa85d0cb593d4fd715ce3702d9cbf4cfe5"

RPROVIDES:${PN} += "python3.11dist(grpcio-tools) \
python311-grpcio-tools \
python311-grpcio-tools(aarch-64) \
python3dist(grpcio-tools)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi) \
python311-grpcio \
python311-protobuf"

inherit rpm
