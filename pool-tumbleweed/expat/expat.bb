SUMMARY = "XML Parser Toolkit"
DESCRIPTION = "Expat is an XML parser library written in C. It is a stream-oriented \
parser in which an application registers handlers for things the \
parser might find in the XML document (like start tags)."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "expat-2.5.0-2.4.aarch64.rpm"
RPM_HASH = "10856a43645c19bff7359438d5f5725c176b230347ca513bd8d6ad36cd3368683e23645355f274410624e21ad49c057e14e73fe3a4bdc1a9cba56f5cf1d0c368"

RPROVIDES:${PN} += "expat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1"

inherit rpm
