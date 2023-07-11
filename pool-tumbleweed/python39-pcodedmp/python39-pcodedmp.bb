SUMMARY = "A VBA p-code disassembler"
DESCRIPTION = "Disassembler for p-code of VBA code in OLE2 documents. \
 \
It supports VBA5 (Office 97, MacOffice 98), VBA6 (Office 2000 to \
Office 2009) and VBA7 (Office 2010 and higher)."
LICENSE = "GPL-3.0-only"

PV = "1.2.6"

RPM_NAME = "python39-pcodedmp-1.2.6-2.12.noarch.rpm"
RPM_HASH = "ea2ac9dba373a4e8ae07f845cd9607153b8a591b8250c9b4b9dbcbddd2ebf09989e0b5439cc649ea63def2eae4ae321642a35ab324b4bb11d25db8d03703f63f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pcodedmp \
python39-pcodedmp \
python3dist-pcodedmp"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-oletools"

inherit rpm
