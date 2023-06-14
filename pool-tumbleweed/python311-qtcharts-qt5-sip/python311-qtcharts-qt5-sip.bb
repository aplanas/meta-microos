SUMMARY = "Sip files for python311-qtcharts-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings for \
python311-qtcharts-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qtcharts-qt5-sip-5.15.6-1.12.aarch64.rpm"
RPM_HASH = "7f7775d31df48878e7830362823d33335ee63467f1f7e0a7f6d6eeb24f2bc227bc2daec883f38ddc2d1b0ae16d06b63e74c95091e0e7b60424e845c45041d6ef"

RPROVIDES:${PN} += "python-qtcharts-qt5-sip \
python311-qtcharts-qt5-sip"

RDEPENDS:${PN} += "python311-qt5-devel"

inherit rpm
