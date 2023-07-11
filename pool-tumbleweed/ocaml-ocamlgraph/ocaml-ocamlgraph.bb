SUMMARY = "Graph library for OCaml"
DESCRIPTION = "OCamlgraph is a graph library for Objective Caml."
LICENSE = "LGPL-2.1"

PV = "2.0.0"

RPM_NAME = "ocaml-ocamlgraph-2.0.0-1.16.aarch64.rpm"
RPM_HASH = "0fdb3de27e5ac716ef975cfe846548c3f9ec83d6991e433f5095609f211c6e704f8ce9ae7257d15ac3f875fcb52d6b5bd1b2e1cb0cb6c31269b5e355b4cc01a6"

RPROVIDES:${PN} += "ocaml-ocamlgraph"

RDEPENDS:${PN} += ""

inherit rpm
