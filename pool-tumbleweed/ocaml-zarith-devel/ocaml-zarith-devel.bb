SUMMARY = "Development files for ocaml-zarith"
DESCRIPTION = "The ocaml-zarith-devel package contains libraries and signature files for \
developing applications that use ocaml-zarith."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "1.13"

RPM_NAME = "ocaml-zarith-devel-1.13-1.1.aarch64.rpm"
RPM_HASH = "f7527b56a5a456cad4eb64745c6d2b03d042bc353d5e8b7e4082b72cd2be23a9058fc508bd7ac755867b59ed135b8e16f0881f22b29e15cd60c8fcaadce66e61"

RPROVIDES:${PN} += "ocaml-Big-int-Z \
ocaml-Q \
ocaml-Z \
ocaml-Zarith-top \
ocaml-Zarith-version \
ocaml-zarith-devel \
ocamlfind-zarith \
ocamlfind-zarith.top \
ocamlx-Big-int-Z \
ocamlx-Q \
ocamlx-Z \
ocamlx-Zarith-top \
ocamlx-Zarith-version"

RDEPENDS:${PN} += "gmp-devel \
libc.so.6 \
libgmp.so.10 \
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
ocaml-Stdlib--Callback \
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
ocaml-Stdlib--Random \
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
ocaml-zarith \
ocamlfind-compiler-libs.toplevel \
ocamlx-Stdlib \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Nativeint \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Random \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Toploop"

inherit rpm
