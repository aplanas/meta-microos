SUMMARY = "Remote device support for Soapy SDR"
DESCRIPTION = "A Soapy module that supports remote devices within the Soapy API."
LICENSE = "BSL-1.0"

PV = "0.5.2"

RPM_NAME = "soapysdr0.8-module-remote-0.5.2-3.9.aarch64.rpm"
RPM_HASH = "688fcb8c6c00f62f96cf4929593062ea5b5d688b8fbb100cd7cf5dfc02460d224f2ee8968f1f07468f4f7eb23615278f1ea6fb5be8253af72ddd7d6b89fc7621"

RPROVIDES:${PN} += "libremoteSupport.so \
soapy-remote-module \
soapysdr0.8-module-remote"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
