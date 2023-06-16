SUMMARY = "A VBA p-code disassembler"
DESCRIPTION = "Disassembler for p-code of VBA code in OLE2 documents. \
 \
It supports VBA5 (Office 97, MacOffice 98), VBA6 (Office 2000 to \
Office 2009) and VBA7 (Office 2010 and higher)."
LICENSE = "GPL-3.0-only"

PV = "1.2.6"

RPM_NAME = "python311-pcodedmp-1.2.6-2.10.noarch.rpm"
RPM_HASH = "5cd70679db45cbd65e29b4d93afb0c97f5e6d1f960466d3bcc7c9a22558fefa926f0a87e588049b1e2ccb2589ad20b0952577840f4e9504515b4a6de051df6a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pcodedmp \
python311-pcodedmp \
python3dist-pcodedmp"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-oletools"

inherit rpm
