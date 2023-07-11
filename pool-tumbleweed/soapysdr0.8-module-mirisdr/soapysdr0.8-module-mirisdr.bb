SUMMARY = "SoapySDR mirisdr module"
DESCRIPTION = "Soapy mirisdr - mirisdr device support for Soapy SDR. \
A Soapy module that supports Mirics SDR devices within the Soapy API."
LICENSE = "GPL-3.0-only"

PV = "0.2.5"

RPM_NAME = "soapysdr0.8-module-mirisdr-0.2.5-8.13.aarch64.rpm"
RPM_HASH = "977def8d0099773d2f9776c6a7276ceada89dc9c2bd344a46ca3c577b30253b96109fc604cfb1878b964a43536d718bdaa44c692634983f2a3fbad6fcc7f7013"

RPROVIDES:${PN} += "libmiriSupport.so \
soapysdr0.8-module-mirisdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapyOsmoSDR.so.0 \
libSoapySDR.so.0.8 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libmirisdr.so.0 \
libstdc++.so.6"

inherit rpm
