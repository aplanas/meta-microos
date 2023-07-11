SUMMARY = "Python package to read and write Microsoft OLE2 files"
DESCRIPTION = "Olefile is a Python package to parse, read and write Microsoft OLE2 \
files (also called Structured Storage, Compound File Binary Format or \
Compound Document File Format), such as Microsoft Office 97-2003 \
documents, vbaProject.bin in MS Office 2007+ files, Image Composer and \
FlashPix files, Outlook messages, StickyNotes, several Microscopy file \
formats, McAfee antivirus quarantine files, etc."
LICENSE = "BSD-2-Clause & HPND"

PV = "0.46"

RPM_NAME = "python39-olefile-0.46-4.2.noarch.rpm"
RPM_HASH = "186dcba41a9465a7f4a2870338892ae4a4fbb9ac2c027bdbfb23013bd63a2fc260e2e78855ee9b941c223dba7df1c140790d03fc8f691b2e92e756565e81b505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-olefile \
python39-olefile \
python3dist-olefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
