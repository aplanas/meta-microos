SUMMARY = "Development files for ocaml-base64"
DESCRIPTION = "The ocaml-base64-devel package contains libraries and signature files for \
developing applications that use ocaml-base64."
LICENSE = "ISC"

PV = "3.5.1"

RPM_NAME = "ocaml-base64-devel-3.5.1-1.3.aarch64.rpm"
RPM_HASH = "3db6320aac829a3bef99dc8eaf84065e4884cfb2d468d99e5e23e44649555a8e0882a330d5d423f54da699ca053725a44805a186bf8dac5d5f3d7f38023e4ab0"

RPROVIDES:${PN} += "ocaml-Base64 \
ocaml-Base64-- \
ocaml-Base64--Unsafe \
ocaml-Base64-rfc2045 \
ocaml-base64-devel \
ocamlfind-base64 \
ocamlfind-base64.rfc2045 \
ocamlx-Base64 \
ocamlx-Base64-- \
ocamlx-Base64--Unsafe \
ocamlx-Base64-rfc2045"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-base64 \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys"

inherit rpm
