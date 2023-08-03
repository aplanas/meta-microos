SUMMARY = "The Reportlab Toolkit"
DESCRIPTION = "The ReportLab Toolkit. An Open Source Python library for generating PDFs and graphics."
LICENSE = "BSD-3-Clause"

PV = "3.6.12"

RPM_NAME = "python39-reportlab-3.6.12-3.1.aarch64.rpm"
RPM_HASH = "25906b764ee76598bf8827ee2088353b0a89a2532d7e22cc2380364d6ab15457ea77a78fb44006ba753b65687b1f5af165a6f1dc3329dbb1cb985235e438cb92"

RPROVIDES:${PN} += "python3.9dist-reportlab \
python39-ReportLab \
python39-reportlab \
python3dist-reportlab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
python-abi \
python39-Pillow"

inherit rpm
