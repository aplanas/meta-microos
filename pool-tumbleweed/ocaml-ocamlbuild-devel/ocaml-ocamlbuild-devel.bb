SUMMARY = "Development files for ocaml-ocamlbuild"
DESCRIPTION = "The ocaml-ocamlbuild-devel package contains libraries and signature files for \
developing applications that use ocaml-ocamlbuild."
LICENSE = "LGPL-2.0-only-WITH-OCaml-LGPL-linking-exception"

PV = "0.14.2"

RPM_NAME = "ocaml-ocamlbuild-devel-0.14.2-1.4.aarch64.rpm"
RPM_HASH = "867e0192286bc97b320c4c1a2582d1e1ac1124086bea95219f16e935bb6d5f4772118bdf2a94f3f841b038c360ed5846db6d08dac484b326636e68ca22ad2cd4"

RPROVIDES:${PN} += "ocaml-Ocamlbuild \
ocaml-Ocamlbuild-executor \
ocaml-Ocamlbuild-pack \
ocaml-Ocamlbuild-plugin \
ocaml-Ocamlbuild-unix-plugin \
ocaml-Signatures \
ocaml-ocamlbuild-devel \
ocamlfind-ocamlbuild \
ocamlx-Ocamlbuild \
ocamlx-Ocamlbuild-executor \
ocamlx-Ocamlbuild-pack \
ocamlx-Ocamlbuild-plugin \
ocamlx-Ocamlbuild-unix-plugin"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
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
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Queue \
ocaml-Stdlib--Scanf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Unix \
ocaml-ocamlbuild \
ocamlfind-unix \
ocamlx-CamlinternalLazy \
ocamlx-Stdlib \
ocamlx-Stdlib--Arg \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Digest \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Queue \
ocamlx-Stdlib--Scanf \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Unix"

inherit rpm
