SUMMARY = "Sip files for python310-qtcharts-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings for \
python310-qtcharts-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qtcharts-qt5-sip-5.15.6-1.14.aarch64.rpm"
RPM_HASH = "762e2d2543fdc6b8dbe91e43a4712a3d813eaa166b5d4e22655720a7f96a98537fd13d7fffa9fa064e6a0021a9dace7590b3126c0e85a555a9968016f00bf7eb"

RPROVIDES:${PN} += "python-qtcharts-qt5-sip \
python310-qtcharts-qt5-sip"

RDEPENDS:${PN} += "python310-qt5-devel"

inherit rpm
