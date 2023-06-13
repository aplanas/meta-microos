SUMMARY = "Server for remote device support for Soapy SDR"
DESCRIPTION = "A server that supports remote devices for the Soapy SDR. \
This package is intended to run on the system the sdr device is \
connected to."
LICENSE = "BSL-1.0"

PV = "0.5.2"

RPM_NAME = "soapy-remote-server-0.5.2-3.8.aarch64.rpm"
RPM_HASH = "484ae93392d21d7a262ac70ae164e3727006289206c66a869b66d4d7ac9bb65a59b53b1ef6f596067ebff089647ce08d81e4dd676e72b5dcddac062895b4731e"

RPROVIDES:${PN} += "soapy-remote-server \
soapy-remote-server(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libSoapySDR.so.0.8()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
