SUMMARY = "XML Editor Development Files"
DESCRIPTION = "QXmlEdit is a XML editor written in Qt. It uses a tree-based \
interface to ease the edit of long files. \
 \
This package includes QXmlEdit development files."
LICENSE = "LGPL-2.0-or-later & LGPL-3.0-or-later"

PV = "0.9.17"

RPM_NAME = "qxmledit-devel-0.9.17-1.5.aarch64.rpm"
RPM_HASH = "300726f7ff1c1513b055672baefce1b260570bbfd6ab51340a8ebad38fd1a99a40071649e318369c8ce0aebf36aea872a96b783e723b6533521c0efa15d0bef7"

RPROVIDES:${PN} += "qxmledit-devel \
qxmledit-devel(aarch-64)"

RDEPENDS:${PN} += "libqxmledit-0_9_17-0"

inherit rpm
