SUMMARY = "Libraries and headers for GDCM"
DESCRIPTION = "Header files needed for developing applications that want to make use \
of GDCM."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "gdcm-devel-3.0.21-1.9.aarch64.rpm"
RPM_HASH = "5f69e18cce36861f80c8b370f1d60bbeea39a45bd90c48eeda037e4401aa71a58fd53a7d34d701cc432083159ab8bcdbe10dabd235dbb3b0b2d7d96751bf2e1b"

RPROVIDES:${PN} += "cmake-GDCM \
gdcm-devel"

RDEPENDS:${PN} += "gdcm-applications \
libgdcm3-0 \
libsocketxx1-2"

inherit rpm
