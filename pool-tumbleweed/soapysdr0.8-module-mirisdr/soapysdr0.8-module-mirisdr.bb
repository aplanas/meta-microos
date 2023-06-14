SUMMARY = "SoapySDR mirisdr module"
DESCRIPTION = "Soapy mirisdr - mirisdr device support for Soapy SDR. \
A Soapy module that supports Mirics SDR devices within the Soapy API."
LICENSE = "GPL-3.0-only"

PV = "0.2.5"

RPM_NAME = "soapysdr0.8-module-mirisdr-0.2.5-8.12.aarch64.rpm"
RPM_HASH = "304bae7b14f1eacf80a32fffc27f487673a6b87679beace7e34a4112093d496ba6ce4fa20848020ba92177e521ac6870fa4ad8fce04d7d7ec30f745772bb541e"

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
