SUMMARY = "Development files for ocaml-facile"
DESCRIPTION = "The ocaml-facile-devel package contains libraries and signature files for \
developing applications that use ocaml-facile."
LICENSE = "LGPL-2.1+"

PV = "1.1.4"

RPM_NAME = "ocaml-facile-devel-1.1.4-2.11.aarch64.rpm"
RPM_HASH = "8914745b1af7f15da36ef53bab662548b1934590f336fbc112f0e8f7711b67fe0f9448c4583d5ffdec880065e30f9583ded73a1d59faf0001d2199ed2c372277"

RPROVIDES:${PN} += "ocaml-Facile \
ocaml-Facile-- \
ocaml-Facile--Fcl-alldiff \
ocaml-Facile--Fcl-arith \
ocaml-Facile--Fcl-boolean \
ocaml-Facile--Fcl-conjunto \
ocaml-Facile--Fcl-cstr \
ocaml-Facile--Fcl-data \
ocaml-Facile--Fcl-debug \
ocaml-Facile--Fcl-domain \
ocaml-Facile--Fcl-expr \
ocaml-Facile--Fcl-fdArray \
ocaml-Facile--Fcl-float \
ocaml-Facile--Fcl-gcc \
ocaml-Facile--Fcl-genesis \
ocaml-Facile--Fcl-goals \
ocaml-Facile--Fcl-interval \
ocaml-Facile--Fcl-invariant \
ocaml-Facile--Fcl-linear \
ocaml-Facile--Fcl-misc \
ocaml-Facile--Fcl-nonlinear \
ocaml-Facile--Fcl-opti \
ocaml-Facile--Fcl-reify \
ocaml-Facile--Fcl-setDomain \
ocaml-Facile--Fcl-sorting \
ocaml-Facile--Fcl-stak \
ocaml-Facile--Fcl-var \
ocaml-facile-devel \
ocamlfind-facile \
ocamlx-Facile \
ocamlx-Facile-- \
ocamlx-Facile--Fcl-alldiff \
ocamlx-Facile--Fcl-arith \
ocamlx-Facile--Fcl-boolean \
ocamlx-Facile--Fcl-conjunto \
ocamlx-Facile--Fcl-cstr \
ocamlx-Facile--Fcl-data \
ocamlx-Facile--Fcl-debug \
ocamlx-Facile--Fcl-domain \
ocamlx-Facile--Fcl-expr \
ocamlx-Facile--Fcl-fdArray \
ocamlx-Facile--Fcl-float \
ocamlx-Facile--Fcl-gcc \
ocamlx-Facile--Fcl-genesis \
ocamlx-Facile--Fcl-goals \
ocamlx-Facile--Fcl-interval \
ocamlx-Facile--Fcl-invariant \
ocamlx-Facile--Fcl-linear \
ocamlx-Facile--Fcl-misc \
ocamlx-Facile--Fcl-nonlinear \
ocamlx-Facile--Fcl-opti \
ocamlx-Facile--Fcl-reify \
ocamlx-Facile--Fcl-setDomain \
ocamlx-Facile--Fcl-sorting \
ocamlx-Facile--Fcl-stak \
ocamlx-Facile--Fcl-var"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Either \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--List \
ocaml-Stdlib--Nativeint \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Random \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Stdlib--Weak \
ocaml-facile \
ocamlfind-stdlib-shims \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Random \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--Sys \
ocamlx-Stdlib--Weak"

inherit rpm
