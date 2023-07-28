SUMMARY = "Development files for ocaml-fmt"
DESCRIPTION = "The ocaml-fmt-devel package contains libraries and signature files for \
developing applications that use ocaml-fmt."
LICENSE = "ISC"

PV = "0.9.0"

RPM_NAME = "ocaml-fmt-devel-0.9.0-1.13.aarch64.rpm"
RPM_HASH = "acd436c7bd8f4a2952bf3c0380f51db9bdd39e66177cf808f429bc4d2559899fc73b2cac4f2a34ddf3918fd43e8586113b70c36d42dc488f26e4b82362df9ec2"

RPROVIDES:${PN} += "ocaml-Fmt \
ocaml-Fmt-cli \
ocaml-Fmt-top \
ocaml-Fmt-tty \
ocaml-fmt-devel \
ocamlfind-fmt \
ocamlfind-fmt.cli \
ocamlfind-fmt.top \
ocamlfind-fmt.tty \
ocamlx-Fmt \
ocamlx-Fmt-cli \
ocamlx-Fmt-top \
ocamlx-Fmt-tty"

RDEPENDS:${PN} += "ocaml-Asttypes \
ocaml-Build-path-prefix-map \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Cmdliner \
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
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Fun \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Option \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Queue \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--Stack \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Subst \
ocaml-Toploop \
ocaml-Type-immediacy \
ocaml-Types \
ocaml-Unix \
ocaml-Warnings \
ocaml-fmt \
ocamlfind-cmdliner \
ocamlfind-compiler-libs.toplevel \
ocamlfind-result \
ocamlfind-unix \
ocamlx-Cmdliner \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Fun \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Int \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Option \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Queue \
ocamlx-Stdlib--Seq \
ocamlx-Stdlib--Stack \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Stdlib--Uchar \
ocamlx-Toploop \
ocamlx-Unix"

inherit rpm
