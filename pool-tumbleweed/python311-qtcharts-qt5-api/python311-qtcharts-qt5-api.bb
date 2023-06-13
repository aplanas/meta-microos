SUMMARY = "Eric API files for python311-qtcharts-qt5"
DESCRIPTION = "This package provides Qt5 Charts library API files for the Eric IDE."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qtcharts-qt5-api-5.15.6-1.12.aarch64.rpm"
RPM_HASH = "a2823c17f499997911bd8f80a9e46a9c695d378c668939a479794ad8efbaba02c415c85ccf750bec44f47c82ebdcecbd8324cf68ff391f66f8cdbc8becbad69e"

RPROVIDES:${PN} += "python311-qtcharts-qt5-api \
python311-qtcharts-qt5-api(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
