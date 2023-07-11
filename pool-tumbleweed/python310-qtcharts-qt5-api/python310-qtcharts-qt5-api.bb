SUMMARY = "Eric API files for python310-qtcharts-qt5"
DESCRIPTION = "This package provides Qt5 Charts library API files for the Eric IDE."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qtcharts-qt5-api-5.15.6-1.14.aarch64.rpm"
RPM_HASH = "d26dbe4bd74d11c045404419de1d8cf72601d14c5c3415abb42399501a6db2a95a17469b03f3d2135f865b811bcedf9fe4ef8a91363e2ad99046024c9ff9c169"

RPROVIDES:${PN} += "python310-qtcharts-qt5-api"

RDEPENDS:${PN} += ""

inherit rpm
