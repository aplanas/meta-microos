SUMMARY = "The Reportlab Toolkit"
DESCRIPTION = "The ReportLab Toolkit. An Open Source Python library for generating PDFs and graphics."
LICENSE = "BSD-3-Clause"

PV = "3.6.12"

RPM_NAME = "python311-reportlab-3.6.12-3.1.aarch64.rpm"
RPM_HASH = "c2178a2c7e3d85cee3253a663653ceea3ebe926d401a16bf940c40be389adeb4c09fe44d581166562fc0bb4d962c0c6054161976a4e5d2514b52a0c4523cde5d"

RPROVIDES:${PN} += "python3-ReportLab \
python3-reportlab \
python3.11dist-reportlab \
python311-ReportLab \
python311-reportlab \
python3dist-reportlab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
python-abi \
python311-Pillow"

inherit rpm
