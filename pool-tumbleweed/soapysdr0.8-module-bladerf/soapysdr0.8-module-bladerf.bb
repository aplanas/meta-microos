SUMMARY = "SoapySDR BladeRF module"
DESCRIPTION = "Soapy BladeRF - BladeRF device support for Soapy SDR. \
A Soapy module that supports BladeRF devices within the Soapy API."
LICENSE = "LGPL-2.1"

PV = "0.4.1"

RPM_NAME = "soapysdr0.8-module-bladerf-0.4.1-2.9.aarch64.rpm"
RPM_HASH = "0150d8968cc5e298858c65640e21a05865e513e2114c60ec222e9fa15cdffe0e71f9c80a59a29333032893c2caaad140ca064f05c2b8be047169a859150d4c8a"

RPROVIDES:${PN} += "libbladeRFSupport.so \
soapysdr0.8-module-bladerf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libbladeRF.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
