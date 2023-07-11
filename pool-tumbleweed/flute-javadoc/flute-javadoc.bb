SUMMARY = "Javadoc for flute"
DESCRIPTION = "Javadoc for flute."
LICENSE = "LGPL-2.1-or-later & W3C"

PV = "1.3.0"

RPM_NAME = "flute-javadoc-1.3.0-6.7.noarch.rpm"
RPM_HASH = "0c7e435d9421b310a79f831eb31f0cc892551276dda5d6895c155a4f42944531137f24c69eabb7844aa4b62ee010a1badcb8f494368ba314c2476a0bb7070e08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flute-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
