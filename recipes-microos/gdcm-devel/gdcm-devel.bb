SUMMARY = "Libraries and headers for GDCM"
DESCRIPTION = "Header files needed for developing applications that want to make use \
of GDCM."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "gdcm-devel-3.0.21-1.4.aarch64.rpm"
RPM_HASH = "0d8d93ff4015157919a86e5e524cf1582e312fa7383ca11cf85a1c55e717427f87d19de09960783f9e8429183de9b1131636af9909919eb776503d33905d529b"

RPROVIDES:${PN} += "cmake(GDCM) gdcm-devel gdcm-devel(aarch-64)"
RDEPENDS:${PN} += "gdcm-applications(aarch-64) libgdcm3_0 libsocketxx1_2"

inherit rpm
