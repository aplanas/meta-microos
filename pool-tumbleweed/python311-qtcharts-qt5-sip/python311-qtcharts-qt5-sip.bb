SUMMARY = "Sip files for python311-qtcharts-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings for \
python311-qtcharts-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qtcharts-qt5-sip-5.15.6-1.14.aarch64.rpm"
RPM_HASH = "a720473d7a6c4f617b75d0e89314aab2a387398fa713ac2a6c390ff7bfc7ebb768cf07184ec2d80da7a50bb4403616fd09318434991ee93dec5b398b6969f483"

RPROVIDES:${PN} += "python-qtcharts-qt5-sip \
python3-qtcharts-qt5-sip \
python311-qtcharts-qt5-sip"

RDEPENDS:${PN} += "python311-qt5-devel"

inherit rpm
