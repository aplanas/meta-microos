SUMMARY = "Files needed for developing Python scripts which use Xapian"
DESCRIPTION = "Xapian is a probabilistic information retrieval library. It offers an \
adaptable toolkit that allows developers to add advanced indexing and \
search facilities to applications. \
This package provides the files needed for developing Python 3 scripts \
which use Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "python310-xapian-1.4.21-2.7.aarch64.rpm"
RPM_HASH = "42d8e5ef0e2163de89153eddfc967b11ad812e68cf7aea87fc528ecf4cac085304aca83c1d2755c1620d52a1e0a9a602225b22b248515d3771bfa1b519a37ae2"

RPROVIDES:${PN} += "python310-xapian"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30 \
python-abi"

inherit rpm
