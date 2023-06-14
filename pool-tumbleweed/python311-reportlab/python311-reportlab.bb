SUMMARY = "The Reportlab Toolkit"
DESCRIPTION = "The ReportLab Toolkit. An Open Source Python library for generating PDFs and graphics."
LICENSE = "BSD-3-Clause"

PV = "3.6.12"

RPM_NAME = "python311-reportlab-3.6.12-2.4.aarch64.rpm"
RPM_HASH = "41ecc1fa92e08ece45f36f3e28133d9da1ae7d6fb3b63b6c55c87cb8de11750b8d52c60a55b5b73773d02386b6be121b6b1f6bbe50d620f68c21cb699c59f9ca"

RPROVIDES:${PN} += "python3.11dist-reportlab \
python311-ReportLab \
python311-reportlab \
python3dist-reportlab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
python-abi \
python311-Pillow"

inherit rpm
