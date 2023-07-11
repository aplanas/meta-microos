SUMMARY = "Files needed for developing Python scripts which use Xapian"
DESCRIPTION = "Xapian is a probabilistic information retrieval library. It offers an \
adaptable toolkit that allows developers to add advanced indexing and \
search facilities to applications. \
This package provides the files needed for developing Python 3 scripts \
which use Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "python39-xapian-1.4.21-2.7.aarch64.rpm"
RPM_HASH = "a1585f922aec1ab9e70a308d53e5028d9398514d6ed0172df575244d3d9ece1807282776fcd86a60fb89e66b3d6d93e129cfb5ed459b4ab316d8bf300bd20fd8"

RPROVIDES:${PN} += "python39-xapian"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30 \
python-abi"

inherit rpm
