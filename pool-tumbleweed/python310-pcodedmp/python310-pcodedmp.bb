SUMMARY = "A VBA p-code disassembler"
DESCRIPTION = "Disassembler for p-code of VBA code in OLE2 documents. \
 \
It supports VBA5 (Office 97, MacOffice 98), VBA6 (Office 2000 to \
Office 2009) and VBA7 (Office 2010 and higher)."
LICENSE = "GPL-3.0-only"

PV = "1.2.6"

RPM_NAME = "python310-pcodedmp-1.2.6-2.10.noarch.rpm"
RPM_HASH = "4eafbfaf120aca46a9baa3d95a1f005bc8e108838c95447c486546a24c7c9a2348410a5256a32d6cdbaded970c6f269ea10cf8d92c30ca2bd39e0634f39b234e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pcodedmp \
python3.10dist-pcodedmp \
python310-pcodedmp \
python3dist-pcodedmp"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-oletools"

inherit rpm
