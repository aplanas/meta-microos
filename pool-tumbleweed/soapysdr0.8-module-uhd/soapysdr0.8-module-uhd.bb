SUMMARY = "Soapy SDR plugins for UHD supported SDR devices"
DESCRIPTION = "Soapy UHD - Soapy SDR devices for UHD. \
A UHD module that supports Soapy devices within the UHD API."
LICENSE = "GPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "soapysdr0.8-module-uhd-0.4.1-2.13.aarch64.rpm"
RPM_HASH = "03aeed632499c8f9e5b52549510220c05753f407dc0c681b99d156e96057e5bc188004f67d059561b24ba61651799deb3d27a7551fba5995264c5535c5d5bc22"

RPROVIDES:${PN} += "libsoapySupport.so()(64bit) \
libuhdSupport.so()(64bit) \
soapy-uhd-module \
soapysdr0.8-module-uhd \
soapysdr0.8-module-uhd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSoapySDR.so.0.8()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libuhd.so.4.4.0()(64bit)"

inherit rpm
