SUMMARY = "Eric API files for python39-qtcharts-qt5"
DESCRIPTION = "This package provides Qt5 Charts library API files for the Eric IDE."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qtcharts-qt5-api-5.15.6-1.14.aarch64.rpm"
RPM_HASH = "b317e7e738bc6ea04a14cb37768f111d1a345d3a361b076d1cd9e7d6e15e3010befcb17ca7a3b7cb120c532f336ef4728969d90079f3db0b99fe22e720e0aeb8"

RPROVIDES:${PN} += "python39-qtcharts-qt5-api"

RDEPENDS:${PN} += ""

inherit rpm
