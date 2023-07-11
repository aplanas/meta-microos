SUMMARY = "Files needed for developing Python scripts which use Xapian"
DESCRIPTION = "Xapian is a probabilistic information retrieval library. It offers an \
adaptable toolkit that allows developers to add advanced indexing and \
search facilities to applications. \
This package provides the files needed for developing Python 3 scripts \
which use Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "python311-xapian-1.4.21-2.7.aarch64.rpm"
RPM_HASH = "7294332f5f88096e34936d2134ee168a5f5df7d7d49b36745c9cd91d0e86dd3dae0666c1fa5e3732048ca4f5865341e888df45cc72565d6e5ceddd1d28626116"

RPROVIDES:${PN} += "python3-xapian \
python311-xapian"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30 \
python-abi"

inherit rpm
