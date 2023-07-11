SUMMARY = "Libraries and headers for GDCM"
DESCRIPTION = "Header files needed for developing applications that want to make use \
of GDCM."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "gdcm-devel-3.0.21-1.8.aarch64.rpm"
RPM_HASH = "9cd085ba52fcaa80cdd44bef8f63b8e681c5c3a06f0e09906e7752629c75b028d2ada5cce8b071cb107fe874831b0545152826c1f0118504e9c0bc951437ee35"

RPROVIDES:${PN} += "cmake-GDCM \
gdcm-devel"

RDEPENDS:${PN} += "gdcm-applications \
libgdcm3-0 \
libsocketxx1-2"

inherit rpm
