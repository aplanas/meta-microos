SUMMARY = "Python implementation of the Earth Mover's Distance"
DESCRIPTION = "PyEMD is a Python wrapper for Ofir Pele and Michael Werman's implementation \
of the Earth Mover's Distance that allows it to be used with NumPy."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python39-pyemd-0.5.1-4.4.aarch64.rpm"
RPM_HASH = "83961906a44a3115fc9ca0566c3b60b7c61ad02a1ef2b635d31864a976784885479fbc8a1e96b37437d76b4bd38167bb001e1851f09a9b02f4907394f217b257"

RPROVIDES:${PN} += "python3.9dist(pyemd) \
python39-pyemd \
python39-pyemd(aarch-64) \
python3dist(pyemd)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
python(abi) \
python39-numpy"

inherit rpm
