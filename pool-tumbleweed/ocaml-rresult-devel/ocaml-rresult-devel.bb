SUMMARY = "Development files for ocaml-rresult"
DESCRIPTION = "The ocaml-rresult-devel package contains libraries and signature files for \
developing applications that use ocaml-rresult."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "ocaml-rresult-devel-0.7.0-1.2.aarch64.rpm"
RPM_HASH = "00d1ba2f52816f675ad7077522c2a0b93c95fdf88c93b910e3e10e80a4a6f1539604cc44c8825859fb0a855e43607c93c3bc3ae2f023119c1eef347ea8c86c71"

RPROVIDES:${PN} += "ocaml-Rresult \
ocaml-Rresult-top \
ocaml-rresult-devel \
ocamlfind-rresult \
ocamlfind-rresult.top \
ocamlx-Rresult \
ocamlx-Rresult-top"

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
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--Map \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-Subst \
ocaml-Toploop \
ocaml-Type-immediacy \
ocaml-Types \
ocaml-Warnings \
ocaml-rresult \
ocamlfind-compiler-libs.toplevel \
ocamlfind-result \
ocamlx-Stdlib \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--String \
ocamlx-Toploop"

inherit rpm
