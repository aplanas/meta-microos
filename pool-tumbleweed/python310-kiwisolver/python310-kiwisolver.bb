SUMMARY = "An implementation of the Cassowary constraint solver"
DESCRIPTION = "Kiwi is a C++ implementation of the Cassowary constraint solving \
algorithm. Kiwi is an implementation of the algorithm based on the \
seminal Cassowary paper, but it is not a refactoring of the original \
C++ solver. Kiwi ranges from 10x to 500x faster processing than the \
original Cassowary solver with the same input set, with typical use \
cases gaining a 40x improvement. Memory savings are consistently >5x. \
 \
In addition to the C++ solver, Kiwi ships with hand-rolled Python bindings."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "python310-kiwisolver-1.4.4-2.3.aarch64.rpm"
RPM_HASH = "db2e99cb54c995d62bc7132fe6d112eff7960d8636dc9640b0fef6d33b363117bc7a12dd3a186c077aea3aec24c4db397ac8eb4fa8026921117037e013d8771b"

RPROVIDES:${PN} += "python3.10dist-kiwisolver \
python310-kiwisolver \
python3dist-kiwisolver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
