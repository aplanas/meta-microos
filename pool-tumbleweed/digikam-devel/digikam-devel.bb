SUMMARY = "DigiKam development files"
DESCRIPTION = "Development headers and libraries for digiKam."
LICENSE = "GPL-2.0-or-later"

PV = "8.0.0"

RPM_NAME = "digikam-devel-8.0.0-4.1.aarch64.rpm"
RPM_HASH = "5db955a12eeda79ec663edce8833d8781aba9b9c4797833236ad3e70ab3120d2922487964c02875ba128604623996607b3a1ac20d3e6a1f37cbffe832ac7857d"

RPROVIDES:${PN} += "cmake-DigikamCore \
cmake-DigikamDatabase \
cmake-DigikamGui \
cmake-DigikamPlugin \
digikam-devel"

RDEPENDS:${PN} += "libdigikamcore8-0-0"

inherit rpm
