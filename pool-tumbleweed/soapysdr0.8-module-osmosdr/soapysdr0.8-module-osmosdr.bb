SUMMARY = "SoapySDR osmosdr module"
DESCRIPTION = "Soapy OsmoSDR - OsmoSDR device support for Soapy SDR. \
A Soapy module that supports OsmoSDR devices within the Soapy API."
LICENSE = "GPL-3.0-only"

PV = "0.2.5"

RPM_NAME = "soapysdr0.8-module-osmosdr-0.2.5-8.13.aarch64.rpm"
RPM_HASH = "873d609955c81325c85df279ae1fc2709bfc25b72ce6ca1cd39ede59ab6e86e080292996b627644876b15932e264ed710cebbaf271218504a01edbd18f82b75d"

RPROVIDES:${PN} += "libosmosdrSupport.so \
soapysdr0.8-module-osmosdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapyOsmoSDR.so.0 \
libSoapySDR.so.0.8 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libosmosdr.so.0 \
libstdc++.so.6"

inherit rpm
