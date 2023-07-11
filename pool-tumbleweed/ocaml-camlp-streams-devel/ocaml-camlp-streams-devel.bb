SUMMARY = "Development files for ocaml-camlp-streams"
DESCRIPTION = "The ocaml-camlp-streams-devel package contains libraries and signature files for \
developing applications that use ocaml-camlp-streams."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "5.0.1"

RPM_NAME = "ocaml-camlp-streams-devel-5.0.1-2.5.aarch64.rpm"
RPM_HASH = "d64d7fe617c7d1e5803673bcfaf5df5aa221452d1782e4a97ea5c1e7b436f6c3b095ea5d6783e5da4a2258a3755fda751ded02e6ed18d99978ffde66b50be913"

RPROVIDES:${PN} += "ocaml-Genlex \
ocaml-Stream \
ocaml-camlp-streams-devel \
ocamlfind-camlp-streams \
ocamlx-Genlex \
ocamlx-Stream"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Genlex \
ocaml-Stdlib--Stream \
ocaml-camlp-streams \
ocamlx-Stdlib--Genlex \
ocamlx-Stdlib--Stream"

inherit rpm
