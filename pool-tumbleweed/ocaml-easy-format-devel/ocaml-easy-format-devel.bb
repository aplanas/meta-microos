SUMMARY = "Development files for ocaml-easy-format"
DESCRIPTION = "The ocaml-easy-format-devel package contains libraries and signature files for \
developing applications that use ocaml-easy-format."
LICENSE = "BSD-3-Clause"

PV = "1.3.4"

RPM_NAME = "ocaml-easy-format-devel-1.3.4-1.4.aarch64.rpm"
RPM_HASH = "896e5c3adc62a3fb870ef7156734d5a151f65fc08ee489feb9816cd1d04a0a8df0ab3607ecf23355f7df24c48a859ca79c65937cdfa6ca3e0a916d0740462a20"

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
