SUMMARY = "Development files for ocaml-findlib"
DESCRIPTION = "The ocaml-findlib-devel package contains libraries and signature files \
for developing applications that use ocaml-findlib."
LICENSE = "MIT"

PV = "1.9.5"

RPM_NAME = "ocaml-findlib-devel-1.9.5-1.5.aarch64.rpm"
RPM_HASH = "3320f8192c6c7b52b2617e1de0f1cfe79fa746ba8fe81771639d49e2c0e4aaa9ef88f687d2c81040e7e5f0ffae13164cfda2c833ec3f39cdbab6f11b86cbfbf7"

RPROVIDES:${PN} += "ocaml(Findlib) \
ocaml(Findlib_config) \
ocaml(Fl_args) \
ocaml(Fl_dynload) \
ocaml(Fl_lint) \
ocaml(Fl_meta) \
ocaml(Fl_metascanner) \
ocaml(Fl_metatoken) \
ocaml(Fl_package_base) \
ocaml(Fl_split) \
ocaml(Fl_topo) \
ocaml(Ocaml_args) \
ocaml(Topfind) \
ocaml-findlib-camlp4 \
ocaml-findlib-devel \
ocaml-findlib-devel(aarch-64) \
ocamlfind(findlib) \
ocamlfind(findlib.dynload) \
ocamlfind(findlib.internal) \
ocamlfind(findlib.top) \
ocamlx(Findlib) \
ocamlx(Findlib_config) \
ocamlx(Fl_args) \
ocamlx(Fl_dynload) \
ocamlx(Fl_lint) \
ocamlx(Fl_meta) \
ocamlx(Fl_metascanner) \
ocamlx(Fl_metatoken) \
ocamlx(Fl_package_base) \
ocamlx(Fl_split) \
ocamlx(Fl_topo) \
ocamlx(Topfind)"

RDEPENDS:${PN} += "ocaml(Asttypes) \
ocaml(Build_path_prefix_map) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(Cmi_format) \
ocaml(Dynlink) \
ocaml(Env) \
ocaml(Ident) \
ocaml(Identifiable) \
ocaml(Load_path) \
ocaml(Location) \
ocaml(Longident) \
ocaml(Misc) \
ocaml(Outcometree) \
ocaml(Parsetree) \
ocaml(Path) \
ocaml(Primitive) \
ocaml(Shape) \
ocaml(Stdlib) \
ocaml(Stdlib__Arg) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Filename) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Subst) \
ocaml(Topdirs) \
ocaml(Toploop) \
ocaml(Type_immediacy) \
ocaml(Types) \
ocaml(Warnings) \
ocaml-findlib \
ocamlfind(dynlink) \
ocamlx(Dynlink) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Lexing) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
ocamlx(Topdirs) \
ocamlx(Toploop)"

inherit rpm
