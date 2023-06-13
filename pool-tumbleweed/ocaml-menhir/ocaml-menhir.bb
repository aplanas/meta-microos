SUMMARY = "LR(1) parser generator for the OCaml programming language"
DESCRIPTION = "LR(1) parser generator"
LICENSE = "LGPL-2.0"

PV = "20230415"

RPM_NAME = "ocaml-menhir-20230415-1.1.aarch64.rpm"
RPM_HASH = "8801a29a85d954facba7a79fa231afb1f92387c0144a291612e4fb4678619ecffa0db2f35119ca69f910e4820184d452c492001a86bea414df70afc8bf8d20b9"

RPROVIDES:${PN} += "ocaml-menhir \
ocaml-menhir(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
