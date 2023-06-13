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

RPM_NAME = "python310-sanlock-3.8.5-1.4.aarch64.rpm"
RPM_HASH = "b063bb1f2e2af1c3de14367d98cd5a1d86af5be30b8ca67408e3367b918caeedcbbc1b7068be39fb03930c3ba89a4fb355906085794d5f8d8171c4c15f830d5e"

RPROVIDES:${PN} += "python3-sanlock \
python3.10dist(sanlock-python) \
python310-sanlock \
python310-sanlock(aarch-64) \
python3dist(sanlock-python) \
sanlock-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsanlock.so.1()(64bit) \
python(abi)"

inherit rpm
