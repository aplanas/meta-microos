SUMMARY = "SoapySDR HackRF module"
DESCRIPTION = "Soapy HackRF - HackRF device support for Soapy SDR. \
A Soapy module that supports HackRF devices within the Soapy API."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "soapysdr0.8-module-hackrf-0.3.4-1.4.aarch64.rpm"
RPM_HASH = "67655cbe9762b2d3cfb9411705cb76c8f845c4a9c8b9406394f66bbad2a501bdf9f8df3bc230239005d388d46c53dd49942cbcfd45880116a1eff4be8cd2a4af"

RPROVIDES:${PN} += "libHackRFSupport.so \
soapysdr0.8-module-hackrf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libc.so.6 \
libgcc-s.so.1 \
libhackrf.so.0 \
libstdc++.so.6"

inherit rpm
