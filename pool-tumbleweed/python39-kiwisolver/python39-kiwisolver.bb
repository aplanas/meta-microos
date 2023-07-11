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

RPM_NAME = "python39-kiwisolver-1.4.4-2.3.aarch64.rpm"
RPM_HASH = "75e8350d2c82da5810130aaf2695413ccae308a4c2d076b169964693a99e109d3ac005555110aea0e8e6acf7bf4665c417f64319cd1d2b669b7a14c57671d896"

RPROVIDES:${PN} += "python3.9dist-kiwisolver \
python39-kiwisolver \
python3dist-kiwisolver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
