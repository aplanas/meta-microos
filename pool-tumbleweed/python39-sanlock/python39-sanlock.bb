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

RPM_NAME = "python39-sanlock-3.8.5-1.4.aarch64.rpm"
RPM_HASH = "3ab631eea35ba2e4a08e2cf6715b52dac2ddbcaaa1146ec809278a891b7e604e5560bfb03ecd776729e7b1e27b456b06dbccb3b3b94666002d65c31e8ff8522f"

RPROVIDES:${PN} += "python3.9dist(sanlock-python) \
python39-sanlock \
python39-sanlock(aarch-64) \
python3dist(sanlock-python) \
sanlock-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsanlock.so.1()(64bit) \
python(abi)"

inherit rpm
