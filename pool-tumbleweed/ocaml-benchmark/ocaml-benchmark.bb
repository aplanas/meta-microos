SUMMARY = "Benchmarking module for OCaml"
DESCRIPTION = "Benchmark provides functions to measure and compare the run-time of functions. \
It is inspired by the Perl module of the same name."
LICENSE = "LGPL-3.0-or-later-WITH-OCaml-linking-exception"

PV = "1.6"

RPM_NAME = "ocaml-benchmark-1.6-1.24.aarch64.rpm"
RPM_HASH = "4914466947d3a01f84566e508e17858c3e7da8cea2ebd9124019d8ada42c6d1f09ad1f240ae23925909c411c090325f9c72f5586d12215abb2a1bdd14f7b107e"

RPROVIDES:${PN} += "ocaml-benchmark \
ocaml-benchmark(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
