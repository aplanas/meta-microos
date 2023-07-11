SUMMARY = "Srecord PDF documentation"
DESCRIPTION = "The srecord package is a collection of powerful tools for manipulating EPROM \
load files. It reads and writes numerous EPROM file formats, and can perform \
many different manipulations. \
 \
This package contains documentation in PDF format."
LICENSE = "GPL-3.0+"

PV = "1.64"

RPM_NAME = "srecord-doc-1.64-4.34.noarch.rpm"
RPM_HASH = "09117b0e212c7c3e3d70288b21cde54185edbd0574372db8e4f3ac37d5af4f2ea8f5d7db80c144a626dfa5418dbd23e46c40e15a81464f5601941498f17361f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "srecord-doc"

RDEPENDS:${PN} += ""

inherit rpm
