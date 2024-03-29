SUMMARY = "Development files for ocaml-sexplib0"
DESCRIPTION = "The ocaml-sexplib0-devel package contains libraries and signature files for \
developing applications that use ocaml-sexplib0."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "ocaml-sexplib0-devel-0.16.0-1.2.aarch64.rpm"
RPM_HASH = "122d1292db3d103501e233e75b5099d3672e53367d016e796d1a8ac7bc776ddde274ddeac1c297697aca80de53b961c9de52795a886abcd0ba2bc70b26b687cc"

RPROVIDES:${PN} += "ocaml-Sexplib0 \
ocaml-Sexplib0-- \
ocaml-Sexplib0--Sexp \
ocaml-Sexplib0--Sexp-conv \
ocaml-Sexplib0--Sexp-conv-error \
ocaml-Sexplib0--Sexp-conv-grammar \
ocaml-Sexplib0--Sexp-conv-record \
ocaml-Sexplib0--Sexp-grammar \
ocaml-Sexplib0--Sexpable \
ocaml-sexplib0-devel \
ocamlfind-sexplib0 \
ocamlx-Sexplib0 \
ocamlx-Sexplib0-- \
ocamlx-Sexplib0--Sexp \
ocamlx-Sexplib0--Sexp-conv \
ocamlx-Sexplib0--Sexp-conv-error \
ocamlx-Sexplib0--Sexp-conv-grammar \
ocamlx-Sexplib0--Sexp-conv-record \
ocamlx-Sexplib0--Sexp-grammar \
ocamlx-Sexplib0--Sexpable"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Stdlib \
ocaml-Stdlib--Arg \
ocaml-Stdlib--ArrayLabels \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--BytesLabels \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Ephemeron \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--ListLabels \
ocaml-Stdlib--Map \
ocaml-Stdlib--MoreLabels \
ocaml-Stdlib--Nativeint \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Option \
ocaml-Stdlib--Parsing \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Queue \
ocaml-Stdlib--Scanf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--Stack \
ocaml-Stdlib--StdLabels \
ocaml-Stdlib--StringLabels \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-sexplib0 \
ocamlx-CamlinternalLazy \
ocamlx-Stdlib \
ocamlx-Stdlib--Arg \
ocamlx-Stdlib--ArrayLabels \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--BytesLabels \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Ephemeron \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Int32 \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--Lazy \
ocamlx-Stdlib--ListLabels \
ocamlx-Stdlib--MoreLabels \
ocamlx-Stdlib--Nativeint \
ocamlx-Stdlib--Obj \
ocamlx-Stdlib--Option \
ocamlx-Stdlib--Parsing \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Queue \
ocamlx-Stdlib--Scanf \
ocamlx-Stdlib--Stack \
ocamlx-Stdlib--StringLabels \
ocamlx-Stdlib--Sys"

inherit rpm
