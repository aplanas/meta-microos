SUMMARY = "Development files for ocaml-csexp"
DESCRIPTION = "The ocaml-csexp-devel package contains libraries and signature files for \
developing applications that use ocaml-csexp."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "ocaml-csexp-devel-1.5.2-1.2.aarch64.rpm"
RPM_HASH = "87315e42625590162f9e544fbd1b07f20cf7aa7ace853f2f663ad7975e25f722a3cbb048f2d1d3bf934ef41da94eec359346d04b70f4b03344e1e5e992b8c075"

RPROVIDES:${PN} += "ocaml-Csexp \
ocaml-csexp-devel \
ocamlfind-csexp \
ocamlx-Csexp"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--List \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-csexp \
ocamlx-Stdlib \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--List \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys"

inherit rpm
