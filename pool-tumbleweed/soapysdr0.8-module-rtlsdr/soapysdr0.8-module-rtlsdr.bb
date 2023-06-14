SUMMARY = "SoapySDR RTL-SDR support module"
DESCRIPTION = "Soapy RTL-SDR - RTL-SDR device support for Soapy SDR. \
A Soapy module that supports RTL-SDR devices within the Soapy API."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "soapysdr0.8-module-rtlsdr-0.3.2-2.8.aarch64.rpm"
RPM_HASH = "e06e1027bcd5dbb1d002064e0219750d49871753b5d73bb2c071da12143add0f3e38fd0633682199536ffbf28f99cc5b5987c9577cb7b701122ffa6e86d8de5e"

RPROVIDES:${PN} += "librtlsdrSupport.so \
soapysdr0.8-module-rtlsdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libc.so.6 \
libgcc-s.so.1 \
librtlsdr.so.0 \
libstdc++.so.6"

inherit rpm
