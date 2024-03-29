SUMMARY = "Development files for ocaml-bisect_ppx"
DESCRIPTION = "The ocaml-bisect_ppx-devel package contains libraries and signature files for \
developing applications that use ocaml-bisect_ppx."
LICENSE = "GPL-2.0-only"

PV = "2.8.2"

RPM_NAME = "ocaml-bisect_ppx-devel-2.8.2-2.3.aarch64.rpm"
RPM_HASH = "566e91cae19166cb84f5af170f0dce945e0e375f1724e817379c4eecba843fed29eef37c90a4cbfe6d620f54a4e44cd3a6738f58fdad2eef3f46d41efb2a42ad"

RPROVIDES:${PN} += "ocaml-Bisect \
ocaml-Bisect--Runtime \
ocaml-Bisect-common \
ocaml-Bisect-ppx \
ocaml-Bisect-ppx--Exclude \
ocaml-Bisect-ppx--Exclude-lexer \
ocaml-Bisect-ppx--Exclude-parser \
ocaml-Bisect-ppx--Exclusions \
ocaml-Bisect-ppx--Instrument \
ocaml-Bisect-ppx--Register \
ocaml-bisect-ppx-devel \
ocamlfind-bisect-ppx \
ocamlfind-bisect-ppx.common \
ocamlfind-bisect-ppx.runtime \
ocamlx-Bisect \
ocamlx-Bisect--Runtime \
ocamlx-Bisect-common \
ocamlx-Bisect-ppx \
ocamlx-Bisect-ppx--Exclude \
ocamlx-Bisect-ppx--Exclude-lexer \
ocamlx-Bisect-ppx--Exclude-parser \
ocamlx-Bisect-ppx--Exclusions \
ocamlx-Bisect-ppx--Instrument \
ocamlx-Bisect-ppx--Register"

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
ocaml-Astlib--Ast-501 \
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
ocaml-Ppxlib-ast--Ast-helper-lite \
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
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--BytesLabels \
ocaml-Stdlib--Char \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--ListLabels \
ocaml-Stdlib--Map \
ocaml-Stdlib--Nativeint \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Parsing \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Random \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--StdLabels \
ocaml-Stdlib--String \
ocaml-Stdlib--StringLabels \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Stdppx \
ocaml-Str \
ocaml-Subst \
ocaml-Type-immediacy \
ocaml-Types \
ocaml-Unix \
ocaml-Warnings \
ocaml-bisect-ppx \
ocamlfind-ppxlib \
ocamlfind-ppxlib.ast \
ocamlfind-str \
ocamlfind-unix \
ocamlx-CamlinternalLazy \
ocamlx-CamlinternalOO \
ocamlx-Ppxlib--Ast-builder \
ocamlx-Ppxlib--Ast-traverse \
ocamlx-Ppxlib--Driver \
ocamlx-Ppxlib--Expansion-context \
ocamlx-Ppxlib--Location \
ocamlx-Ppxlib--Longident \
ocamlx-Ppxlib-ast--Ast-helper-lite \
ocamlx-Stdlib \
ocamlx-Stdlib--Arg \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Parsing \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Random \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Str \
ocamlx-Unix"

inherit rpm
