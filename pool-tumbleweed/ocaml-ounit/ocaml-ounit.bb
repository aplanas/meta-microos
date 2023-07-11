SUMMARY = "Ocaml OUnit test framework"
DESCRIPTION = "OUnit is a unit test framework for OCaml. It allows one to easily \
create unit-tests for OCaml code. It is based on HUnit, a unit testing \
framework for Haskell. It is similar to JUnit, and other xUnit testing \
frameworks."
LICENSE = "MIT"

PV = "2.2.7"

RPM_NAME = "ocaml-ounit-2.2.7-1.2.aarch64.rpm"
RPM_HASH = "051cc742f7220cdb8a31b3b197a04235ef4e3047dce9259c3a94dbaca4549ef269a7d450c3e9758d1fc672c827ff60e5eb310bf49d431b92a3b9f10d2cc8daf3"

RPROVIDES:${PN} += "ocaml-ounit"

RDEPENDS:${PN} += ""

inherit rpm
