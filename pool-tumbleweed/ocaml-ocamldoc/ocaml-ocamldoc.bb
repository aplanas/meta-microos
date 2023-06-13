SUMMARY = "Documentation generator for OCaml"
DESCRIPTION = "OCaml is a high-level, strongly-typed, functional and object-oriented \
programming language from the ML family of languages. \
 \
This package contains a documentation generator for OCaml."
LICENSE = "QPL-1.0"

PV = "4.14.1"

RPM_NAME = "ocaml-ocamldoc-4.14.1-1.3.aarch64.rpm"
RPM_HASH = "a1d4db2de7be540277f8734db182822fa42ae684f8c1e7c01b86e9a4cb7477243aea86e26096543d87aa089eab5178f8899920330e06956d79ed9a1faaeac5c2"

RPROVIDES:${PN} += "ocaml(Odoc) \
ocaml(Odoc_analyse) \
ocaml(Odoc_args) \
ocaml(Odoc_ast) \
ocaml(Odoc_class) \
ocaml(Odoc_comments) \
ocaml(Odoc_comments_global) \
ocaml(Odoc_config) \
ocaml(Odoc_control) \
ocaml(Odoc_cross) \
ocaml(Odoc_dag2html) \
ocaml(Odoc_dep) \
ocaml(Odoc_dot) \
ocaml(Odoc_env) \
ocaml(Odoc_exception) \
ocaml(Odoc_extension) \
ocaml(Odoc_gen) \
ocaml(Odoc_global) \
ocaml(Odoc_html) \
ocaml(Odoc_info) \
ocaml(Odoc_inherit) \
ocaml(Odoc_latex) \
ocaml(Odoc_latex_style) \
ocaml(Odoc_lexer) \
ocaml(Odoc_man) \
ocaml(Odoc_merge) \
ocaml(Odoc_messages) \
ocaml(Odoc_misc) \
ocaml(Odoc_module) \
ocaml(Odoc_name) \
ocaml(Odoc_ocamlhtml) \
ocaml(Odoc_parameter) \
ocaml(Odoc_parser) \
ocaml(Odoc_print) \
ocaml(Odoc_scan) \
ocaml(Odoc_search) \
ocaml(Odoc_see_lexer) \
ocaml(Odoc_sig) \
ocaml(Odoc_str) \
ocaml(Odoc_test) \
ocaml(Odoc_texi) \
ocaml(Odoc_text) \
ocaml(Odoc_text_lexer) \
ocaml(Odoc_text_parser) \
ocaml(Odoc_to_text) \
ocaml(Odoc_type) \
ocaml(Odoc_types) \
ocaml(Odoc_value) \
ocaml-ocamldoc \
ocaml-ocamldoc(aarch-64) \
ocamlfind(ocamldoc) \
ocamlx(Odoc) \
ocamlx(Odoc_analyse) \
ocamlx(Odoc_args) \
ocamlx(Odoc_ast) \
ocamlx(Odoc_class) \
ocamlx(Odoc_comments) \
ocamlx(Odoc_comments_global) \
ocamlx(Odoc_config) \
ocamlx(Odoc_control) \
ocamlx(Odoc_cross) \
ocamlx(Odoc_dag2html) \
ocamlx(Odoc_dep) \
ocamlx(Odoc_dot) \
ocamlx(Odoc_env) \
ocamlx(Odoc_exception) \
ocamlx(Odoc_extension) \
ocamlx(Odoc_gen) \
ocamlx(Odoc_global) \
ocamlx(Odoc_html) \
ocamlx(Odoc_info) \
ocamlx(Odoc_inherit) \
ocamlx(Odoc_latex) \
ocamlx(Odoc_latex_style) \
ocamlx(Odoc_lexer) \
ocamlx(Odoc_man) \
ocamlx(Odoc_merge) \
ocamlx(Odoc_messages) \
ocamlx(Odoc_misc) \
ocamlx(Odoc_module) \
ocamlx(Odoc_name) \
ocamlx(Odoc_ocamlhtml) \
ocamlx(Odoc_parameter) \
ocamlx(Odoc_parser) \
ocamlx(Odoc_print) \
ocamlx(Odoc_scan) \
ocamlx(Odoc_search) \
ocamlx(Odoc_see_lexer) \
ocamlx(Odoc_sig) \
ocamlx(Odoc_str) \
ocamlx(Odoc_texi) \
ocamlx(Odoc_text) \
ocamlx(Odoc_text_lexer) \
ocamlx(Odoc_text_parser) \
ocamlx(Odoc_to_text) \
ocamlx(Odoc_type) \
ocamlx(Odoc_types) \
ocamlx(Odoc_value)"

RDEPENDS:${PN} += "/usr/bin/ocamlrun \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
ocaml \
ocaml(Asttypes) \
ocaml(Btype) \
ocaml(Build_path_prefix_map) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(CamlinternalMenhirLib) \
ocaml(CamlinternalOO) \
ocaml(Clflags) \
ocaml(Cmi_format) \
ocaml(Compenv) \
ocaml(Compmisc) \
ocaml(Config) \
ocaml(Ctype) \
ocaml(Depend) \
ocaml(Diffing) \
ocaml(Diffing_with_keys) \
ocaml(Docstrings) \
ocaml(Dynlink) \
ocaml(Env) \
ocaml(Errortrace) \
ocaml(Ident) \
ocaml(Identifiable) \
ocaml(Includecore) \
ocaml(Includemod) \
ocaml(Lexer) \
ocaml(Load_path) \
ocaml(Location) \
ocaml(Longident) \
ocaml(Main_args) \
ocaml(Misc) \
ocaml(Outcometree) \
ocaml(Parse) \
ocaml(Parser) \
ocaml(Parsetree) \
ocaml(Path) \
ocaml(Pparse) \
ocaml(Predef) \
ocaml(Primitive) \
ocaml(Printtyp) \
ocaml(Profile) \
ocaml(Shape) \
ocaml(Stdlib) \
ocaml(Stdlib__Arg) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Complex) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Filename) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Option) \
ocaml(Stdlib__Parsing) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Str) \
ocaml(Subst) \
ocaml(Syntaxerr) \
ocaml(Type_immediacy) \
ocaml(Typedecl) \
ocaml(Typedecl_immediacy) \
ocaml(Typedecl_properties) \
ocaml(Typedecl_separability) \
ocaml(Typedecl_variance) \
ocaml(Typedtree) \
ocaml(Typemod) \
ocaml(Types) \
ocaml(Unix) \
ocaml(Warnings) \
ocamlfind(compiler-libs) \
ocamlx(Btype) \
ocamlx(CamlinternalOO) \
ocamlx(Clflags) \
ocamlx(Compenv) \
ocamlx(Compmisc) \
ocamlx(Config) \
ocamlx(Ctype) \
ocamlx(Depend) \
ocamlx(Dynlink) \
ocamlx(Env) \
ocamlx(Ident) \
ocamlx(Lexer) \
ocamlx(Location) \
ocamlx(Longident) \
ocamlx(Main_args) \
ocamlx(Misc) \
ocamlx(Parse) \
ocamlx(Path) \
ocamlx(Pparse) \
ocamlx(Predef) \
ocamlx(Printtyp) \
ocamlx(Shape) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Arg) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Char) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Int) \
ocamlx(Stdlib__Lexing) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Option) \
ocamlx(Stdlib__Parsing) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
ocamlx(Str) \
ocamlx(Syntaxerr) \
ocamlx(Typemod) \
ocamlx(Types) \
ocamlx(Unix) \
ocamlx(Warnings)"

inherit rpm
