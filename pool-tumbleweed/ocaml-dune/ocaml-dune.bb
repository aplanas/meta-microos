SUMMARY = "A composable build system for OCaml"
DESCRIPTION = "This package provides the dune binary and the documentation."
LICENSE = "MIT"

PV = "3.10.0"

RPM_NAME = "ocaml-dune-3.10.0-1.1.aarch64.rpm"
RPM_HASH = "ef0fe88a658c59b44e51ccd847ad6ebe23ef3e6a5758279a7ff7c98514241797f85b0541b3d9635c806118d32961c04967f20c2eb80236704732fd9eaee27e8e"

RPROVIDES:${PN} += "ocaml-dune \
ocaml-dune-bootstrap \
ocaml-dune-bootstrap-devel"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
ocamlfind-compiler-libs"

inherit rpm
