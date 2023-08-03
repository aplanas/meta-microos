SUMMARY = "DigiKam development files"
DESCRIPTION = "Development headers and libraries for digiKam."
LICENSE = "GPL-2.0-or-later"

PV = "8.1.0"

RPM_NAME = "digikam-devel-8.1.0-1.1.aarch64.rpm"
RPM_HASH = "f53c4ab076664e4bd3cf576307826180451254659c75578d2e49ad856de2d6add4217b2b021db034e79d4f4321542f3b7ffcf6482ee22959eb02020e741a3d46"

RPROVIDES:${PN} += "cmake-DigikamCore \
cmake-DigikamDatabase \
cmake-DigikamGui \
cmake-DigikamPlugin \
digikam-devel"

RDEPENDS:${PN} += "libdigikamcore8-1-0"

inherit rpm
