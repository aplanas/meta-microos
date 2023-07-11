SUMMARY = "Compiler libraries repackaged"
DESCRIPTION = "This package simply repackage the OCaml compiler libraries so they \
don't expose everything at toplevel. For instance Ast_helper is now \
Ocaml_common.Ast_helper."
LICENSE = "MIT"

PV = "0.12.4"

RPM_NAME = "ocaml-ocaml-compiler-libs-0.12.4-1.12.aarch64.rpm"
RPM_HASH = "0ce42c86d20a7681a31e25cb7e0ee08bf91329c32a94d9afbbdad96847802dad2a9d73dff3aa0bfa8f2f63b656a89af65eadb872a714e85e83b572bad02470cc"

RPROVIDES:${PN} += "ocaml-ocaml-compiler-libs"

RDEPENDS:${PN} += ""

inherit rpm
