SUMMARY = "Sip files for python39-qtcharts-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings for \
python39-qtcharts-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qtcharts-qt5-sip-5.15.6-1.14.aarch64.rpm"
RPM_HASH = "adc29bd4c1a277498ec6ad0791e2f8c9bd0933d7f617ae24fb1317a5e11f164697a83069ac8ecd2132b63dfe3e2de7daceea48b347a4edf3b7eb05abc751e116"

RPROVIDES:${PN} += "python-qtcharts-qt5-sip \
python39-qtcharts-qt5-sip"

RDEPENDS:${PN} += "python39-qt5-devel"

inherit rpm
