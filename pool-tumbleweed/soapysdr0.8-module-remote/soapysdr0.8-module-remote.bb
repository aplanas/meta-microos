SUMMARY = "Remote device support for Soapy SDR"
DESCRIPTION = "A Soapy module that supports remote devices within the Soapy API."
LICENSE = "BSL-1.0"

PV = "0.5.2"

RPM_NAME = "soapysdr0.8-module-remote-0.5.2-3.8.aarch64.rpm"
RPM_HASH = "bd1b0ebad9fe34e0e8dba45f3676f55b03511014583a37603f6a641fd22b6c5bee44b910d507a19350a0bb800a5e9a8a106e075a0e89c4f35fcc0b69f3f21d7a"

RPROVIDES:${PN} += "libremoteSupport.so()(64bit) \
soapy-remote-module \
soapysdr0.8-module-remote \
soapysdr0.8-module-remote(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSoapySDR.so.0.8()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
