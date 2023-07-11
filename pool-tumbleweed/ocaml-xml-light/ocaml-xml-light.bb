SUMMARY = "Minimal XML parser and printer for OCaml"
DESCRIPTION = "Xml-Light is a minimal XML parser & printer for OCaml. It provides \
functions to parse an XML document into an OCaml data structure, work \
with it, and print it back to an XML document. It support also DTD \
parsing and checking, and is entirely written in OCaml, hence it does \
not require additional C library."
LICENSE = "LGPL-2.1+"

PV = "2.5"

RPM_NAME = "ocaml-xml-light-2.5-1.3.aarch64.rpm"
RPM_HASH = "bf169b3aeac2e11c4062bafe2639c6cd96f277e4bd5b5ae68e55c2d9299454f06220e4b07d5e0383d24188d2de5024e752a13396f52227fe15f4d0d0f2fc38bd"

RPROVIDES:${PN} += "ocaml-xml-light"

RDEPENDS:${PN} += ""

inherit rpm
