SUMMARY = "Development files for ocaml-mccs"
DESCRIPTION = "This package contains development files for ocaml-mccs."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception & BSD-3-Clause & GPL-3.0-only"

PV = "1.1+14"

RPM_NAME = "ocaml-mccs-devel-1.1+14-1.8.aarch64.rpm"
RPM_HASH = "8fc8192fc04e304765a1e3b0054505c549655006afcaf7609b9d326dc79a39b89a8dd7799522ae5779e76e21372a5ee5e16521c2e83f4e2be5e1079e24837f0d"

RPROVIDES:${PN} += "ocaml-Mccs \
ocaml-Ocaml-mccs-glpk \
ocaml-mccs-devel \
ocamlfind-mccs \
ocamlfind-mccs.glpk \
ocamlfind-mccs.glpk.internal \
ocamlx-Mccs \
ocamlx-Ocaml-mccs-glpk"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
ocaml-CamlinternalFormatBasics \
ocaml-Cudf \
ocaml-Cudf-types \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Either \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-mccs \
ocamlfind-cudf \
ocamlx-Cudf \
ocamlx-Stdlib \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Sys"

inherit rpm
