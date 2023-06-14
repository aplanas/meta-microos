SUMMARY = "Development files for ocaml-ppxlib"
DESCRIPTION = "The ocaml-ppxlib-devel package contains libraries and signature files for \
developing applications that use ocaml-ppxlib."
LICENSE = "MIT"

PV = "0.29.1"

RPM_NAME = "ocaml-ppxlib-devel-0.29.1-3.1.aarch64.rpm"
RPM_HASH = "49ad065a828d0786236743651c735d0ecdf46f654a5f3f161895d4a950a70c842c2cc4f78034cec9c0c6fa8e6592f442db095f661c76c3022389e9e02baef8ad"

RPROVIDES:${PN} += "ocaml-Astlib \
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
ocaml-Astlib--Ast-metadata \
ocaml-Astlib--Config \
ocaml-Astlib--Keyword \
ocaml-Astlib--Location \
ocaml-Astlib--Longident \
ocaml-Astlib--Migrate-402-403 \
ocaml-Astlib--Migrate-403-402 \
ocaml-Astlib--Migrate-403-404 \
ocaml-Astlib--Migrate-404-403 \
ocaml-Astlib--Migrate-404-405 \
ocaml-Astlib--Migrate-405-404 \
ocaml-Astlib--Migrate-405-406 \
ocaml-Astlib--Migrate-406-405 \
ocaml-Astlib--Migrate-406-407 \
ocaml-Astlib--Migrate-407-406 \
ocaml-Astlib--Migrate-407-408 \
ocaml-Astlib--Migrate-408-407 \
ocaml-Astlib--Migrate-408-409 \
ocaml-Astlib--Migrate-409-408 \
ocaml-Astlib--Migrate-409-410 \
ocaml-Astlib--Migrate-410-409 \
ocaml-Astlib--Migrate-410-411 \
ocaml-Astlib--Migrate-411-410 \
ocaml-Astlib--Migrate-411-412 \
ocaml-Astlib--Migrate-412-411 \
ocaml-Astlib--Migrate-412-413 \
ocaml-Astlib--Migrate-413-412 \
ocaml-Astlib--Migrate-413-414 \
ocaml-Astlib--Migrate-414-413 \
ocaml-Astlib--Migrate-414-500 \
ocaml-Astlib--Migrate-500-414 \
ocaml-Astlib--Parse \
ocaml-Astlib--Pprintast \
ocaml-Astlib--Stdlib0 \
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
ocaml-Ppxlib--Caller-id \
ocaml-Ppxlib--Code-matcher \
ocaml-Ppxlib--Code-path \
ocaml-Ppxlib--Common \
ocaml-Ppxlib--Context-free \
ocaml-Ppxlib--Deriving \
ocaml-Ppxlib--Driver \
ocaml-Ppxlib--Expansion-context \
ocaml-Ppxlib--Expansion-helpers \
ocaml-Ppxlib--Extension \
ocaml-Ppxlib--Ignore-unused-warning \
ocaml-Ppxlib--Import \
ocaml-Ppxlib--Keyword \
ocaml-Ppxlib--Loc \
ocaml-Ppxlib--Location \
ocaml-Ppxlib--Location-check \
ocaml-Ppxlib--Longident \
ocaml-Ppxlib--Merlin-helpers \
ocaml-Ppxlib--Name \
ocaml-Ppxlib--Options \
ocaml-Ppxlib--Quoter \
ocaml-Ppxlib--Reconcile \
ocaml-Ppxlib--Skip-hash-bang \
ocaml-Ppxlib--Spellcheck \
ocaml-Ppxlib--Utils \
ocaml-Ppxlib-ast \
ocaml-Ppxlib-ast-- \
ocaml-Ppxlib-ast--Ast \
ocaml-Ppxlib-ast--Ast-helper-lite \
ocaml-Ppxlib-ast--Import \
ocaml-Ppxlib-ast--Location-error \
ocaml-Ppxlib-ast--Stdlib0 \
ocaml-Ppxlib-ast--Versions \
ocaml-Ppxlib-ast--Warn \
ocaml-Ppxlib-metaquot \
ocaml-Ppxlib-metaquot-lifters \
ocaml-Ppxlib-print-diff \
ocaml-Ppxlib-runner \
ocaml-Ppxlib-runner--Ppx-driver-runner \
ocaml-Ppxlib-runner-as-ppx \
ocaml-Ppxlib-runner-as-ppx--Ppx-driver-runner-as-ppx \
ocaml-Ppxlib-traverse \
ocaml-Ppxlib-traverse-builtins \
ocaml-Stdppx \
ocaml-ppxlib-devel \
ocamlfind-ppxlib \
ocamlfind-ppxlib.ast \
ocamlfind-ppxlib.astlib \
ocamlfind-ppxlib.metaquot \
ocamlfind-ppxlib.metaquot-lifters \
ocamlfind-ppxlib.print-diff \
ocamlfind-ppxlib.runner \
ocamlfind-ppxlib.runner-as-ppx \
ocamlfind-ppxlib.stdppx \
ocamlfind-ppxlib.traverse \
ocamlfind-ppxlib.traverse-builtins \
ocamlx-Astlib \
ocamlx-Astlib-- \
ocamlx-Astlib--Ast-402 \
ocamlx-Astlib--Ast-403 \
ocamlx-Astlib--Ast-404 \
ocamlx-Astlib--Ast-405 \
ocamlx-Astlib--Ast-406 \
ocamlx-Astlib--Ast-407 \
ocamlx-Astlib--Ast-408 \
ocamlx-Astlib--Ast-409 \
ocamlx-Astlib--Ast-410 \
ocamlx-Astlib--Ast-411 \
ocamlx-Astlib--Ast-412 \
ocamlx-Astlib--Ast-413 \
ocamlx-Astlib--Ast-414 \
ocamlx-Astlib--Ast-500 \
ocamlx-Astlib--Ast-metadata \
ocamlx-Astlib--Config \
ocamlx-Astlib--Keyword \
ocamlx-Astlib--Location \
ocamlx-Astlib--Longident \
ocamlx-Astlib--Migrate-402-403 \
ocamlx-Astlib--Migrate-403-402 \
ocamlx-Astlib--Migrate-403-404 \
ocamlx-Astlib--Migrate-404-403 \
ocamlx-Astlib--Migrate-404-405 \
ocamlx-Astlib--Migrate-405-404 \
ocamlx-Astlib--Migrate-405-406 \
ocamlx-Astlib--Migrate-406-405 \
ocamlx-Astlib--Migrate-406-407 \
ocamlx-Astlib--Migrate-407-406 \
ocamlx-Astlib--Migrate-407-408 \
ocamlx-Astlib--Migrate-408-407 \
ocamlx-Astlib--Migrate-408-409 \
ocamlx-Astlib--Migrate-409-408 \
ocamlx-Astlib--Migrate-409-410 \
ocamlx-Astlib--Migrate-410-409 \
ocamlx-Astlib--Migrate-410-411 \
ocamlx-Astlib--Migrate-411-410 \
ocamlx-Astlib--Migrate-411-412 \
ocamlx-Astlib--Migrate-412-411 \
ocamlx-Astlib--Migrate-412-413 \
ocamlx-Astlib--Migrate-413-412 \
ocamlx-Astlib--Migrate-413-414 \
ocamlx-Astlib--Migrate-414-413 \
ocamlx-Astlib--Migrate-414-500 \
ocamlx-Astlib--Migrate-500-414 \
ocamlx-Astlib--Parse \
ocamlx-Astlib--Pprintast \
ocamlx-Astlib--Stdlib0 \
ocamlx-Ppxlib \
ocamlx-Ppxlib-- \
ocamlx-Ppxlib--Ast-builder \
ocamlx-Ppxlib--Ast-builder-generated \
ocamlx-Ppxlib--Ast-builder-intf \
ocamlx-Ppxlib--Ast-pattern \
ocamlx-Ppxlib--Ast-pattern-generated \
ocamlx-Ppxlib--Ast-pattern0 \
ocamlx-Ppxlib--Ast-traverse \
ocamlx-Ppxlib--Ast-traverse0 \
ocamlx-Ppxlib--Attribute \
ocamlx-Ppxlib--Caller-id \
ocamlx-Ppxlib--Code-matcher \
ocamlx-Ppxlib--Code-path \
ocamlx-Ppxlib--Common \
ocamlx-Ppxlib--Context-free \
ocamlx-Ppxlib--Deriving \
ocamlx-Ppxlib--Driver \
ocamlx-Ppxlib--Expansion-context \
ocamlx-Ppxlib--Expansion-helpers \
ocamlx-Ppxlib--Extension \
ocamlx-Ppxlib--Ignore-unused-warning \
ocamlx-Ppxlib--Import \
ocamlx-Ppxlib--Keyword \
ocamlx-Ppxlib--Loc \
ocamlx-Ppxlib--Location \
ocamlx-Ppxlib--Location-check \
ocamlx-Ppxlib--Longident \
ocamlx-Ppxlib--Merlin-helpers \
ocamlx-Ppxlib--Name \
ocamlx-Ppxlib--Options \
ocamlx-Ppxlib--Quoter \
ocamlx-Ppxlib--Reconcile \
ocamlx-Ppxlib--Skip-hash-bang \
ocamlx-Ppxlib--Spellcheck \
ocamlx-Ppxlib--Utils \
ocamlx-Ppxlib-ast \
ocamlx-Ppxlib-ast-- \
ocamlx-Ppxlib-ast--Ast \
ocamlx-Ppxlib-ast--Ast-helper-lite \
ocamlx-Ppxlib-ast--Import \
ocamlx-Ppxlib-ast--Location-error \
ocamlx-Ppxlib-ast--Stdlib0 \
ocamlx-Ppxlib-ast--Versions \
ocamlx-Ppxlib-ast--Warn \
ocamlx-Ppxlib-metaquot \
ocamlx-Ppxlib-metaquot-lifters \
ocamlx-Ppxlib-print-diff \
ocamlx-Ppxlib-runner \
ocamlx-Ppxlib-runner--Ppx-driver-runner \
ocamlx-Ppxlib-runner-as-ppx \
ocamlx-Ppxlib-runner-as-ppx--Ppx-driver-runner-as-ppx \
ocamlx-Ppxlib-traverse \
ocamlx-Ppxlib-traverse-builtins \
ocamlx-Stdppx"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
ocaml-Ast-mapper \
ocaml-Asttypes \
ocaml-Build-path-prefix-map \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-CamlinternalOO \
ocaml-Clflags \
ocaml-Cmi-format \
ocaml-Compmisc \
ocaml-Config \
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
ocaml-Parse \
ocaml-Parsetree \
ocaml-Path \
ocaml-Ppx-derivers \
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
ocaml-Stdlib--ArrayLabels \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--BytesLabels \
ocaml-Stdlib--Char \
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
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--StdLabels \
ocaml-Stdlib--String \
ocaml-Stdlib--StringLabels \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Subst \
ocaml-Type-immediacy \
ocaml-Types \
ocaml-Warnings \
ocaml-ppxlib \
ocamlfind-compiler-libs.common \
ocamlfind-ocaml-compiler-libs.common \
ocamlfind-ocaml-compiler-libs.shadow \
ocamlfind-ppx-derivers \
ocamlfind-sexplib0 \
ocamlfind-stdlib-shims \
ocamlx-Ast-mapper \
ocamlx-CamlinternalLazy \
ocamlx-CamlinternalOO \
ocamlx-Compmisc \
ocamlx-Config \
ocamlx-Location \
ocamlx-Longident \
ocamlx-Ocaml-shadow \
ocamlx-Parse \
ocamlx-Ppx-derivers \
ocamlx-Sexplib0--Sexp \
ocamlx-Sexplib0--Sexp-conv \
ocamlx-Stdlib \
ocamlx-Stdlib--Arg \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--ArrayLabels \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--BytesLabels \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Int32 \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--ListLabels \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Nativeint \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--StringLabels \
ocamlx-Stdlib--Sys"

inherit rpm
