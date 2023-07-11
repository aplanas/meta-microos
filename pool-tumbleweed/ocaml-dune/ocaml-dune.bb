SUMMARY = "A composable build system for OCaml"
DESCRIPTION = "This package provides the dune binary and the documentation."
LICENSE = "MIT"

PV = "3.8.3"

RPM_NAME = "ocaml-dune-3.8.3-1.1.aarch64.rpm"
RPM_HASH = "abdd4b155fa2fe29715a3e8a7a862af2d66fcc3c48b905fe7a2a1e6e834d584a13b7b650fdefcaf0a9d6beb37fd89003ee9d6e5336fe61328e8f1943f8adb142"

RPROVIDES:${PN} += "ocaml-dune \
ocaml-dune-bootstrap \
ocaml-dune-bootstrap-devel"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
ocamlfind-compiler-libs"

inherit rpm
