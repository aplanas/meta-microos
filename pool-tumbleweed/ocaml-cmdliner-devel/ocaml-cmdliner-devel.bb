SUMMARY = "Development files for ocaml-cmdliner"
DESCRIPTION = "The ocaml-cmdliner-devel package contains libraries and signature files for \
developing applications that use ocaml-cmdliner."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "ocaml-cmdliner-devel-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "938d9bd5331408786c8658155b58389cfb48b2e8bb705545ffd7207a4fc246429b2f82a92ac85d46c45433ec286bcbae9537fbfe2b9ad942e0b1e659e8258708"

RPROVIDES:${PN} += "ocaml-Cmdliner \
ocaml-Cmdliner-arg \
ocaml-Cmdliner-base \
ocaml-Cmdliner-cline \
ocaml-Cmdliner-cmd \
ocaml-Cmdliner-docgen \
ocaml-Cmdliner-eval \
ocaml-Cmdliner-exit \
ocaml-Cmdliner-info \
ocaml-Cmdliner-manpage \
ocaml-Cmdliner-msg \
ocaml-Cmdliner-term \
ocaml-Cmdliner-term-deprecated \
ocaml-Cmdliner-trie \
ocaml-cmdliner-devel \
ocamlfind-cmdliner \
ocamlx-Cmdliner \
ocamlx-Cmdliner-arg \
ocamlx-Cmdliner-base \
ocamlx-Cmdliner-cline \
ocamlx-Cmdliner-cmd \
ocamlx-Cmdliner-docgen \
ocamlx-Cmdliner-eval \
ocamlx-Cmdliner-exit \
ocamlx-Cmdliner-info \
ocamlx-Cmdliner-manpage \
ocamlx-Cmdliner-msg \
ocamlx-Cmdliner-term \
ocamlx-Cmdliner-term-deprecated \
ocamlx-Cmdliner-trie"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Format \
ocaml-Stdlib--Int \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Nativeint \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Result \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-cmdliner \
ocamlx-CamlinternalLazy \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Int \
ocamlx-Stdlib--Int32 \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Nativeint \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Result \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys"

inherit rpm
