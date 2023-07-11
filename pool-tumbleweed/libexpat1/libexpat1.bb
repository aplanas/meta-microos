SUMMARY = "XML Parser Toolkit"
DESCRIPTION = "Expat is an XML parser library written in C. It is a stream-oriented \
parser in which an application registers handlers for things the \
parser might find in the XML document (like start tags)."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "libexpat1-2.5.0-2.4.aarch64.rpm"
RPM_HASH = "7ddb855c031fe415a26cc42072dead742a8f206ba0328640b26f72cc01b1b60741e635cbcbe9ad414aea76c1815911db4f9c75eb0c3baf1b752db3430d1f68a0"

RPROVIDES:${PN} += "libexpat.so.1 \
libexpat1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
