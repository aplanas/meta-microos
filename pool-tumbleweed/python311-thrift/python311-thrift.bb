SUMMARY = "Python 3.11 bindings for the Thrift software framework"
DESCRIPTION = "Thrift Python 3.11 library \
 \
Thrift is a software framework for scalable cross-language services \
development. It combines a software stack with a code generation \
engine to build services that work between C++, Java, C#, Python, \
Ruby, Perl, PHP, Objective C/Cocoa, Smalltalk, Erlang, Objective \
Caml, and Haskell."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "python311-thrift-0.17.0-1.6.aarch64.rpm"
RPM_HASH = "0f5f27c3dfab981c56c1438bf83e6ddc1e994e26c9a1cf48d6a31dafaf1f4cdb200b85b0a9efe6294986a566d084af23c1da7e0244ce31246d7f711a563635d0"

RPROVIDES:${PN} += "python3.11dist(thrift) \
python311-thrift \
python311-thrift(aarch-64) \
python3dist(thrift)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
python(abi) \
python311-six"

inherit rpm
