SUMMARY = "Development files for ocaml-benchmark"
DESCRIPTION = "The ocaml-benchmark-devel package contains libraries and signature files for \
developing applications that use ocaml-benchmark."
LICENSE = "LGPL-3.0-or-later-WITH-OCaml-linking-exception"

PV = "1.6"

RPM_NAME = "ocaml-benchmark-devel-1.6-1.24.aarch64.rpm"
RPM_HASH = "eac330a7c5a59123ef585685f8eb24ae9a3b2028541b6ac2cd01e3063d49bf9df8fb6265599b1adfe470631c8f6f2db362b9cc7556b9dc538bd4f18bf9fe8f4a"

RPROVIDES:${PN} += "ocaml-Benchmark \
ocaml-benchmark-devel \
ocamlfind-benchmark \
ocamlx-Benchmark"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Stdlib \
ocaml-Stdlib--Arg \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Format \
ocaml-Stdlib--Gc \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Unix \
ocaml-benchmark \
ocamlfind-unix \
ocamlx-CamlinternalLazy \
ocamlx-Stdlib \
ocamlx-Stdlib--Arg \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Gc \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Unix"

inherit rpm
