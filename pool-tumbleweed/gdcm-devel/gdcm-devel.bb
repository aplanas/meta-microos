SUMMARY = "Libraries and headers for GDCM"
DESCRIPTION = "Header files needed for developing applications that want to make use \
of GDCM."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "gdcm-devel-3.0.21-1.5.aarch64.rpm"
RPM_HASH = "e9ded2a2b8ea1fa5648d37f364fb175551aff99c90505cad6b86c773d98cdbd91f7569e46879b2a5cc007b2b29bbbbb261ac58f9df255faae9eed1209c5c56ea"

RPROVIDES:${PN} += "cmake(GDCM) \
gdcm-devel \
gdcm-devel(aarch-64)"

RDEPENDS:${PN} += "gdcm-applications(aarch-64) \
libgdcm3_0 \
libsocketxx1_2"

inherit rpm
