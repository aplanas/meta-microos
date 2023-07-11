SUMMARY = "Development files for ocaml-uutf"
DESCRIPTION = "The ocaml-uutf-devel package contains libraries and signature files for \
developing applications that use ocaml-uutf."
LICENSE = "ISC"

PV = "1.0.3"

RPM_NAME = "ocaml-uutf-devel-1.0.3-1.10.aarch64.rpm"
RPM_HASH = "522c078643fe928159236934050e3fa2ae6c03ea127c8cca671d18f1c4d278751294357a6b4492a5033a8f6d72910b0742d97cf8f1be35093afd5b9efa43c5a7"

RPROVIDES:${PN} += "ocaml-Uutf \
ocaml-uutf-devel \
ocamlfind-uutf \
ocamlx-Uutf"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-uutf \
ocamlx-Stdlib \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Uchar"

inherit rpm
