SUMMARY = "DAV protocol implementation"
DESCRIPTION = "kdav is a library providing a KJob-based implementation of DAV protocols such as \
CardDAV, WebDAV, and CalDAV."
LICENSE = "LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "kdav-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "cb8809407e00610431e961f15994daa615a8cf25b8e1ac178103295c4995e780208015db2580477f60d63472a091046b15f62fe222a532a75c82fdd33e91f28b"

RPROVIDES:${PN} += "kdav \
kdav(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
