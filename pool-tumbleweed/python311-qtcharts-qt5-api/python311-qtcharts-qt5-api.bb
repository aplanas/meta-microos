SUMMARY = "Eric API files for python311-qtcharts-qt5"
DESCRIPTION = "This package provides Qt5 Charts library API files for the Eric IDE."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qtcharts-qt5-api-5.15.6-1.14.aarch64.rpm"
RPM_HASH = "e2748421eebccb2072e9b27e6640c4b9e504fe023bcc9a25aee601eaf47781881ea2f8b3f0b821fc4b0cf685e5aad20e8f2967c8c5d26ff30d60f3a3f6f50eda"

RPROVIDES:${PN} += "python3-qtcharts-qt5-api \
python311-qtcharts-qt5-api"

RDEPENDS:${PN} += ""

inherit rpm
