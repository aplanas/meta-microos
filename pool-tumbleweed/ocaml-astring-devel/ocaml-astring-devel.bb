SUMMARY = "Development files for ocaml-astring"
DESCRIPTION = "The ocaml-astring-devel package contains libraries and signature files for \
developing applications that use ocaml-astring."
LICENSE = "ISC"

PV = "0.8.5"

RPM_NAME = "ocaml-astring-devel-0.8.5-1.15.aarch64.rpm"
RPM_HASH = "67ce9b7a012279024ea320907f364c5b1e68017187f710933ba3c97c0843d99c286567d9f72567df0196d1dfed72b1dac1c7900c9676e49424b1e05bd1f04e5d"

RPROVIDES:${PN} += "ocaml-Astring \
ocaml-Astring-base \
ocaml-Astring-char \
ocaml-Astring-escape \
ocaml-Astring-string \
ocaml-Astring-sub \
ocaml-Astring-top \
ocaml-Astring-unsafe \
ocaml-astring-devel \
ocamlfind-astring \
ocamlfind-astring.top \
ocamlx-Astring \
ocamlx-Astring-base \
ocamlx-Astring-char \
ocamlx-Astring-escape \
ocamlx-Astring-string \
ocamlx-Astring-sub \
ocamlx-Astring-top \
ocamlx-Astring-unsafe"

RDEPENDS:${PN} += "ocaml-Asttypes \
ocaml-Build-path-prefix-map \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Cmi-format \
ocaml-Env \
ocaml-Ident \
ocaml-Identifiable \
ocaml-Load-path \
ocaml-Location \
ocaml-Longident \
ocaml-Misc \
ocaml-Outcometree \
ocaml-Parsetree \
ocaml-Path \
ocaml-Primitive \
ocaml-Shape \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Nativeint \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Subst \
ocaml-Toploop \
ocaml-Type-immediacy \
ocaml-Types \
ocaml-Warnings \
ocaml-astring \
ocamlfind-compiler-libs.toplevel \
ocamlx-Stdlib \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Int32 \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Nativeint \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Toploop"

inherit rpm
