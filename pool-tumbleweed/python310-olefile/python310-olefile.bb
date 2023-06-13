SUMMARY = "Python package to read and write Microsoft OLE2 files"
DESCRIPTION = "Olefile is a Python package to parse, read and write Microsoft OLE2 \
files (also called Structured Storage, Compound File Binary Format or \
Compound Document File Format), such as Microsoft Office 97-2003 \
documents, vbaProject.bin in MS Office 2007+ files, Image Composer and \
FlashPix files, Outlook messages, StickyNotes, several Microscopy file \
formats, McAfee antivirus quarantine files, etc."
LICENSE = "BSD-2-Clause & HPND"

PV = "0.46"

RPM_NAME = "python310-olefile-0.46-4.1.noarch.rpm"
RPM_HASH = "8a28dc4212dc127944717d89c2f94917b08b6fdc0ba708612f5800f6b1a15c495505b2414bf83a0896500e05c9c8009671ef7fa5a9cf69a5b9ddb96a91fe67af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-olefile \
python3.10dist(olefile) \
python310-olefile \
python3dist(olefile)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
