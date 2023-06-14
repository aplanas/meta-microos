SUMMARY = "Files needed for developing Python scripts which use Xapian"
DESCRIPTION = "Xapian is a probabilistic information retrieval library. It offers an \
adaptable toolkit that allows developers to add advanced indexing and \
search facilities to applications. \
This package provides the files needed for developing Python 3 scripts \
which use Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "python311-xapian-1.4.21-2.5.aarch64.rpm"
RPM_HASH = "8c43de2fb39fcb4628d4f495b2e276866479eb2e5d8c6bb3656597ebbf5574e82581e4d40e560d4f69b01e13bd0fcdd25ad501e30dd902f85cc887eb17d10683"

RPROVIDES:${PN} += "python311-xapian"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30 \
python-abi"

inherit rpm
