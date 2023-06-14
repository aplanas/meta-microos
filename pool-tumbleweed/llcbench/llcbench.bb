SUMMARY = "Low Level Architectural Characterization Benchmark Suite"
DESCRIPTION = "LLCbench (Low-Level Characterization Benchmarks) was created by combining \
MPBench, CacheBench, and BLASBench into a single benchmark package."
LICENSE = "GPL-3.0-or-later"

PV = "1.10"

RPM_NAME = "llcbench-1.10-5.12.aarch64.rpm"
RPM_HASH = "22d6383e80db03ee2f36344c9f9e7ebf714b1a26ab51fd7faf4c495c88107a1ced56a16cdc4b9c9e5626554a576873bceb1e6d57ea8ab7b900b0695411d66444"

RPROVIDES:${PN} += "blasbench \
cachebench \
llcbench \
mpbench"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libm.so.6 \
libmpi.so.40 \
openmpi4-libs"

inherit rpm
