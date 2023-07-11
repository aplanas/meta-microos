SUMMARY = "Python package to read and write Microsoft OLE2 files"
DESCRIPTION = "Olefile is a Python package to parse, read and write Microsoft OLE2 \
files (also called Structured Storage, Compound File Binary Format or \
Compound Document File Format), such as Microsoft Office 97-2003 \
documents, vbaProject.bin in MS Office 2007+ files, Image Composer and \
FlashPix files, Outlook messages, StickyNotes, several Microscopy file \
formats, McAfee antivirus quarantine files, etc."
LICENSE = "BSD-2-Clause & HPND"

PV = "0.46"

RPM_NAME = "python311-olefile-0.46-4.2.noarch.rpm"
RPM_HASH = "3ad71e96f942a9b050e2d6a573eac87d9f6ff96cf3dccda61f15557e1c929ffe4164f4e67106b8f0bda48d4405bfbe7168d0208134c516ba65f15ba6a75fe7ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-olefile \
python3.11dist-olefile \
python311-olefile \
python3dist-olefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
