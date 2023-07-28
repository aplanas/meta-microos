SUMMARY = "Format pretty-printer combinators"
DESCRIPTION = "Fmt exposes combinators to devise Format pretty-printing functions. \
 \
Fmt depends only on the OCaml standard library. The optional Fmt_tty library that allows to setup formatters for terminal color output depends on the Unix library. The optional Fmt_cli library that provides command line support for Fmt depends on Cmdliner."
LICENSE = "ISC"

PV = "0.9.0"

RPM_NAME = "ocaml-fmt-0.9.0-1.13.aarch64.rpm"
RPM_HASH = "a71b37e7fe76fbe1e0eec62a70f5f1683482df08ca1a383d5e0f9b6e27d3af58f3b16f533365497fd7defaa0c4f150dd85b044d2b2d11fbf187c9aca292a3b95"

RPROVIDES:${PN} += "ocaml-fmt"

RDEPENDS:${PN} += ""

inherit rpm
