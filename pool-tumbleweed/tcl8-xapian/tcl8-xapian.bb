SUMMARY = "Files needed for developing TCL scripts which use Xapian"
DESCRIPTION = "Xapian is a probabilistic information retrieval library. It offers an \
adaptable toolkit that allows developers to add advanced indexing and \
search facilities to applications. \
This package provides the files needed for developing Tcl scripts \
which use Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "tcl8-xapian-1.4.21-2.5.aarch64.rpm"
RPM_HASH = "ad11acaaeb6efaf18871ef511762393e4be518d6179c01f1274da89bb19c55fb60c3dab076434bf7e5d648a8b90e06595e9eabad2a3633b4c72fafa8d8190660"

RPROVIDES:${PN} += "tcl8-xapian"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30 \
tcl"

inherit rpm
