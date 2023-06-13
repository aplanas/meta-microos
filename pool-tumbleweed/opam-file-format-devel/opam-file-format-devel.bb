SUMMARY = "Development files for the opam file syntax parser"
DESCRIPTION = "This is a parser and a printer for the opam file syntax. \
 \
This package contains development files for package opam-file-format."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception"

PV = "2.1.6"

RPM_NAME = "opam-file-format-devel-2.1.6-1.1.aarch64.rpm"
RPM_HASH = "e84586dd0e678e06e6416ad7899788b68b70df5eb6b734b50702691bc21dbf829d8323b15d7c20327ba880211edd76709ed0563a8cdddfd3af878b0e29dbb4d3"

RPROVIDES:${PN} += "ocaml(OpamBaseParser) \
ocaml(OpamLexer) \
ocaml(OpamParser) \
ocaml(OpamParserTypes) \
ocaml(OpamPrinter) \
ocamlfind(opam-file-format) \
ocamlx(OpamBaseParser) \
ocamlx(OpamLexer) \
ocamlx(OpamParser) \
ocamlx(OpamParserTypes) \
ocamlx(OpamPrinter) \
opam-file-format-devel \
opam-file-format-devel(aarch-64)"

RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Parsing) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Scanf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Stdlib__Weak) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Char) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Lexing) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Parsing) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Scanf) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
ocamlx(Stdlib__Weak) \
opam-file-format"

inherit rpm
