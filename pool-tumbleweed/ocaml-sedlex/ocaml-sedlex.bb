SUMMARY = "Unicode-friendly lexer generator"
DESCRIPTION = "A lexer generator for OCaml, similar to ocamllex, but supporting Unicode. \
Contrary to ocamllex, lexer specifications for sedlex are embedded in \
regular OCaml source files."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "ocaml-sedlex-3.1-3.1.aarch64.rpm"
RPM_HASH = "fb5b74394e3327667970febdc06624aa178d8d208f25b1297e088a8daae2c2709ad703bb3d5155e3b9449b346808d9881df6f759685e76d12e19b5fb7bf5e23d"

RPROVIDES:${PN} += "ocaml-sedlex"

RDEPENDS:${PN} += ""

inherit rpm
