SUMMARY = "The Reportlab Toolkit"
DESCRIPTION = "The ReportLab Toolkit. An Open Source Python library for generating PDFs and graphics."
LICENSE = "BSD-3-Clause"

PV = "3.6.12"

RPM_NAME = "python310-reportlab-3.6.12-2.6.aarch64.rpm"
RPM_HASH = "a209bf8a6c61a1ea278fdde21ee5099213dc529f182c669759978badfc97103d98e406a973fddf31f3f226491ecee783d99183233d34bb72d63d18f484e40c4e"

RPROVIDES:${PN} += "python3.10dist-reportlab \
python310-ReportLab \
python310-reportlab \
python3dist-reportlab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
python-abi \
python310-Pillow"

inherit rpm
