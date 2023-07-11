SUMMARY = "Development files for the opam file syntax parser"
DESCRIPTION = "This is a parser and a printer for the opam file syntax. \
 \
This package contains development files for package opam-file-format."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "2.1.6"

RPM_NAME = "opam-file-format-devel-2.1.6-1.2.aarch64.rpm"
RPM_HASH = "59131477e021f67e2c1e8e1187824daba90ffbb3867e655b5191d3b045ef77c4eb031199a4be38abdd5470af987e15deb7990812fa06e0ba81b0f31807995aa0"

RPROVIDES:${PN} += "ocaml-OpamBaseParser \
ocaml-OpamLexer \
ocaml-OpamParser \
ocaml-OpamParserTypes \
ocaml-OpamPrinter \
ocamlfind-opam-file-format \
ocamlx-OpamBaseParser \
ocamlx-OpamLexer \
ocamlx-OpamParser \
ocamlx-OpamParserTypes \
ocamlx-OpamPrinter \
opam-file-format-devel"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Parsing \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Scanf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Stdlib--Weak \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Parsing \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Scanf \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Stdlib--Weak \
opam-file-format"

inherit rpm
