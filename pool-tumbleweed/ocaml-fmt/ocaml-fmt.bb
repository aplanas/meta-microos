SUMMARY = "Format pretty-printer combinators"
DESCRIPTION = "Fmt exposes combinators to devise Format pretty-printing functions. \
 \
Fmt depends only on the OCaml standard library. The optional Fmt_tty library that allows to setup formatters for terminal color output depends on the Unix library. The optional Fmt_cli library that provides command line support for Fmt depends on Cmdliner."
LICENSE = "ISC"

PV = "0.9.0"

RPM_NAME = "ocaml-fmt-0.9.0-1.12.aarch64.rpm"
RPM_HASH = "c5bd35d49c7f734e56f469f63348bc1093c8336e1499cc4d9386e093c9b1aee9453b42191a58c9d26122a18f36b0899dd0730683c9f6c40ebc18746ed76c4fcd"

RPROVIDES:${PN} += "ocaml-fmt"

RDEPENDS:${PN} += ""

inherit rpm
