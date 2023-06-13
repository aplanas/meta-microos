SUMMARY = "Python bindings for SoapySDR"
DESCRIPTION = "Python Bindings for SoapySDR. \
A vendor neutral and platform independent SDR support library."
LICENSE = "BSL-1.0"

PV = "0.8.1"

RPM_NAME = "python3-SoapySDR-0.8.1-1.11.aarch64.rpm"
RPM_HASH = "586c82e3a2cd4bc5ba4a7e5f394a4ddd1834ab801fa5ce5278d2aacf869545e160a85bf0005d010508e8e9783c115e3cc17e9e2dbbc3fcc0c6524e60d1a3e73c"

RPROVIDES:${PN} += "python-soapy-sdr \
python3-SoapySDR \
python3-SoapySDR(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSoapySDR.so.0.8()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
python(abi)"

inherit rpm
