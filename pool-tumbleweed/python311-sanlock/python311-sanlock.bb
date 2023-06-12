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

RPM_NAME = "python311-sanlock-3.8.5-1.4.aarch64.rpm"
RPM_HASH = "8ac6f1b5b63fd82f424e9bd1209eed6f7bc379d7b63e9e779bc71098fd668a2b3c5e62fd180d194cd10995a100649193c341e3eb6757705cbb4326cbd089ad5e"

RPROVIDES:${PN} += "python3.11dist(sanlock-python) \
python311-sanlock \
python311-sanlock(aarch-64) \
python3dist(sanlock-python) \
sanlock-python"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsanlock.so.1()(64bit) \
python(abi)"

inherit rpm
