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

RPM_NAME = "python311-kiwisolver-1.4.4-2.1.aarch64.rpm"
RPM_HASH = "d7da73fc29b7420bae68da8296230f3fb88465659891fec6c6ef101ea11bb5a0039dc7c8d16c31d9e3baccdcf350c5a55514bda849949ff906207d7066c80211"

RPROVIDES:${PN} += "python3.11dist(kiwisolver) \
python311-kiwisolver \
python311-kiwisolver(aarch-64) \
python3dist(kiwisolver)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
