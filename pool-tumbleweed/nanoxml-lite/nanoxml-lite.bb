SUMMARY = "Lite version of nanoxml"
DESCRIPTION = "NanoXML/Lite is the successor of NanoXML 1.x. It is still small (only \
6KB) and features a much faster algorithm. It is recommended if you \
are currently using NanoXML 1.x and do not want to adapt your code \
for the new API or if you are coding applications that have to be \
very small (like applets or embedded code). Please note that \
NanoXML/Lite has only limited functionality (no mixed content, DTD is \
ignored...)."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-lite-2.2.3-4.7.noarch.rpm"
RPM_HASH = "e1ac75a1d237ab44e87805771178b062f198c64a1605b14fcefb6e025fc9f99db27dd8d9abaa4f413f925802ec8f64f6e0255b2e72b24f11634e27011a8cc109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml-lite"

RDEPENDS:${PN} += ""

inherit rpm
