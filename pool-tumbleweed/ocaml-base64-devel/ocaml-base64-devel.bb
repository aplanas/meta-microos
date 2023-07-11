SUMMARY = "Development files for ocaml-base64"
DESCRIPTION = "The ocaml-base64-devel package contains libraries and signature files for \
developing applications that use ocaml-base64."
LICENSE = "ISC"

PV = "3.5.1"

RPM_NAME = "ocaml-base64-devel-3.5.1-1.4.aarch64.rpm"
RPM_HASH = "d3fe261bb1363c3489b6724092d41b9bf34635cdc33cdd5314037b69fd203b2eb37f94c85881fd4ce7399c8f2387b18132fc15ffa9a4ccfe36ac8913b562730b"

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
