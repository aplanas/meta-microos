SUMMARY = "A composable build system for OCaml"
DESCRIPTION = "This package provides the dune binary and the documentation."
LICENSE = "MIT"

PV = "3.9.1"

RPM_NAME = "ocaml-dune-3.9.1-1.1.aarch64.rpm"
RPM_HASH = "fe89fd3e3380098c26a4e6cecd0c6c0fb2040ba1f4472e03b45c1c385a5b0c27c74e1a44136c8eb639ad9552c000c26adfd88daaffec329d886f9b9613f07754"

RPROVIDES:${PN} += "ocaml-dune \
ocaml-dune-bootstrap \
ocaml-dune-bootstrap-devel"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
ocamlfind-compiler-libs"

inherit rpm
