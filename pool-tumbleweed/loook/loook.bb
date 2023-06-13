SUMMARY = "Search strings in ODF documents"
DESCRIPTION = "This program is a program written in Python that searches for strings \
in files created by OpenOffice.org, Apache OpenOffice, LibreOffice or \
StarOffice 6.0 or higher. This is especially true for all documents \
that were created in the Open Document Format. In addition, it can now \
also search in documents created by Microsoft Word, Excel or PowerPoint \
from the 2007 version in an OOXML format."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.0"

RPM_NAME = "loook-0.9.0-1.4.noarch.rpm"
RPM_HASH = "32424479a86e71f5ba0b602e1b50262eec69476991e8fd0993896495118cb3ad53873aa8e2fb4c50099fc953911c44d64685d096761248022485ef4aa011be23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(loook.desktop) \
loook"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-base \
python3-tk"

inherit rpm
