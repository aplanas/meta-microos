SUMMARY = "Files needed for building packages which use Xapian"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval library. It offers an \
adaptable toolkit for adding indexing and search facilities to \
applications. \
 \
This subpackage contains the header files for the library."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "libxapian-devel-1.4.21-1.3.aarch64.rpm"
RPM_HASH = "3b5cee9de1002cc9faf06b20947260c4c99f693a78538ba2a2eef5a9c99c755a3e53c2488df595d87782b11ddf83e4c8dce85b9365ed31a96946b77cbb3c0c2e"

RPROVIDES:${PN} += "libxapian-devel \
pkgconfig-xapian-core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
gcc-c++ \
libuuid-devel \
libxapian30 \
zlib-devel"

inherit rpm
