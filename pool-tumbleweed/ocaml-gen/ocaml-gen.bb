SUMMARY = "Simple, efficient iterators for OCaml"
DESCRIPTION = "Iterators for OCaml, both restartable and consumable. \
The implementation keeps a good balance between simplicity and performance."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ocaml-gen-1.1-1.1.aarch64.rpm"
RPM_HASH = "b800847025c63ba0161941262dee19c9a0bbf280eb13864da8b9701b425747031652fdee94e1eb9bf6a49d0282d464e4514f70cc010b97d7b20f25f54430523c"

RPROVIDES:${PN} += "ocaml-gen \
ocaml-gen(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
