SUMMARY = "Development files for ocaml-zarith"
DESCRIPTION = "The ocaml-zarith-devel package contains libraries and signature files for \
developing applications that use ocaml-zarith."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "1.12"

RPM_NAME = "ocaml-zarith-devel-1.12-1.16.aarch64.rpm"
RPM_HASH = "e30a5ea9ee39985dcca06dfe02a668588a049f9831b9f441b60fd8af227f38de20b11feb512ad6eafaf562199ddebbc17719c77fbd7a763b7e062849fb55ca6a"

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
ocaml-zarith \
ocamlfind-compiler-libs.toplevel \
ocamlx-Stdlib \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Toploop"

inherit rpm
