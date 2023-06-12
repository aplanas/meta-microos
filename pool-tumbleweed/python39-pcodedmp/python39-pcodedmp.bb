SUMMARY = "A VBA p-code disassembler"
DESCRIPTION = "Disassembler for p-code of VBA code in OLE2 documents. \
 \
It supports VBA5 (Office 97, MacOffice 98), VBA6 (Office 2000 to \
Office 2009) and VBA7 (Office 2010 and higher)."
LICENSE = "GPL-3.0-only"

PV = "1.2.6"

RPM_NAME = "python39-pcodedmp-1.2.6-2.10.noarch.rpm"
RPM_HASH = "dca8ec738f1c97c10ff59dbbb59606ca761d900601c190aceb17e2ea8bf93f6f9a7d459aae667bae02d28c9ffef6bab8ae9a3aeea0d421a54b0987cf1fc09d3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pcodedmp) \
python39-pcodedmp \
python3dist(pcodedmp)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-oletools"

inherit rpm
