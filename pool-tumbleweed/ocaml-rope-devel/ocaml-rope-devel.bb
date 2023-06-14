SUMMARY = "Development files for ocaml-rope"
DESCRIPTION = "The ocaml-rope-devel package contains libraries and signature files for \
developing applications that use ocaml-rope."
LICENSE = "LGPL-2.1-or-later-WITH-OCaml-LGPL-linking-exception"

PV = "0.6.2"

RPM_NAME = "ocaml-rope-devel-0.6.2-3.24.aarch64.rpm"
RPM_HASH = "ff2570bc1395786ae537c87863966053586544b9bf2247e63629b5b9b7ba6352a33d38a0ead3d7774cc1430d610b2d0f0e6b32fcac6a6b0a2d0b25b915fb5118"

RPROVIDES:${PN} += "ocaml-Rope \
ocaml-Rope-top \
ocaml-rope-devel \
ocamlfind-rope \
ocamlfind-rope.top \
ocamlx-Rope"

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
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Pervasives \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Subst \
ocaml-Toploop \
ocaml-Type-immediacy \
ocaml-Types \
ocaml-Warnings \
ocaml-rope \
ocamlfind-bytes \
ocamlfind-compiler-libs.toplevel \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys"

inherit rpm
