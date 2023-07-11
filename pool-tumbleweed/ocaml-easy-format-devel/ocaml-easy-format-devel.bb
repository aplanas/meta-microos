SUMMARY = "Development files for ocaml-easy-format"
DESCRIPTION = "The ocaml-easy-format-devel package contains libraries and signature files for \
developing applications that use ocaml-easy-format."
LICENSE = "BSD-3-Clause"

PV = "1.3.4"

RPM_NAME = "ocaml-easy-format-devel-1.3.4-1.5.aarch64.rpm"
RPM_HASH = "dd4aad460b62b5c81c21d954f54c6224a608d9a89f5232443fda95997fc7d3a05be15e3b6562c6c2234328fcda8ae6f8f4fc75a8d5a7e560559197d521d81f52"

RPROVIDES:${PN} += "ocaml-Easy-format \
ocaml-easy-format-devel \
ocamlfind-easy-format \
ocamlx-Easy-format"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--List \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-easy-format \
ocamlx-Stdlib \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--String"

inherit rpm
