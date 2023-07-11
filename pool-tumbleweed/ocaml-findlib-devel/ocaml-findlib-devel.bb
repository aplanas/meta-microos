SUMMARY = "Development files for ocaml-findlib"
DESCRIPTION = "The ocaml-findlib-devel package contains libraries and signature files \
for developing applications that use ocaml-findlib."
LICENSE = "MIT"

PV = "1.9.5"

RPM_NAME = "ocaml-findlib-devel-1.9.5-1.6.aarch64.rpm"
RPM_HASH = "a410ded9aa98718a7c539773c2eeffbf2c1581713baad87a7d707b47581d96647134e4c7c27f746b85973d8c3bcbbf48b83ab04b0ddc222b7d27c5f1518355a3"

RPROVIDES:${PN} += "ocaml-Findlib \
ocaml-Findlib-config \
ocaml-Fl-args \
ocaml-Fl-dynload \
ocaml-Fl-lint \
ocaml-Fl-meta \
ocaml-Fl-metascanner \
ocaml-Fl-metatoken \
ocaml-Fl-package-base \
ocaml-Fl-split \
ocaml-Fl-topo \
ocaml-Ocaml-args \
ocaml-Topfind \
ocaml-findlib-camlp4 \
ocaml-findlib-devel \
ocamlfind-findlib \
ocamlfind-findlib.dynload \
ocamlfind-findlib.internal \
ocamlfind-findlib.top \
ocamlx-Findlib \
ocamlx-Findlib-config \
ocamlx-Fl-args \
ocamlx-Fl-dynload \
ocamlx-Fl-lint \
ocamlx-Fl-meta \
ocamlx-Fl-metascanner \
ocamlx-Fl-metatoken \
ocamlx-Fl-package-base \
ocamlx-Fl-split \
ocamlx-Fl-topo \
ocamlx-Topfind"

RDEPENDS:${PN} += "ocaml-Asttypes \
ocaml-Build-path-prefix-map \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Cmi-format \
ocaml-Dynlink \
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
ocaml-Stdlib--Arg \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
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
ocaml-Topdirs \
ocaml-Toploop \
ocaml-Type-immediacy \
ocaml-Types \
ocaml-Warnings \
ocaml-findlib \
ocamlfind-dynlink \
ocamlx-Dynlink \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Topdirs \
ocamlx-Toploop"

inherit rpm
