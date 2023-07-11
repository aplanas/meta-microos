SUMMARY = "Python bindings for SoapySDR"
DESCRIPTION = "Python Bindings for SoapySDR. \
A vendor neutral and platform independent SDR support library."
LICENSE = "BSL-1.0"

PV = "0.8.1"

RPM_NAME = "python3-SoapySDR-0.8.1-1.12.aarch64.rpm"
RPM_HASH = "b790a6a0677f204465e0234f826275d70e0ea777a5c4b6a5d9c9bf89155031019be76cdb9e30df686deed1b2f89470c390adec0adcaddb6a7c441750035f84ba"

RPROVIDES:${PN} += "python-soapy-sdr \
python3-SoapySDR"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
