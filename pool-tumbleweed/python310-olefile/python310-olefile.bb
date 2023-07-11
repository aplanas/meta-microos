SUMMARY = "Python package to read and write Microsoft OLE2 files"
DESCRIPTION = "Olefile is a Python package to parse, read and write Microsoft OLE2 \
files (also called Structured Storage, Compound File Binary Format or \
Compound Document File Format), such as Microsoft Office 97-2003 \
documents, vbaProject.bin in MS Office 2007+ files, Image Composer and \
FlashPix files, Outlook messages, StickyNotes, several Microscopy file \
formats, McAfee antivirus quarantine files, etc."
LICENSE = "BSD-2-Clause & HPND"

PV = "0.46"

RPM_NAME = "python310-olefile-0.46-4.2.noarch.rpm"
RPM_HASH = "27d8f129fdaf06c0b415418656ae7b66152c98dc6a05fb75ad5e433c3b6bc9fc312590787fcbf6dfc25a569228eae07f18255aafb80e04e2d2c5e42802c36c58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-olefile \
python310-olefile \
python3dist-olefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
