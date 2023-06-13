SUMMARY = "Weighted finite-state transducer library"
DESCRIPTION = "OpenFst is a library for constructing, combining, optimizing and \
searching weighted finite-state transducers (FSTs)."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "openfst-1.8.2-1.1.aarch64.rpm"
RPM_HASH = "a722d7b4dbcc16712f47ad57e6414917c130f026d0ae404b0d24237cef7d4489f2794157619625fe7f1620e43e8da655a694451df4e9fcee26d66c71a25e15cb"

RPROVIDES:${PN} += "openfst \
openfst(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfst.so.25()(64bit) \
libfstscript.so.25()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
