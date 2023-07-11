SUMMARY = "XML Editor Development Files"
DESCRIPTION = "QXmlEdit is a XML editor written in Qt. It uses a tree-based \
interface to ease the edit of long files. \
 \
This package includes QXmlEdit development files."
LICENSE = "LGPL-2.0-or-later & LGPL-3.0-or-later"

PV = "0.9.17"

RPM_NAME = "qxmledit-devel-0.9.17-1.6.aarch64.rpm"
RPM_HASH = "5f3fffe55f302ec55ddfb741bdeda06a6f714ea5e9d2ae7335534dda8ba0c69b678846af42419568a9faf6d84057ebfeea77d045f217f9b7e1fa9d745bc83005"

RPROVIDES:${PN} += "qxmledit-devel"

RDEPENDS:${PN} += "libqxmledit-0-9-17-0"

inherit rpm
