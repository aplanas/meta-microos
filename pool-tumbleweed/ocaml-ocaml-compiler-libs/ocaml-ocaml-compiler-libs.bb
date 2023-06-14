SUMMARY = "Compiler libraries repackaged"
DESCRIPTION = "This package simply repackage the OCaml compiler libraries so they \
don't expose everything at toplevel. For instance Ast_helper is now \
Ocaml_common.Ast_helper."
LICENSE = "MIT"

PV = "0.12.4"

RPM_NAME = "ocaml-ocaml-compiler-libs-0.12.4-1.11.aarch64.rpm"
RPM_HASH = "f3f96538d56682185b2a76452c968df5fe48c9c4fc3781747c09a2bcf2d7137e8fffc5749e7d803fc97e2aa423ac2836281bf0ea092eb7d98aa39a9b4cd019c0"

RPROVIDES:${PN} += "ocaml-ocaml-compiler-libs"

RDEPENDS:${PN} += ""

inherit rpm
