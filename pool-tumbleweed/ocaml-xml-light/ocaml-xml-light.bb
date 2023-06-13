SUMMARY = "Minimal XML parser and printer for OCaml"
DESCRIPTION = "Xml-Light is a minimal XML parser & printer for OCaml. It provides \
functions to parse an XML document into an OCaml data structure, work \
with it, and print it back to an XML document. It support also DTD \
parsing and checking, and is entirely written in OCaml, hence it does \
not require additional C library."
LICENSE = "LGPL-2.1+"

PV = "2.5"

RPM_NAME = "ocaml-xml-light-2.5-1.2.aarch64.rpm"
RPM_HASH = "14d4b64f0d43f3e79da548fbfbcd9c6ca01ffcaa274abe75fd5f44e803697a1f27aa622f51c0c85e03541e045d4433bc1259291bb009e00bb522871532d80ec1"

RPROVIDES:${PN} += "ocaml-xml-light \
ocaml-xml-light(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
