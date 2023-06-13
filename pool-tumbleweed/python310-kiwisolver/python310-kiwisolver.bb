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

RPM_NAME = "python310-kiwisolver-1.4.4-2.1.aarch64.rpm"
RPM_HASH = "6d9a4da899b39dd97a05f9301821e890a978e9b9d34b98883331065773d2b0ec2173e094fe2510fd9e2808e30141f8adc19bb030dcc98758341654fd7529e551"

RPROVIDES:${PN} += "python3-kiwisolver \
python3.10dist(kiwisolver) \
python310-kiwisolver \
python310-kiwisolver(aarch-64) \
python3dist(kiwisolver)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
