SUMMARY = "The Reportlab Toolkit"
DESCRIPTION = "The ReportLab Toolkit. An Open Source Python library for generating PDFs and graphics."
LICENSE = "BSD-3-Clause"

PV = "3.6.12"

RPM_NAME = "python310-reportlab-3.6.12-3.1.aarch64.rpm"
RPM_HASH = "b7f789cbdf0386bb3bfbe3d5eb4c38d1aff6cd35916d75fac7016eed242c2201f9a2199c633175ae7df9f9a4ba790b85cd535102c0e40aa0259400348363e4a3"

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
