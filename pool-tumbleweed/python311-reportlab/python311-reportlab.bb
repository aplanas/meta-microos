SUMMARY = "The Reportlab Toolkit"
DESCRIPTION = "The ReportLab Toolkit. An Open Source Python library for generating PDFs and graphics."
LICENSE = "BSD-3-Clause"

PV = "3.6.12"

RPM_NAME = "python311-reportlab-3.6.12-2.6.aarch64.rpm"
RPM_HASH = "9cc5ccb81bc5f81e28b685fe596b8a6eb5d201fee9ca817ea132e97fc4f184c60a793efbb9866ae20824df970ffdf8aa1598d3830ebea8e5cf235bcf3b528f41"

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
