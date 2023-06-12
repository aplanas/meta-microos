SUMMARY = "Development files for ocaml-ptmap"
DESCRIPTION = "The ocaml-ptmap-devel package contains libraries and signature files for \
developing applications that use ocaml-ptmap."
LICENSE = "LGPL-2.1-or-later-WITH-OCaml-linking-exception"

PV = "2.0.5"

RPM_NAME = "ocaml-ptmap-devel-2.0.5-2.1.aarch64.rpm"
RPM_HASH = "45e1c95ddbadf8bf90036ad6900ad416d16167b7a61c6917288a72febf5c15a7de397a2731dc1c8ffb6b2555c0df4f3d2d080d8732124c273f86efc44827afa3"

RPROVIDES:${PN} += "ocaml(Ptmap) \
ocaml-ptmap-devel \
ocaml-ptmap-devel(aarch-64) \
ocamlfind(ptmap) \
ocamlx(Ptmap)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) \
ocaml(Stdlib) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Seq) \
ocaml-ptmap \
ocamlfind(seq) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Seq)"

inherit rpm
