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

RPM_NAME = "python311-sanlock-3.8.5-1.6.aarch64.rpm"
RPM_HASH = "556fe313bfddb4b0676173949298a74f3a2cce916d6e26d5bd2b4c9c333bf088a9cc2ee32506a3af74b20ad4d9844c5819e47f1ff7f263d92caf7fcac77b76b7"

RPROVIDES:${PN} += "python3-sanlock \
python3.11dist-sanlock-python \
python311-sanlock \
python3dist-sanlock-python \
sanlock-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsanlock.so.1 \
python-abi"

inherit rpm
