SUMMARY = "Development files for ocaml-ppx_deriving"
DESCRIPTION = "The ocaml-ppx_deriving-devel package contains libraries and signature files for \
developing applications that use ocaml-ppx_deriving."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "ocaml-ppx_deriving-devel-5.2.1-2.1.aarch64.rpm"
RPM_HASH = "94bd6c59f265a04f9705c4f5e3b7386b064f7e5a044ed804e0f1fb63789f2454cd17f1f1076a558f9634c29a4798235be64bbcdb3c9497f45ed7bb359e518a87"

RPROVIDES:${PN} += "ocaml(Ppx_deriving) \
ocaml(Ppx_deriving_create) \
ocaml(Ppx_deriving_enum) \
ocaml(Ppx_deriving_eq) \
ocaml(Ppx_deriving_fold) \
ocaml(Ppx_deriving_iter) \
ocaml(Ppx_deriving_make) \
ocaml(Ppx_deriving_map) \
ocaml(Ppx_deriving_ord) \
ocaml(Ppx_deriving_runtime) \
ocaml(Ppx_deriving_show) \
ocaml(Ppx_deriving_std) \
ocaml-ppx_deriving-devel \
ocaml-ppx_deriving-devel(aarch-64) \
ocamlfind(ppx_deriving) \
ocamlfind(ppx_deriving.api) \
ocamlfind(ppx_deriving.create) \
ocamlfind(ppx_deriving.enum) \
ocamlfind(ppx_deriving.eq) \
ocamlfind(ppx_deriving.fold) \
ocamlfind(ppx_deriving.iter) \
ocamlfind(ppx_deriving.make) \
ocamlfind(ppx_deriving.map) \
ocamlfind(ppx_deriving.ord) \
ocamlfind(ppx_deriving.runtime) \
ocamlfind(ppx_deriving.show) \
ocamlfind(ppx_deriving.std) \
ocamlx(Ppx_deriving) \
ocamlx(Ppx_deriving_create) \
ocamlx(Ppx_deriving_enum) \
ocamlx(Ppx_deriving_eq) \
ocamlx(Ppx_deriving_fold) \
ocamlx(Ppx_deriving_iter) \
ocamlx(Ppx_deriving_make) \
ocamlx(Ppx_deriving_map) \
ocamlx(Ppx_deriving_ord) \
ocamlx(Ppx_deriving_runtime) \
ocamlx(Ppx_deriving_show) \
ocamlx(Ppx_deriving_std)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
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
ocaml(Astlib__Pprintast) \
ocaml(Asttypes) \
ocaml(Build_path_prefix_map) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(CamlinternalOO) \
ocaml(Clflags) \
ocaml(Cmi_format) \
ocaml(Compmisc) \
ocaml(Env) \
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
ocaml(Ppx_derivers) \
ocaml(Ppxlib) \
ocaml(Ppxlib__) \
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
ocaml(Ppxlib_ast__Ast_helper_lite) \
ocaml(Ppxlib_ast__Import) \
ocaml(Ppxlib_ast__Versions) \
ocaml(Ppxlib_traverse_builtins) \
ocaml(Primitive) \
ocaml(Profile) \
ocaml(Result) \
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
ocaml(Stdlib__Filename) \
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
ocaml(Stdlib__Queue) \
ocaml(Stdlib__Result) \
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
ocaml-ppx_deriving \
ocamlfind(compiler-libs.common) \
ocamlfind(ppx_derivers) \
ocamlfind(ppxlib) \
ocamlfind(ppxlib.ast) \
ocamlfind(result) \
ocamlx(Astlib__Pprintast) \
ocamlx(CamlinternalOO) \
ocamlx(Location) \
ocamlx(Longident) \
ocamlx(Ppx_derivers) \
ocamlx(Ppxlib__Ast_traverse) \
ocamlx(Ppxlib__Driver) \
ocamlx(Ppxlib__Longident) \
ocamlx(Ppxlib_ast__Ast_helper_lite) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Option) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Queue) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__String)"

inherit rpm