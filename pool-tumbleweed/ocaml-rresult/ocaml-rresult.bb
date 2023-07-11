SUMMARY = "Result value combinators for OCaml"
DESCRIPTION = "Rresult is an OCaml module for handling computation results and errors in an \
explicit and declarative manner, without resorting to exceptions. It defines \
combinators to operate on the result type available from OCaml 4.03 in the \
standard library."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "ocaml-rresult-0.7.0-1.2.aarch64.rpm"
RPM_HASH = "3b14b9dd2a5565448f9761dbdbf50062609b39b6522cfffefb7620b8450a860b1163afd42090a39d2a5bcc08fa5985568348fbd9e6f3a72702b13d9f29b653f2"

RPROVIDES:${PN} += "ocaml-rresult"

RDEPENDS:${PN} += ""

inherit rpm
