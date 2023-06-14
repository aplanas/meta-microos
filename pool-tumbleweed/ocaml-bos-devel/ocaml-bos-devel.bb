SUMMARY = "Development files for ocaml-bos"
DESCRIPTION = "The ocaml-bos-devel package contains libraries and signature files for \
developing applications that use ocaml-bos."
LICENSE = "ISC"

PV = "0.2.1"

RPM_NAME = "ocaml-bos-devel-0.2.1-1.1.aarch64.rpm"
RPM_HASH = "45001239e54d48702c1945c9df517d8266c4600213f0bc9d2f61c3981d265caf7dce49a766a84254bb7c8425be768e09277edf11a11ccb9d1be5ee125750c3a8"

RPROVIDES:${PN} += "ocaml-Bos \
ocaml-Bos-base \
ocaml-Bos-cmd \
ocaml-Bos-log \
ocaml-Bos-os-arg \
ocaml-Bos-os-cmd \
ocaml-Bos-os-dir \
ocaml-Bos-os-env \
ocaml-Bos-os-file \
ocaml-Bos-os-path \
ocaml-Bos-os-tmp \
ocaml-Bos-os-u \
ocaml-Bos-pat \
ocaml-Bos-setup \
ocaml-Bos-top \
ocaml-bos-devel \
ocamlfind-bos \
ocamlfind-bos.setup \
ocamlfind-bos.top \
ocamlx-Bos \
ocamlx-Bos-base \
ocamlx-Bos-cmd \
ocamlx-Bos-log \
ocamlx-Bos-os-arg \
ocamlx-Bos-os-cmd \
ocamlx-Bos-os-dir \
ocamlx-Bos-os-env \
ocamlx-Bos-os-file \
ocamlx-Bos-os-path \
ocamlx-Bos-os-tmp \
ocamlx-Bos-os-u \
ocamlx-Bos-pat \
ocamlx-Bos-setup \
ocamlx-Bos-top"

RDEPENDS:${PN} += "ocaml-Astring \
ocaml-Asttypes \
ocaml-Build-path-prefix-map \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Cmi-format \
ocaml-Env \
ocaml-Fmt \
ocaml-Fmt-tty \
ocaml-Fpath \
ocaml-Ident \
ocaml-Identifiable \
ocaml-Load-path \
ocaml-Location \
ocaml-Logs \
ocaml-Logs-fmt \
ocaml-Longident \
ocaml-Misc \
ocaml-Outcometree \
ocaml-Parsetree \
ocaml-Path \
ocaml-Primitive \
ocaml-Rresult \
ocaml-Shape \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
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
ocaml-Stdlib--Map \
ocaml-Stdlib--Nativeint \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Queue \
ocaml-Stdlib--Random \
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
ocaml-Unix \
ocaml-Warnings \
ocaml-bos \
ocamlfind-astring \
ocamlfind-astring.top \
ocamlfind-compiler-libs.toplevel \
ocamlfind-fmt \
ocamlfind-fmt.top \
ocamlfind-fmt.tty \
ocamlfind-fpath \
ocamlfind-fpath.top \
ocamlfind-logs \
ocamlfind-logs.fmt \
ocamlfind-logs.top \
ocamlfind-rresult \
ocamlfind-rresult.top \
ocamlfind-unix \
ocamlx-Astring \
ocamlx-CamlinternalLazy \
ocamlx-Fmt \
ocamlx-Fmt-tty \
ocamlx-Fpath \
ocamlx-Logs \
ocamlx-Logs-fmt \
ocamlx-Rresult \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Random \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--Sys \
ocamlx-Toploop \
ocamlx-Unix"

inherit rpm
