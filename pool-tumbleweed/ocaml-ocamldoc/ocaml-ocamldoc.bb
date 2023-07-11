SUMMARY = "Documentation generator for OCaml"
DESCRIPTION = "OCaml is a high-level, strongly-typed, functional and object-oriented \
programming language from the ML family of languages. \
 \
This package contains a documentation generator for OCaml."
LICENSE = "QPL-1.0"

PV = "4.14.1"

RPM_NAME = "ocaml-ocamldoc-4.14.1-1.4.aarch64.rpm"
RPM_HASH = "a2069af262189c7c7903c9bf8c70bf7e2e4ab06b71d4d0549e9e3e41c74ebb5ec0e3a0b26f51f2c81d2590a222c57ba7dbf559d466375e7c053c30b6905cda3d"

RPROVIDES:${PN} += "ocaml-Odoc \
ocaml-Odoc-analyse \
ocaml-Odoc-args \
ocaml-Odoc-ast \
ocaml-Odoc-class \
ocaml-Odoc-comments \
ocaml-Odoc-comments-global \
ocaml-Odoc-config \
ocaml-Odoc-control \
ocaml-Odoc-cross \
ocaml-Odoc-dag2html \
ocaml-Odoc-dep \
ocaml-Odoc-dot \
ocaml-Odoc-env \
ocaml-Odoc-exception \
ocaml-Odoc-extension \
ocaml-Odoc-gen \
ocaml-Odoc-global \
ocaml-Odoc-html \
ocaml-Odoc-info \
ocaml-Odoc-inherit \
ocaml-Odoc-latex \
ocaml-Odoc-latex-style \
ocaml-Odoc-lexer \
ocaml-Odoc-man \
ocaml-Odoc-merge \
ocaml-Odoc-messages \
ocaml-Odoc-misc \
ocaml-Odoc-module \
ocaml-Odoc-name \
ocaml-Odoc-ocamlhtml \
ocaml-Odoc-parameter \
ocaml-Odoc-parser \
ocaml-Odoc-print \
ocaml-Odoc-scan \
ocaml-Odoc-search \
ocaml-Odoc-see-lexer \
ocaml-Odoc-sig \
ocaml-Odoc-str \
ocaml-Odoc-test \
ocaml-Odoc-texi \
ocaml-Odoc-text \
ocaml-Odoc-text-lexer \
ocaml-Odoc-text-parser \
ocaml-Odoc-to-text \
ocaml-Odoc-type \
ocaml-Odoc-types \
ocaml-Odoc-value \
ocaml-ocamldoc \
ocamlfind-ocamldoc \
ocamlx-Odoc \
ocamlx-Odoc-analyse \
ocamlx-Odoc-args \
ocamlx-Odoc-ast \
ocamlx-Odoc-class \
ocamlx-Odoc-comments \
ocamlx-Odoc-comments-global \
ocamlx-Odoc-config \
ocamlx-Odoc-control \
ocamlx-Odoc-cross \
ocamlx-Odoc-dag2html \
ocamlx-Odoc-dep \
ocamlx-Odoc-dot \
ocamlx-Odoc-env \
ocamlx-Odoc-exception \
ocamlx-Odoc-extension \
ocamlx-Odoc-gen \
ocamlx-Odoc-global \
ocamlx-Odoc-html \
ocamlx-Odoc-info \
ocamlx-Odoc-inherit \
ocamlx-Odoc-latex \
ocamlx-Odoc-latex-style \
ocamlx-Odoc-lexer \
ocamlx-Odoc-man \
ocamlx-Odoc-merge \
ocamlx-Odoc-messages \
ocamlx-Odoc-misc \
ocamlx-Odoc-module \
ocamlx-Odoc-name \
ocamlx-Odoc-ocamlhtml \
ocamlx-Odoc-parameter \
ocamlx-Odoc-parser \
ocamlx-Odoc-print \
ocamlx-Odoc-scan \
ocamlx-Odoc-search \
ocamlx-Odoc-see-lexer \
ocamlx-Odoc-sig \
ocamlx-Odoc-str \
ocamlx-Odoc-texi \
ocamlx-Odoc-text \
ocamlx-Odoc-text-lexer \
ocamlx-Odoc-text-parser \
ocamlx-Odoc-to-text \
ocamlx-Odoc-type \
ocamlx-Odoc-types \
ocamlx-Odoc-value"

RDEPENDS:${PN} += "/usr/bin/ocamlrun \
libc.so.6 \
libm.so.6 \
ocaml \
ocaml-Asttypes \
ocaml-Btype \
ocaml-Build-path-prefix-map \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-CamlinternalMenhirLib \
ocaml-CamlinternalOO \
ocaml-Clflags \
ocaml-Cmi-format \
ocaml-Compenv \
ocaml-Compmisc \
ocaml-Config \
ocaml-Ctype \
ocaml-Depend \
ocaml-Diffing \
ocaml-Diffing-with-keys \
ocaml-Docstrings \
ocaml-Dynlink \
ocaml-Env \
ocaml-Errortrace \
ocaml-Ident \
ocaml-Identifiable \
ocaml-Includecore \
ocaml-Includemod \
ocaml-Lexer \
ocaml-Load-path \
ocaml-Location \
ocaml-Longident \
ocaml-Main-args \
ocaml-Misc \
ocaml-Outcometree \
ocaml-Parse \
ocaml-Parser \
ocaml-Parsetree \
ocaml-Path \
ocaml-Pparse \
ocaml-Predef \
ocaml-Primitive \
ocaml-Printtyp \
ocaml-Profile \
ocaml-Shape \
ocaml-Stdlib \
ocaml-Stdlib--Arg \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Option \
ocaml-Stdlib--Parsing \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Str \
ocaml-Subst \
ocaml-Syntaxerr \
ocaml-Type-immediacy \
ocaml-Typedecl \
ocaml-Typedecl-immediacy \
ocaml-Typedecl-properties \
ocaml-Typedecl-separability \
ocaml-Typedecl-variance \
ocaml-Typedtree \
ocaml-Typemod \
ocaml-Types \
ocaml-Unix \
ocaml-Warnings \
ocamlfind-compiler-libs \
ocamlx-Btype \
ocamlx-CamlinternalOO \
ocamlx-Clflags \
ocamlx-Compenv \
ocamlx-Compmisc \
ocamlx-Config \
ocamlx-Ctype \
ocamlx-Depend \
ocamlx-Dynlink \
ocamlx-Env \
ocamlx-Ident \
ocamlx-Lexer \
ocamlx-Location \
ocamlx-Longident \
ocamlx-Main-args \
ocamlx-Misc \
ocamlx-Parse \
ocamlx-Path \
ocamlx-Pparse \
ocamlx-Predef \
ocamlx-Printtyp \
ocamlx-Shape \
ocamlx-Stdlib \
ocamlx-Stdlib--Arg \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Int \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Option \
ocamlx-Stdlib--Parsing \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Str \
ocamlx-Syntaxerr \
ocamlx-Typemod \
ocamlx-Types \
ocamlx-Unix \
ocamlx-Warnings"

inherit rpm
