SUMMARY = "Eric API files for python39-qtcharts-qt5"
DESCRIPTION = "This package provides Qt5 Charts library API files for the Eric IDE."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qtcharts-qt5-api-5.15.6-1.12.aarch64.rpm"
RPM_HASH = "958a1e4f3ab93b3c543a9eb1f861f9e6f5a3af9ad592ca45b14a8f9e6fead0b4bfe001af0d3c1eecfde725f6fdc5d4ea4707e84cf2e2c4646527b53711ae574b"

RPROVIDES:${PN} += "python39-qtcharts-qt5-api"

RDEPENDS:${PN} += ""

inherit rpm
