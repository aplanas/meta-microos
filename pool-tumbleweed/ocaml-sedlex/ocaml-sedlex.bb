SUMMARY = "Unicode-friendly lexer generator"
DESCRIPTION = "A lexer generator for OCaml, similar to ocamllex, but supporting Unicode. \
Contrary to ocamllex, lexer specifications for sedlex are embedded in \
regular OCaml source files."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "ocaml-sedlex-3.2-1.1.aarch64.rpm"
RPM_HASH = "6bf10f0e81ddebf9bb364093e2f668b5df075c3be4d2645a4d49b598552def09efbd3a8906ab10c0dfe1140767cc6989f42ea8bab9e4967498870e2a4d00d8b3"

RPROVIDES:${PN} += "ocaml-sedlex"

RDEPENDS:${PN} += ""

inherit rpm
