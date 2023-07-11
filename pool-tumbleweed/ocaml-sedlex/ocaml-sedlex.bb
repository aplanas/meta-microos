SUMMARY = "Unicode-friendly lexer generator"
DESCRIPTION = "A lexer generator for OCaml, similar to ocamllex, but supporting Unicode. \
Contrary to ocamllex, lexer specifications for sedlex are embedded in \
regular OCaml source files."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "ocaml-sedlex-3.1-3.2.aarch64.rpm"
RPM_HASH = "ebcc4a940e49ee4153a4b743e17ece7eab70f19576562ca1e8092a0c023d1d6496ce77017cb8632abdd8cdd4977fd90eca3ddaff85b1f81b7b6bf7ae3476df20"

RPROVIDES:${PN} += "ocaml-sedlex"

RDEPENDS:${PN} += ""

inherit rpm
