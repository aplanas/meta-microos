SUMMARY = "SoapySDR Airspy module"
DESCRIPTION = "Soapy Airspy - Airspy device support for Soapy SDR. \
A Soapy module that supports Airspy devices within the Soapy API."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "soapysdr0.8-module-airspy-0.2.0-2.8.aarch64.rpm"
RPM_HASH = "84212dad6f9a6c3d9de4011e3d1556c420425000a0e3b13599d61a2724cfc3558d6a21e40befe51e3f49678e5a6ce1b1e9c248b1de3e52fe2470aca4273f3935"

RPROVIDES:${PN} += "libairspySupport.so()(64bit) \
soapysdr0.8-module-airspy \
soapysdr0.8-module-airspy(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSoapySDR.so.0.8()(64bit) \
libairspy.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
