SUMMARY = "Parser and printer for the opam file syntax"
DESCRIPTION = "This is a parser and a printer for the opam file syntax."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "2.1.6"

RPM_NAME = "opam-file-format-2.1.6-1.1.aarch64.rpm"
RPM_HASH = "e05d1a6748ae32e50549458572916270b78b91ce73bf628513797167923449044e75e98db77e3e0b32f6f7461a22e17c440a4c35a6a3e2048c69a79f3885c7a1"

RPROVIDES:${PN} += "opam-file-format"

RDEPENDS:${PN} += ""

inherit rpm
