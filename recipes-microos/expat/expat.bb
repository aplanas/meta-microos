SUMMARY = "XML Parser Toolkit"
DESCRIPTION = "Expat is an XML parser library written in C. It is a stream-oriented \
parser in which an application registers handlers for things the \
parser might find in the XML document (like start tags)."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "expat-2.5.0-2.3.aarch64.rpm"
RPM_HASH = "e6ce940a324392afd9ad8cb801764a2b2d19c90295b9de132ea830c8b5fa8306919aabbe6b5652385292946244939b4ddbf89f0ac2dcbd8007cdb0701310d213"

RPROVIDES:${PN} += "expat expat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libexpat.so.1()(64bit)"

inherit rpm
