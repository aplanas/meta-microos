SUMMARY = "Development files for ocaml-cudf"
DESCRIPTION = "The ocaml-cudf-devel package contains libraries and signature files for \
developing applications that use ocaml-cudf."
LICENSE = "GPL-3.0-only"

PV = "0.9"

RPM_NAME = "ocaml-cudf-devel-0.9-2.15.aarch64.rpm"
RPM_HASH = "7338d3f6a26f765b90c46c1954898fbaf24006d9863a8bd819f5805fd13dc52967cb385c8c87b5588038c391e7846c22ab56604385cd8a6e10b021a2d85082d0"

RPROVIDES:${PN} += "ocaml(Cudf) \
ocaml(Cudf_822_lexer) \
ocaml(Cudf_822_parser) \
ocaml(Cudf_checker) \
ocaml(Cudf_conf) \
ocaml(Cudf_parser) \
ocaml(Cudf_printer) \
ocaml(Cudf_type_lexer) \
ocaml(Cudf_type_parser) \
ocaml(Cudf_types) \
ocaml(Cudf_types_pp) \
ocaml-cudf-devel \
ocaml-cudf-devel(aarch-64) \
ocamlfind(cudf) \
ocamlx(Cudf) \
ocamlx(Cudf_822_lexer) \
ocamlx(Cudf_822_parser) \
ocamlx(Cudf_checker) \
ocamlx(Cudf_conf) \
ocamlx(Cudf_parser) \
ocamlx(Cudf_printer) \
ocamlx(Cudf_type_lexer) \
ocamlx(Cudf_type_parser) \
ocamlx(Cudf_types) \
ocamlx(Cudf_types_pp)"

RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) \
ocaml(Enum) \
ocaml(ExtArray) \
ocaml(ExtBuffer) \
ocaml(ExtBytes) \
ocaml(ExtHashtbl) \
ocaml(ExtLib) \
ocaml(ExtList) \
ocaml(ExtString) \
ocaml(IO) \
ocaml(Option) \
ocaml(Std) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Parsing) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Scanf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Uchar) \
ocaml-cudf \
ocamlfind(extlib) \
ocamlfind(stdlib-shims) \
ocamlx(ExtBuffer) \
ocamlx(ExtHashtbl) \
ocamlx(ExtLib) \
ocamlx(ExtList) \
ocamlx(ExtString) \
ocamlx(IO) \
ocamlx(Option) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Lexing) \
ocamlx(Stdlib__Parsing) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__String)"

inherit rpm
