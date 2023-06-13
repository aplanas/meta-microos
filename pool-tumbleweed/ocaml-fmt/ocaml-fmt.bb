SUMMARY = "Format pretty-printer combinators"
DESCRIPTION = "Fmt exposes combinators to devise Format pretty-printing functions. \
 \
Fmt depends only on the OCaml standard library. The optional Fmt_tty library that allows to setup formatters for terminal color output depends on the Unix library. The optional Fmt_cli library that provides command line support for Fmt depends on Cmdliner."
LICENSE = "ISC"

PV = "0.9.0"

RPM_NAME = "ocaml-fmt-0.9.0-1.11.aarch64.rpm"
RPM_HASH = "dafe663a8be3026723ff5754596a9f93a39f48f98449dd7f045816acde5b35b5d0b40fff6081a59a7f43cd1c2c700ac62ee33176ae7c8ca606aa7dd1c8e5415a"

RPROVIDES:${PN} += "ocaml-fmt \
ocaml-fmt(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
