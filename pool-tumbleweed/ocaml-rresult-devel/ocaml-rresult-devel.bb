SUMMARY = "Development files for ocaml-rresult"
DESCRIPTION = "The ocaml-rresult-devel package contains libraries and signature files for \
developing applications that use ocaml-rresult."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "ocaml-rresult-devel-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "caac80b7cd6cbe0a88ebbfa12a7d6620614df83f5e2cd60cea7eb46e381757f6d3e9a1744da76dfc6961bb5d1eaf6260d289bb2597c425bfa7071da63638c5ee"

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
