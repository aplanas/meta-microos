SUMMARY = "Files needed for developing TCL scripts which use Xapian"
DESCRIPTION = "Xapian is a probabilistic information retrieval library. It offers an \
adaptable toolkit that allows developers to add advanced indexing and \
search facilities to applications. \
This package provides the files needed for developing Tcl scripts \
which use Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "tcl8-xapian-1.4.21-2.7.aarch64.rpm"
RPM_HASH = "397c75491e1f95c44eb9948e2ad6474784a93c95393241a0151e9cdfe3ed6d41f01fed325820a8a0c4cbc7bce34198fe743a185fa91fc5334ecb198d86d4071e"

RPROVIDES:${PN} += "tcl8-xapian"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30 \
tcl"

inherit rpm
