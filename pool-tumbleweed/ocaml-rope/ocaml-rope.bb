SUMMARY = "Ropes ('heavyweight strings') for OCaml"
DESCRIPTION = "Ropes ('heavyweight strings') are a scalable string implementation: \
they are designed for efficient operation that involve the string as \
a whole. Operations such as concatenation, and substring take time \
that is nearly independent of the length of the string. Unlike \
strings, ropes are a reasonable representation for very long strings \
such as edit buffers or mail messages."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "0.6.2"

RPM_NAME = "ocaml-rope-0.6.2-3.25.aarch64.rpm"
RPM_HASH = "27941b760364b1e17109c34f88382f1c070197f13d2ebf8046bf3e9274892c71b746430fd534b22adeef703821140ba86eeb3cb9dd7a1264bd33c9540354c64a"

RPROVIDES:${PN} += "ocaml-rope"

RDEPENDS:${PN} += ""

inherit rpm
