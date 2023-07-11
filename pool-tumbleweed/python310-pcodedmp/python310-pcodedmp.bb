SUMMARY = "A VBA p-code disassembler"
DESCRIPTION = "Disassembler for p-code of VBA code in OLE2 documents. \
 \
It supports VBA5 (Office 97, MacOffice 98), VBA6 (Office 2000 to \
Office 2009) and VBA7 (Office 2010 and higher)."
LICENSE = "GPL-3.0-only"

PV = "1.2.6"

RPM_NAME = "python310-pcodedmp-1.2.6-2.12.noarch.rpm"
RPM_HASH = "cd4d0296d77e30e11f82f6a8f6df9ec43844b3e201733b937889098ca54a7ba0e77bdeadf5f56d309f57e23165067dbeeb824c498de8159340e87d5ef9e66d55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pcodedmp \
python310-pcodedmp \
python3dist-pcodedmp"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-oletools"

inherit rpm
