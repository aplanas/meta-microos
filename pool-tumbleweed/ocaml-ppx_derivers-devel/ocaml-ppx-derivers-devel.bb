SUMMARY = "Development files for ocaml-ppx_derivers"
DESCRIPTION = "The ocaml-ppx_derivers-devel package contains libraries and signature files for \
developing applications that use ocaml-ppx_derivers."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "ocaml-ppx_derivers-devel-1.2.1-4.10.aarch64.rpm"
RPM_HASH = "89b30a11daa5c2f9581400cf803a55a44955f4f4eae79f262235b5201c42db53dd0f00fa210e174d67ed4fabc83e60525d38f8597cfe9aa8ca856102f6d3f6d5"

RPROVIDES:${PN} += "ocaml-Ppx-derivers \
ocaml-ppx-derivers-devel \
ocamlfind-ppx-derivers \
ocamlx-Ppx-derivers"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Either \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Uchar \
ocaml-ppx-derivers \
ocamlx-Stdlib \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Printf"

inherit rpm
