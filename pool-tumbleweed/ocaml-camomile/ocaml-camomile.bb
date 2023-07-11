SUMMARY = "Unicode library for OCaml"
DESCRIPTION = "Camomile is a Unicode library for ocaml. Camomile provides Unicode \
character type, UTF-8, UTF-16, UTF-32 strings, conversion to/from \
about 200 encodings, collation and locale-sensitive case mappings, and \
more."
LICENSE = "LGPL-2.0+"

PV = "1.0.2"

RPM_NAME = "ocaml-camomile-1.0.2-3.26.aarch64.rpm"
RPM_HASH = "b0298c0020c03ea0f26ef518e67bc0a258ccca56786827f28b13302ede58f9243090d8052d9f07a49f7f03cf1c9e2cdba753c14fcd52ad05984ed73a53b617a3"

RPROVIDES:${PN} += "ocaml-camomile"

RDEPENDS:${PN} += ""

inherit rpm
