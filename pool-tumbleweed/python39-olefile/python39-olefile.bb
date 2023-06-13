SUMMARY = "Python package to read and write Microsoft OLE2 files"
DESCRIPTION = "Olefile is a Python package to parse, read and write Microsoft OLE2 \
files (also called Structured Storage, Compound File Binary Format or \
Compound Document File Format), such as Microsoft Office 97-2003 \
documents, vbaProject.bin in MS Office 2007+ files, Image Composer and \
FlashPix files, Outlook messages, StickyNotes, several Microscopy file \
formats, McAfee antivirus quarantine files, etc."
LICENSE = "BSD-2-Clause & HPND"

PV = "0.46"

RPM_NAME = "python39-olefile-0.46-4.1.noarch.rpm"
RPM_HASH = "263fedd2385eca329e20976821bc8862bb561fc85507c222535dc2b7caedf3d6a130dd8ec6cc7bd39e51a19ac560b9d796fbd1b550a3301e95c35ec4430685b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(olefile) \
python39-olefile \
python3dist(olefile)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
