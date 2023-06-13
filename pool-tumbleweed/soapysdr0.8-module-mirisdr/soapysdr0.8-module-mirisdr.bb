SUMMARY = "SoapySDR mirisdr module"
DESCRIPTION = "Soapy mirisdr - mirisdr device support for Soapy SDR. \
A Soapy module that supports Mirics SDR devices within the Soapy API."
LICENSE = "GPL-3.0-only"

PV = "0.2.5"

RPM_NAME = "soapysdr0.8-module-mirisdr-0.2.5-8.12.aarch64.rpm"
RPM_HASH = "304bae7b14f1eacf80a32fffc27f487673a6b87679beace7e34a4112093d496ba6ce4fa20848020ba92177e521ac6870fa4ad8fce04d7d7ec30f745772bb541e"

RPROVIDES:${PN} += "libmiriSupport.so()(64bit) \
soapysdr0.8-module-mirisdr \
soapysdr0.8-module-mirisdr(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSoapyOsmoSDR.so.0()(64bit) \
libSoapySDR.so.0.8()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmirisdr.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
