SUMMARY = "SoapySDR HackRF module"
DESCRIPTION = "Soapy HackRF - HackRF device support for Soapy SDR. \
A Soapy module that supports HackRF devices within the Soapy API."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "soapysdr0.8-module-hackrf-0.3.4-1.3.aarch64.rpm"
RPM_HASH = "475c0ada14865a35f4db8f80009c32b1fb2875f4821c6839250b162dd8b541cf4591302cc182feaaab073bc3e54b39d4c4ca7a8d0cfb725a3f48424e21ee89b5"

RPROVIDES:${PN} += "libHackRFSupport.so()(64bit) \
soapysdr0.8-module-hackrf \
soapysdr0.8-module-hackrf(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSoapySDR.so.0.8()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libhackrf.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
