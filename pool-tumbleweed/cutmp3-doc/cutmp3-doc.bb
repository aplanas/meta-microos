SUMMARY = "Documentation for cutmp3"
DESCRIPTION = "This is a program to edit MP3 files without quality loss, using an \
ncurses-based user interface. \
 \
This package contains a user guide and a list of key bindings for cutmp3"
LICENSE = "GPL-2.0+"

PV = "3.0.1"

RPM_NAME = "cutmp3-doc-3.0.1-2.22.aarch64.rpm"
RPM_HASH = "eb53d43db976568de2eefa54d8bfa44c8523f73156bb3671b4a3f00f948ef46de82ba1ec9a209d066a6c0b06c2763fcaf34f787edc3ff822f97c1f3012d95638"

RPROVIDES:${PN} += "cutmp3-doc \
cutmp3-doc(aarch-64)"
RDEPENDS:${PN} += "cutmp3"

inherit rpm
