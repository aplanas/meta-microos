SUMMARY = "Benchmark to evaluate the performance of incompressible fluid analysis code"
DESCRIPTION = "Benchmark to evaluate the performance of incompressible fluid analysis \
code. This benchmark program measures the speed of major loops to solve \
Poisson's equation folution using Jacobi iteration method."
LICENSE = "LGPL-2.0+"

PV = "3"

RPM_NAME = "himeno-3-25.24.aarch64.rpm"
RPM_HASH = "de9624cfdbf7b2762a775f649a2ac4556881d03476a89bc3485ad0aac5c2929504a6c4fb14356823c0ab60084d3ccf6776b2178a1573f972078783f246bd2853"

RPROVIDES:${PN} += "himeno"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
