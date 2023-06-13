SUMMARY = "SoapySDR osmosdr module"
DESCRIPTION = "Soapy OsmoSDR - OsmoSDR device support for Soapy SDR. \
A Soapy module that supports OsmoSDR devices within the Soapy API."
LICENSE = "GPL-3.0-only"

PV = "0.2.5"

RPM_NAME = "soapysdr0.8-module-osmosdr-0.2.5-8.12.aarch64.rpm"
RPM_HASH = "5c2a3c11ff1d9c96d8fe0f86b5b229019fc6a0226e4b3ef4a667c7213c8525854e52062ab5e05e393c27fbd1116e63029fc3896b4521d0b2bdd95470e4e63fa3"

RPROVIDES:${PN} += "libosmosdrSupport.so()(64bit) \
soapysdr0.8-module-osmosdr \
soapysdr0.8-module-osmosdr(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSoapyOsmoSDR.so.0()(64bit) \
libSoapySDR.so.0.8()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libosmosdr.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
