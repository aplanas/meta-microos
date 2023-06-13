SUMMARY = "Development files for ocaml-rresult"
DESCRIPTION = "The ocaml-rresult-devel package contains libraries and signature files for \
developing applications that use ocaml-rresult."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "ocaml-rresult-devel-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "caac80b7cd6cbe0a88ebbfa12a7d6620614df83f5e2cd60cea7eb46e381757f6d3e9a1744da76dfc6961bb5d1eaf6260d289bb2597c425bfa7071da63638c5ee"

RPROVIDES:${PN} += "ocaml(Rresult) \
ocaml(Rresult_top) \
ocaml-rresult-devel \
ocaml-rresult-devel(aarch-64) \
ocamlfind(rresult) \
ocamlfind(rresult.top) \
ocamlx(Rresult) \
ocamlx(Rresult_top)"

RDEPENDS:${PN} += "ocaml(Asttypes) \
ocaml(Build_path_prefix_map) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(Cmi_format) \
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
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Uchar) \
ocaml(Subst) \
ocaml(Toploop) \
ocaml(Type_immediacy) \
ocaml(Types) \
ocaml(Warnings) \
ocaml-rresult \
ocamlfind(compiler-libs.toplevel) \
ocamlfind(result) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__String) \
ocamlx(Toploop)"

inherit rpm
