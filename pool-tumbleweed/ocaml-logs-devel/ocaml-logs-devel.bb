SUMMARY = "Development files for ocaml-logs"
DESCRIPTION = "The ocaml-logs-devel package contains libraries and signature files for \
developing applications that use ocaml-logs."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "ocaml-logs-devel-0.7.0-3.5.aarch64.rpm"
RPM_HASH = "4f3e14440776ff01691b732f79a8b680b4baba3ddbc3dd601ee06fe1ffe3ecfd4b21c9824d8cd9a9325469d84828bde238c01f6f5100d5ca5cc39df18052f1ab"

RPROVIDES:${PN} += "ocaml-Logs \
ocaml-Logs-cli \
ocaml-Logs-fmt \
ocaml-Logs-threaded \
ocaml-Logs-top \
ocaml-logs-devel \
ocamlfind-logs \
ocamlfind-logs.cli \
ocamlfind-logs.fmt \
ocamlfind-logs.threaded \
ocamlfind-logs.top \
ocamlx-Logs \
ocamlx-Logs-cli \
ocamlx-Logs-fmt \
ocamlx-Logs-threaded \
ocamlx-Logs-top"

RDEPENDS:${PN} += "ocaml-Asttypes \
ocaml-Build-path-prefix-map \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Cmdliner \
ocaml-Cmi-format \
ocaml-Env \
ocaml-Fmt \
ocaml-Ident \
ocaml-Identifiable \
ocaml-Load-path \
ocaml-Location \
ocaml-Longident \
ocaml-Misc \
ocaml-Mutex \
ocaml-Outcometree \
ocaml-Parsetree \
ocaml-Path \
ocaml-Primitive \
ocaml-Shape \
ocaml-Stdlib \
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
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Queue \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--Stack \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Subst \
ocaml-Toploop \
ocaml-Type-immediacy \
ocaml-Types \
ocaml-Warnings \
ocaml-logs \
ocamlfind-cmdliner \
ocamlfind-compiler-libs.toplevel \
ocamlfind-fmt \
ocamlfind-result \
ocamlfind-threads \
ocamlx-Cmdliner \
ocamlx-Fmt \
ocamlx-Mutex \
ocamlx-Stdlib \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Toploop"

inherit rpm
