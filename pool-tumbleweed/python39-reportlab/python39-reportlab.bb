SUMMARY = "The Reportlab Toolkit"
DESCRIPTION = "The ReportLab Toolkit. An Open Source Python library for generating PDFs and graphics."
LICENSE = "BSD-3-Clause"

PV = "3.6.12"

RPM_NAME = "python39-reportlab-3.6.12-2.6.aarch64.rpm"
RPM_HASH = "9632bdbd4f0d558b09c352127a35fcc1afadb50e9937f68830511201f1dffd8747d0dc6389b3036c1bf5673d68eb9517e136374b862e9f469dd068c9c4c00a1a"

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
