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

RPM_NAME = "python310-sanlock-3.8.5-1.6.aarch64.rpm"
RPM_HASH = "c97ffef665144fe39e21d298e6e956d3229b42df7500b5c3ac77cd6535f5bfd7d5174ba41b109f6316c7cd114148bd2d575944f26d78841ed66f1dbfa82fbd44"

RPROVIDES:${PN} += "python3.10dist-sanlock-python \
python310-sanlock \
python3dist-sanlock-python \
sanlock-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsanlock.so.1 \
python-abi"

inherit rpm
