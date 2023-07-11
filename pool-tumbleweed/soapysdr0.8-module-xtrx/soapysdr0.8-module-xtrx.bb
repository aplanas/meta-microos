SUMMARY = "SoapySDR XTRX module"
DESCRIPTION = "Soapy XTRX - XTRX device support for Soapy SDR. \
A Soapy module that supports XTRX devices within the Soapy API."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "soapysdr0.8-module-xtrx-0.0.0+git.20201202-3.8.aarch64.rpm"
RPM_HASH = "215e4e3814763a7187122ab1805c945f7cb849a2a16cf3460b0e24d3d18dc3fe9e349063b367b883bd61153e2f2a431f916de4f407ee689cfe6333c7056d570d"

RPROVIDES:${PN} += "libXTRXSupport.so \
soapysdr0.8-module-xtrx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxtrx.so.0"

inherit rpm
