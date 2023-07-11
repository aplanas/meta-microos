SUMMARY = "Development files for ocaml-benchmark"
DESCRIPTION = "The ocaml-benchmark-devel package contains libraries and signature files for \
developing applications that use ocaml-benchmark."
LICENSE = "LGPL-3.0-or-later-with-OCaml-linking-exception"

PV = "1.6"

RPM_NAME = "ocaml-benchmark-devel-1.6-1.25.aarch64.rpm"
RPM_HASH = "30de0f10634f41909c710b99beffa642334c566166352a98e2b970d6b6cd2348aa1e1de590dac8d064cf419e146edd6972e2b1cd7ea047005f480cb06add1569"

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
