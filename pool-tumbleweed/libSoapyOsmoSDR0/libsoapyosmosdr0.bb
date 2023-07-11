SUMMARY = "Soapy SDR plugins for Osmo supported SDR devices"
DESCRIPTION = "Soapy Osmo - Osmo SDR module \
Soapy SDR plugins for OsmoSDR devices"
LICENSE = "GPL-3.0-only"

PV = "0.2.5"

RPM_NAME = "libSoapyOsmoSDR0-0.2.5-8.13.aarch64.rpm"
RPM_HASH = "3dd3aab4d30ffb9f0676d23942986c461887452d1f1ca869f36263a3884ba757d8e6fca0399027fcc8a3e3d102fa5f6f9479f7777ae63d244f3c0d485936ec86"

RPROVIDES:${PN} += "libSoapyOsmoSDR.so.0 \
libSoapyOsmoSDR0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
