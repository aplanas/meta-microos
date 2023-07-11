SUMMARY = "Development files for ocaml-sedlex"
DESCRIPTION = "The ocaml-sedlex-devel package contains libraries and signature files for \
developing applications that use ocaml-sedlex."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "ocaml-sedlex-devel-3.1-3.2.aarch64.rpm"
RPM_HASH = "c6d3db331e6f6ed41cc2017c5000c865ed8ee48d77431fdf2838e5a730e773e338368c9692c3d8b9217901436f86133e577b258abfcf43a406cec635638c81f2"

RPROVIDES:${PN} += "ocaml-Sedlex-ppx \
ocaml-Sedlex-ppx--Ppx-sedlex \
ocaml-Sedlex-ppx--Sedlex \
ocaml-Sedlex-ppx--Sedlex-cset \
ocaml-Sedlex-ppx--Unicode \
ocaml-Sedlexing \
ocaml-sedlex-devel \
ocamlfind-sedlex \
ocamlfind-sedlex.ppx \
ocamlx-Sedlex-ppx \
ocamlx-Sedlex-ppx--Ppx-sedlex \
ocamlx-Sedlex-ppx--Sedlex \
ocamlx-Sedlex-ppx--Sedlex-cset \
ocamlx-Sedlex-ppx--Unicode \
ocamlx-Sedlexing"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
ocaml-Astlib \
ocaml-Astlib-- \
ocaml-Astlib--Ast-402 \
ocaml-Astlib--Ast-403 \
ocaml-Astlib--Ast-404 \
ocaml-Astlib--Ast-405 \
ocaml-Astlib--Ast-406 \
ocaml-Astlib--Ast-407 \
ocaml-Astlib--Ast-408 \
ocaml-Astlib--Ast-409 \
ocaml-Astlib--Ast-410 \
ocaml-Astlib--Ast-411 \
ocaml-Astlib--Ast-412 \
ocaml-Astlib--Ast-413 \
ocaml-Astlib--Ast-414 \
ocaml-Astlib--Ast-500 \
ocaml-Astlib--Location \
ocaml-Astlib--Longident \
ocaml-Astlib--Parse \
ocaml-Asttypes \
ocaml-Build-path-prefix-map \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-CamlinternalOO \
ocaml-Clflags \
ocaml-Cmi-format \
ocaml-Compmisc \
ocaml-Env \
ocaml-Gen \
ocaml-Gen-intf \
ocaml-Ident \
ocaml-Identifiable \
ocaml-Load-path \
ocaml-Location \
ocaml-Longident \
ocaml-Misc \
ocaml-Ocaml-common \
ocaml-Ocaml-shadow \
ocaml-Outcometree \
ocaml-Parsetree \
ocaml-Path \
ocaml-Ppxlib \
ocaml-Ppxlib-- \
ocaml-Ppxlib--Ast-builder \
ocaml-Ppxlib--Ast-builder-generated \
ocaml-Ppxlib--Ast-builder-intf \
ocaml-Ppxlib--Ast-pattern \
ocaml-Ppxlib--Ast-pattern-generated \
ocaml-Ppxlib--Ast-pattern0 \
ocaml-Ppxlib--Ast-traverse \
ocaml-Ppxlib--Ast-traverse0 \
ocaml-Ppxlib--Attribute \
ocaml-Ppxlib--Code-path \
ocaml-Ppxlib--Common \
ocaml-Ppxlib--Context-free \
ocaml-Ppxlib--Driver \
ocaml-Ppxlib--Expansion-context \
ocaml-Ppxlib--Extension \
ocaml-Ppxlib--Import \
ocaml-Ppxlib--Loc \
ocaml-Ppxlib--Location \
ocaml-Ppxlib--Longident \
ocaml-Ppxlib--Name \
ocaml-Ppxlib--Utils \
ocaml-Ppxlib-ast \
ocaml-Ppxlib-ast-- \
ocaml-Ppxlib-ast--Ast \
ocaml-Ppxlib-ast--Import \
ocaml-Ppxlib-ast--Versions \
ocaml-Ppxlib-traverse-builtins \
ocaml-Primitive \
ocaml-Profile \
ocaml-Sexplib0 \
ocaml-Sexplib0-- \
ocaml-Sexplib0--Sexp \
ocaml-Sexplib0--Sexp-conv \
ocaml-Sexplib0--Sexp-conv-grammar \
ocaml-Sexplib0--Sexp-grammar \
ocaml-Sexplib0--Sexpable \
ocaml-Shape \
ocaml-Stdlib \
ocaml-Stdlib--Arg \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--BytesLabels \
ocaml-Stdlib--Char \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--ListLabels \
ocaml-Stdlib--Map \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Option \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--StdLabels \
ocaml-Stdlib--String \
ocaml-Stdlib--StringLabels \
ocaml-Stdlib--Uchar \
ocaml-Stdppx \
ocaml-Subst \
ocaml-Type-immediacy \
ocaml-Types \
ocaml-Warnings \
ocaml-sedlex \
ocamlfind-gen \
ocamlfind-ppxlib \
ocamlfind-ppxlib.ast \
ocamlx-CamlinternalOO \
ocamlx-Gen \
ocamlx-Ppxlib \
ocamlx-Ppxlib--Ast-builder \
ocamlx-Ppxlib--Ast-pattern \
ocamlx-Ppxlib--Ast-traverse \
ocamlx-Ppxlib--Driver \
ocamlx-Ppxlib--Extension \
ocamlx-Ppxlib--Location \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Option \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Uchar"

inherit rpm
