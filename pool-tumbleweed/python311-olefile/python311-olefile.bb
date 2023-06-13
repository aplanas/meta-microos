SUMMARY = "Python package to read and write Microsoft OLE2 files"
DESCRIPTION = "Olefile is a Python package to parse, read and write Microsoft OLE2 \
files (also called Structured Storage, Compound File Binary Format or \
Compound Document File Format), such as Microsoft Office 97-2003 \
documents, vbaProject.bin in MS Office 2007+ files, Image Composer and \
FlashPix files, Outlook messages, StickyNotes, several Microscopy file \
formats, McAfee antivirus quarantine files, etc."
LICENSE = "BSD-2-Clause & HPND"

PV = "0.46"

RPM_NAME = "python311-olefile-0.46-4.1.noarch.rpm"
RPM_HASH = "5450ff79e5a9931ed1a1277415ea58c3823f919e3e2e55a2777a62d47dd94d27b7029e194e6a37e70ba4cd8eb1b8469c41eb9cd1459316637cdc0fb50837c2b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(olefile) \
python311-olefile \
python3dist(olefile)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
