SUMMARY = "Base library and tools for ppx rewriters"
DESCRIPTION = "The ppxlib project provides the basis for the ppx system, which is \
currently the officially supported method for meta-programming in \
OCaml. It offers a principled way to generate code at compile time in \
OCaml projects."
LICENSE = "MIT"

PV = "0.30.0"

RPM_NAME = "ocaml-ppxlib-0.30.0-1.1.aarch64.rpm"
RPM_HASH = "2686db2d2512b3fceffdf06a6946049e51dfc904e71525d7b17a927f6181d13d5a76a0d2e47d0f4c51127b5ae84e1d7517af977d89b27afe7219284852b70fa4"

RPROVIDES:${PN} += "ocaml-ppxlib"

RDEPENDS:${PN} += ""

inherit rpm
