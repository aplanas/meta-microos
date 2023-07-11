SUMMARY = "SoapySDR LMS7 support module"
DESCRIPTION = "Soapy LMS7 - LimeSDR device support for Soapy SDR. \
A Soapy module that supports LimeSDR devices within the Soapy API."
LICENSE = "Apache-2.0"

PV = "22.09.1"

RPM_NAME = "soapysdr0.8-module-lms7-22.09.1-2.3.aarch64.rpm"
RPM_HASH = "a6b94ac50466145961ecd32b9ba060f8c7041e3a9adb1725b675002158b822c6c911a17878d8f6a3ab800d85d7573d804b2df0dbc30a41d87831c1778939994b"

RPROVIDES:${PN} += "libLMS7Support.so \
soapysdr0.8-module-lms7"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLimeSuite.so.22.09-1 \
libSoapySDR.so.0.8 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
