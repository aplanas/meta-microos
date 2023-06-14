SUMMARY = "Development files for ocaml-cudf"
DESCRIPTION = "The ocaml-cudf-devel package contains libraries and signature files for \
developing applications that use ocaml-cudf."
LICENSE = "GPL-3.0-only"

PV = "0.9"

RPM_NAME = "ocaml-cudf-devel-0.9-2.15.aarch64.rpm"
RPM_HASH = "7338d3f6a26f765b90c46c1954898fbaf24006d9863a8bd819f5805fd13dc52967cb385c8c87b5588038c391e7846c22ab56604385cd8a6e10b021a2d85082d0"

RPROVIDES:${PN} += "ocaml-Cudf \
ocaml-Cudf-822-lexer \
ocaml-Cudf-822-parser \
ocaml-Cudf-checker \
ocaml-Cudf-conf \
ocaml-Cudf-parser \
ocaml-Cudf-printer \
ocaml-Cudf-type-lexer \
ocaml-Cudf-type-parser \
ocaml-Cudf-types \
ocaml-Cudf-types-pp \
ocaml-cudf-devel \
ocamlfind-cudf \
ocamlx-Cudf \
ocamlx-Cudf-822-lexer \
ocamlx-Cudf-822-parser \
ocamlx-Cudf-checker \
ocamlx-Cudf-conf \
ocamlx-Cudf-parser \
ocamlx-Cudf-printer \
ocamlx-Cudf-type-lexer \
ocamlx-Cudf-type-parser \
ocamlx-Cudf-types \
ocamlx-Cudf-types-pp"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Enum \
ocaml-ExtArray \
ocaml-ExtBuffer \
ocaml-ExtBytes \
ocaml-ExtHashtbl \
ocaml-ExtLib \
ocaml-ExtList \
ocaml-ExtString \
ocaml-IO \
ocaml-Option \
ocaml-Std \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Either \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Parsing \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Scanf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-cudf \
ocamlfind-extlib \
ocamlfind-stdlib-shims \
ocamlx-ExtBuffer \
ocamlx-ExtHashtbl \
ocamlx-ExtLib \
ocamlx-ExtList \
ocamlx-ExtString \
ocamlx-IO \
ocamlx-Option \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--Parsing \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--String"

inherit rpm
