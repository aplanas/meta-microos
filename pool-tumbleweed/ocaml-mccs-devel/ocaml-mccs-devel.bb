SUMMARY = "Development files for ocaml-mccs"
DESCRIPTION = "This package contains development files for ocaml-mccs."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception & BSD-3-Clause & GPL-3.0-only"

PV = "1.1+16"

RPM_NAME = "ocaml-mccs-devel-1.1+16-1.1.aarch64.rpm"
RPM_HASH = "4953210fb7bc2253936f339cc858260c8fc928c89b2160992d200fefe708dafe88d12cd5301b9297d2a5f42bcec3f8b8a21c587269b77d44d5a8874c8c641ba8"

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
