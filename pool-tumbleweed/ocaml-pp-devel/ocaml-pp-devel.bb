SUMMARY = "Development files for ocaml-pp"
DESCRIPTION = "The ocaml-pp-devel package contains libraries and signature files for \
developing applications that use ocaml-pp."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "ocaml-pp-devel-1.1.2-4.1.aarch64.rpm"
RPM_HASH = "5895575536244c748ba834b135cb3b3db51688028fe8d7817d79335f84551be409f64e72497fcc138b3f135c01ac7dbae09ad34a84a74b18af6911437de6a7b3"

RPROVIDES:${PN} += "ocaml-Pp \
ocaml-pp-devel \
ocamlfind-pp \
ocamlx-Pp"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--ListLabels \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Uchar \
ocaml-pp \
ocamlx-Stdlib \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--ListLabels \
ocamlx-Stdlib--Printf"

inherit rpm
