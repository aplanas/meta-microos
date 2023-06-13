SUMMARY = "Soapy SDR plugins for Osmo supported SDR devices"
DESCRIPTION = "Soapy Osmo - Osmo SDR module \
Soapy SDR plugins for OsmoSDR devices"
LICENSE = "GPL-3.0-only"

PV = "0.2.5"

RPM_NAME = "libSoapyOsmoSDR0-0.2.5-8.12.aarch64.rpm"
RPM_HASH = "ba2e2658c30412e5fa4965c98e51924e0c930ad82b0ca7725c48e34afe49547873c35b20deaa1d40f2f4c45465d71a10b58f28a99a744ce3e8485701a86446c0"

RPROVIDES:${PN} += "libSoapyOsmoSDR.so.0()(64bit) \
libSoapyOsmoSDR0 \
libSoapyOsmoSDR0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
