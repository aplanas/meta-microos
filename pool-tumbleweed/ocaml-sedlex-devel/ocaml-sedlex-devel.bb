SUMMARY = "Development files for ocaml-sedlex"
DESCRIPTION = "The ocaml-sedlex-devel package contains libraries and signature files for \
developing applications that use ocaml-sedlex."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "ocaml-sedlex-devel-3.1-3.1.aarch64.rpm"
RPM_HASH = "7a834df2be07e2c605621ba974a9c4b52f584f41237b126b51d4abe45d401682057d92f0ab9fa6f31937a810853e10550b0d68cbe5d40497714c2752849a2259"

RPROVIDES:${PN} += "ocaml(Sedlex_ppx) \
ocaml(Sedlex_ppx__Ppx_sedlex) \
ocaml(Sedlex_ppx__Sedlex) \
ocaml(Sedlex_ppx__Sedlex_cset) \
ocaml(Sedlex_ppx__Unicode) \
ocaml(Sedlexing) \
ocaml-sedlex-devel \
ocaml-sedlex-devel(aarch-64) \
ocamlfind(sedlex) \
ocamlfind(sedlex.ppx) \
ocamlx(Sedlex_ppx) \
ocamlx(Sedlex_ppx__Ppx_sedlex) \
ocamlx(Sedlex_ppx__Sedlex) \
ocamlx(Sedlex_ppx__Sedlex_cset) \
ocamlx(Sedlex_ppx__Unicode) \
ocamlx(Sedlexing)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libm.so.6()(64bit) \
ocaml(Astlib) \
ocaml(Astlib__) \
ocaml(Astlib__Ast_402) \
ocaml(Astlib__Ast_403) \
ocaml(Astlib__Ast_404) \
ocaml(Astlib__Ast_405) \
ocaml(Astlib__Ast_406) \
ocaml(Astlib__Ast_407) \
ocaml(Astlib__Ast_408) \
ocaml(Astlib__Ast_409) \
ocaml(Astlib__Ast_410) \
ocaml(Astlib__Ast_411) \
ocaml(Astlib__Ast_412) \
ocaml(Astlib__Ast_413) \
ocaml(Astlib__Ast_414) \
ocaml(Astlib__Ast_500) \
ocaml(Astlib__Location) \
ocaml(Astlib__Longident) \
ocaml(Astlib__Parse) \
ocaml(Asttypes) \
ocaml(Build_path_prefix_map) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(CamlinternalOO) \
ocaml(Clflags) \
ocaml(Cmi_format) \
ocaml(Compmisc) \
ocaml(Env) \
ocaml(Gen) \
ocaml(Gen_intf) \
ocaml(Ident) \
ocaml(Identifiable) \
ocaml(Load_path) \
ocaml(Location) \
ocaml(Longident) \
ocaml(Misc) \
ocaml(Ocaml_common) \
ocaml(Ocaml_shadow) \
ocaml(Outcometree) \
ocaml(Parsetree) \
ocaml(Path) \
ocaml(Ppxlib) \
ocaml(Ppxlib__) \
ocaml(Ppxlib__Ast_builder) \
ocaml(Ppxlib__Ast_builder_generated) \
ocaml(Ppxlib__Ast_builder_intf) \
ocaml(Ppxlib__Ast_pattern) \
ocaml(Ppxlib__Ast_pattern0) \
ocaml(Ppxlib__Ast_pattern_generated) \
ocaml(Ppxlib__Ast_traverse) \
ocaml(Ppxlib__Ast_traverse0) \
ocaml(Ppxlib__Attribute) \
ocaml(Ppxlib__Code_path) \
ocaml(Ppxlib__Common) \
ocaml(Ppxlib__Context_free) \
ocaml(Ppxlib__Driver) \
ocaml(Ppxlib__Expansion_context) \
ocaml(Ppxlib__Extension) \
ocaml(Ppxlib__Import) \
ocaml(Ppxlib__Loc) \
ocaml(Ppxlib__Location) \
ocaml(Ppxlib__Longident) \
ocaml(Ppxlib__Name) \
ocaml(Ppxlib__Utils) \
ocaml(Ppxlib_ast) \
ocaml(Ppxlib_ast__) \
ocaml(Ppxlib_ast__Ast) \
ocaml(Ppxlib_ast__Import) \
ocaml(Ppxlib_ast__Versions) \
ocaml(Ppxlib_traverse_builtins) \
ocaml(Primitive) \
ocaml(Profile) \
ocaml(Sexplib0) \
ocaml(Sexplib0__) \
ocaml(Sexplib0__Sexp) \
ocaml(Sexplib0__Sexp_conv) \
ocaml(Sexplib0__Sexp_conv_grammar) \
ocaml(Sexplib0__Sexp_grammar) \
ocaml(Sexplib0__Sexpable) \
ocaml(Shape) \
ocaml(Stdlib) \
ocaml(Stdlib__Arg) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__BytesLabels) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__ListLabels) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Option) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__StdLabels) \
ocaml(Stdlib__String) \
ocaml(Stdlib__StringLabels) \
ocaml(Stdlib__Uchar) \
ocaml(Stdppx) \
ocaml(Subst) \
ocaml(Type_immediacy) \
ocaml(Types) \
ocaml(Warnings) \
ocaml-sedlex \
ocamlfind(gen) \
ocamlfind(ppxlib) \
ocamlfind(ppxlib.ast) \
ocamlx(CamlinternalOO) \
ocamlx(Gen) \
ocamlx(Ppxlib) \
ocamlx(Ppxlib__Ast_builder) \
ocamlx(Ppxlib__Ast_pattern) \
ocamlx(Ppxlib__Ast_traverse) \
ocamlx(Ppxlib__Driver) \
ocamlx(Ppxlib__Extension) \
ocamlx(Ppxlib__Location) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Char) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Option) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Uchar)"

inherit rpm
