SUMMARY = "SoapySDR XTRX module"
DESCRIPTION = "Soapy XTRX - XTRX device support for Soapy SDR. \
A Soapy module that supports XTRX devices within the Soapy API."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "soapysdr0.8-module-xtrx-0.0.0+git.20201202-3.7.aarch64.rpm"
RPM_HASH = "db3b9d61487b2b93ee9139a02affd0dea951f646c0f70152d72273e023984c6814e6a1bbcce038a0d570270408c91b2b1e027662fbf76ead153755da913f2ec8"

RPROVIDES:${PN} += "libXTRXSupport.so \
soapysdr0.8-module-xtrx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxtrx.so.0"

inherit rpm
