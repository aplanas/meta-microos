SUMMARY = "Development files for expat, an XML parser toolkit"
DESCRIPTION = "Expat is an XML parser library written in C. It is a stream-oriented \
parser in which an application registers handlers for things the \
parser might find in the XML document (like start tags). \
 \
This package contains the development headers for the library found \
in libexpat."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "libexpat-devel-2.5.0-2.4.aarch64.rpm"
RPM_HASH = "d02fdc933a446d34f5f7f1c44b5afce8543ebbbd465d65e9113495f7b7b76e1a924a5a9c5d48df3c9d697d64c254cdc71a343746e0bfc75fec460c173b1ad187"

RPROVIDES:${PN} += "libexpat-devel \
pkgconfig-expat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libexpat1"

inherit rpm
