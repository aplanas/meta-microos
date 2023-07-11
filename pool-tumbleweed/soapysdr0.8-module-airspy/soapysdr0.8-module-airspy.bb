SUMMARY = "SoapySDR Airspy module"
DESCRIPTION = "Soapy Airspy - Airspy device support for Soapy SDR. \
A Soapy module that supports Airspy devices within the Soapy API."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "soapysdr0.8-module-airspy-0.2.0-2.9.aarch64.rpm"
RPM_HASH = "cc23e413077338218875d3862d2cea7ceb06a2dda64fdc33362cb90182f0bec860b90f08e584adb6c2cda56481e9530a06b8e361410419930ac7e7335cfe5fc8"

RPROVIDES:${PN} += "libairspySupport.so \
soapysdr0.8-module-airspy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libairspy.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
