SUMMARY = "Documentation for python-efl"
DESCRIPTION = "HTML formated documentation for python-efl module."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.26.0"

RPM_NAME = "python-efl-doc-1.26.0-2.1.aarch64.rpm"
RPM_HASH = "696f4c4f36369b9815c4a77ab30421bb1616cff01e4b3065362a09b1ecbfc86a39d46298ada906b253f58506b52ad6dcf34239177f0751b762765b4701000282"

RPROVIDES:${PN} += "python-efl-doc \
python3-efl-doc"

RDEPENDS:${PN} += ""

inherit rpm
