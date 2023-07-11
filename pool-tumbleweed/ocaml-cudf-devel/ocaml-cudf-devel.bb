SUMMARY = "Development files for ocaml-cudf"
DESCRIPTION = "The ocaml-cudf-devel package contains libraries and signature files for \
developing applications that use ocaml-cudf."
LICENSE = "GPL-3.0-only"

PV = "0.9"

RPM_NAME = "ocaml-cudf-devel-0.9-2.16.aarch64.rpm"
RPM_HASH = "8906e916e22c8cad269b9521b01ca923b0cd1777b1fb118e2b71a56fb7be8a7de6d8898f7478630f1616394631c3c82fb558ec2865f058bdd3b52314cbf05956"

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
