SUMMARY = "Development files for ocaml-mccs"
DESCRIPTION = "This package contains development files for ocaml-mccs."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception & BSD-3-Clause & GPL-3.0-only"

PV = "1.1+14"

RPM_NAME = "ocaml-mccs-devel-1.1+14-1.7.aarch64.rpm"
RPM_HASH = "e3a24f87c7553334ea1eed0ad8f27316c4abb36686351009e6b1139b64b5f501b4018f1f3c5da5434ec75b699c59ebf04c1ff1348b8f3b212041dfff5550f5fa"

RPROVIDES:${PN} += "ocaml(Mccs) \
ocaml(Ocaml_mccs_glpk) \
ocaml-mccs-devel \
ocaml-mccs-devel(aarch-64) \
ocamlfind(mccs) \
ocamlfind(mccs.glpk) \
ocamlfind(mccs.glpk.internal) \
ocamlx(Mccs) \
ocamlx(Ocaml_mccs_glpk)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
ocaml(CamlinternalFormatBasics) \
ocaml(Cudf) \
ocaml(Cudf_types) \
ocaml(Stdlib) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Callback) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml-mccs \
ocamlfind(cudf) \
ocamlx(Cudf) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Callback) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Sys)"

inherit rpm
