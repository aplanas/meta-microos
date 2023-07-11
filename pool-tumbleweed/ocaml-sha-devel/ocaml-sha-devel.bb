SUMMARY = "Development files for ocaml-sha"
DESCRIPTION = "The ocaml-sha-devel package contains libraries and signature files for \
developing applications that use ocaml-sha."
LICENSE = "ISC"

PV = "1.15.2"

RPM_NAME = "ocaml-sha-devel-1.15.2-1.12.aarch64.rpm"
RPM_HASH = "85dd5150985ed72690626c7dee9fe5bb6135fce329c46f26603ab6e38f055f32da2e367399a17fca4ce5c5c9b22815f91806a41c48c884938daa40727f15a681"

RPROVIDES:${PN} += "ocaml-Sha1 \
ocaml-Sha256 \
ocaml-Sha512 \
ocaml-sha-devel \
ocamlfind-sha \
ocamlx-Sha1 \
ocamlx-Sha256 \
ocamlx-Sha512"

RDEPENDS:${PN} += "libc.so.6 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-sha \
ocamlfind-stdlib-shims \
ocamlx-Stdlib \
ocamlx-Stdlib--Bytes"

inherit rpm
