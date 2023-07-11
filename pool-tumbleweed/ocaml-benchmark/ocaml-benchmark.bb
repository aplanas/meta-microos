SUMMARY = "Benchmarking module for OCaml"
DESCRIPTION = "Benchmark provides functions to measure and compare the run-time of functions. \
It is inspired by the Perl module of the same name."
LICENSE = "LGPL-3.0-or-later-with-OCaml-linking-exception"

PV = "1.6"

RPM_NAME = "ocaml-benchmark-1.6-1.25.aarch64.rpm"
RPM_HASH = "304c13dea892c2be5e63b98c67d14ecd798e47c1b9a4ce041a5d754aa22649a34a24246081de9230e4fa0083119a423660d73afa25f8d692811b84325750296b"

RPROVIDES:${PN} += "ocaml-benchmark"

RDEPENDS:${PN} += ""

inherit rpm
