SUMMARY = "Network UPS Tools - Documentation in HTML"
DESCRIPTION = "User manual in HTML format. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-doc-html-2.8.0-2.1.noarch.rpm"
RPM_HASH = "d116b7feae7a24ca6fd88589167a1fa17506b5f3a285287f19fbb16c0dd3c331406f27e1e504c7bdfb3feec84c39a210ce1f92b3b9ff39af23f942338eae9d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-doc-html"

RDEPENDS:${PN} += "nut-doc-images"

inherit rpm
