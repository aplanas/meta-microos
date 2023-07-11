SUMMARY = "LR(1) parser generator for the OCaml programming language"
DESCRIPTION = "LR(1) parser generator"
LICENSE = "LGPL-2.0"

PV = "20230415"

RPM_NAME = "ocaml-menhir-20230415-1.2.aarch64.rpm"
RPM_HASH = "4b44a4c093ecc82d77a8cd0e282f0e9f1daf7a6a58e8298bd5e4b094ffa6775809230a7324ca26d78126148eb0bd31a4ec139279ca3d1739dd57ddc43b57511e"

RPROVIDES:${PN} += "ocaml-menhir"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
