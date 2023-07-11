SUMMARY = "A VBA p-code disassembler"
DESCRIPTION = "Disassembler for p-code of VBA code in OLE2 documents. \
 \
It supports VBA5 (Office 97, MacOffice 98), VBA6 (Office 2000 to \
Office 2009) and VBA7 (Office 2010 and higher)."
LICENSE = "GPL-3.0-only"

PV = "1.2.6"

RPM_NAME = "python311-pcodedmp-1.2.6-2.12.noarch.rpm"
RPM_HASH = "f6a06e6604e767c44734473f383ae1201b8b526db3ef90fa68113419fc3ddd585b4ce324166c282c1e2dd97db7862a1a83453aed4c7cd1e9d8c34aa506c0ef54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pcodedmp \
python3.11dist-pcodedmp \
python311-pcodedmp \
python3dist-pcodedmp"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-oletools"

inherit rpm
