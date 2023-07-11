SUMMARY = "Python bindings for the sanlock library"
DESCRIPTION = "sanlock uses disk paxos to manage leases on shared storage. \
Hosts connected to a common SAN can use this to synchronize their \
access to the shared disks. \
 \
This package provides a module that permits applications written in \
the Python programming language to use the interface supplied by the \
sanlock library."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.8.5"

RPM_NAME = "python39-sanlock-3.8.5-1.6.aarch64.rpm"
RPM_HASH = "6f02abce562c26e83caeabd1424400319267c9ca5a641a2a6eb011fe2bd24b2f50f60c1dca02b2509eb1df1c227828ce3599839d057ad566526f659d3c7b3988"

RPROVIDES:${PN} += "python3.9dist-sanlock-python \
python39-sanlock \
python3dist-sanlock-python \
sanlock-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsanlock.so.1 \
python-abi"

inherit rpm
