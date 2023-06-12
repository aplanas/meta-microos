SUMMARY = "SoapySDR XTRX module"
DESCRIPTION = "Soapy XTRX - XTRX device support for Soapy SDR. \
A Soapy module that supports XTRX devices within the Soapy API."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "soapysdr0.8-module-xtrx-0.0.0+git.20201202-3.7.aarch64.rpm"
RPM_HASH = "db3b9d61487b2b93ee9139a02affd0dea951f646c0f70152d72273e023984c6814e6a1bbcce038a0d570270408c91b2b1e027662fbf76ead153755da913f2ec8"

RPROVIDES:${PN} += "libXTRXSupport.so()(64bit) \
soapysdr0.8-module-xtrx \
soapysdr0.8-module-xtrx(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSoapySDR.so.0.8()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libxtrx.so.0()(64bit)"

inherit rpm
