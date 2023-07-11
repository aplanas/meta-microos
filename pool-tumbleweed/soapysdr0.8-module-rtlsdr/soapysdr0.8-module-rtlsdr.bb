SUMMARY = "SoapySDR RTL-SDR support module"
DESCRIPTION = "Soapy RTL-SDR - RTL-SDR device support for Soapy SDR. \
A Soapy module that supports RTL-SDR devices within the Soapy API."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "soapysdr0.8-module-rtlsdr-0.3.2-2.9.aarch64.rpm"
RPM_HASH = "201707966c0a431ab9cc51e2136814657383c4bc4822e815dfa25bbfb67c17174ea95d3e268211d03ec3cbfd7c183160ac119ad96d5baa2a75e89f657646fb03"

RPROVIDES:${PN} += "librtlsdrSupport.so \
soapysdr0.8-module-rtlsdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libc.so.6 \
libgcc-s.so.1 \
librtlsdr.so.0 \
libstdc++.so.6"

inherit rpm
