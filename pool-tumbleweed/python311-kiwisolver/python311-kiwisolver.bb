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

RPM_NAME = "python311-kiwisolver-1.4.4-2.3.aarch64.rpm"
RPM_HASH = "713129d6273cac91b7310354205cc3c1ca7c46a984027b28bff4b718f69ce47c4483cb8bc98ffd8e1ab6b5bbf6e76b82b7fe0526ca5ce518d43431ecd2353343"

RPROVIDES:${PN} += "python3-kiwisolver \
python3.11dist-kiwisolver \
python311-kiwisolver \
python3dist-kiwisolver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
