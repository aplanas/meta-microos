SUMMARY = "Sip files for python39-qtcharts-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings for \
python39-qtcharts-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qtcharts-qt5-sip-5.15.6-1.12.aarch64.rpm"
RPM_HASH = "3c9d9056f6f8adfce86f1aa71b45a7a50aef4d7289a21fedbe3326043414008fb35265171dfff1b859843610026917d16c7d215581ae90b15407b6c1ce2d02b4"

RPROVIDES:${PN} += "python-qtcharts-qt5-sip \
python39-qtcharts-qt5-sip"

RDEPENDS:${PN} += "python39-qt5-devel"

inherit rpm
