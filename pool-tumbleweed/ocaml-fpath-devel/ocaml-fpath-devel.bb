SUMMARY = "Development files for ocaml-fpath"
DESCRIPTION = "The ocaml-fpath-devel package contains libraries and signature files for \
developing applications that use ocaml-fpath."
LICENSE = "ISC"

PV = "0.7.3"

RPM_NAME = "ocaml-fpath-devel-0.7.3-2.10.aarch64.rpm"
RPM_HASH = "16b08e833b022f7366abd0c9ddde900fa788a6f61784cad64d06f9e5f8ec5b8a466f7b6805b8fd9df6ccb7dedbee0ac123b75c6d0297ae92c5978674dd7ea3f2"

RPROVIDES:${PN} += "ocaml-Fpath \
ocaml-Fpath-top \
ocaml-fpath-devel \
ocamlfind-fpath \
ocamlfind-fpath.top \
ocamlx-Fpath \
ocamlx-Fpath-top"

RDEPENDS:${PN} += "ocaml-Astring \
ocaml-Asttypes \
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
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Obj \
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
ocaml-fpath \
ocamlfind-astring \
ocamlfind-astring.top \
ocamlfind-compiler-libs.toplevel \
ocamlfind-result \
ocamlx-Astring \
ocamlx-Stdlib \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--Sys \
ocamlx-Toploop"

inherit rpm
