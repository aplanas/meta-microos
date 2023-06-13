SUMMARY = "Development files for ocaml-astring"
DESCRIPTION = "The ocaml-astring-devel package contains libraries and signature files for \
developing applications that use ocaml-astring."
LICENSE = "ISC"

PV = "0.8.5"

RPM_NAME = "ocaml-astring-devel-0.8.5-1.15.aarch64.rpm"
RPM_HASH = "67ce9b7a012279024ea320907f364c5b1e68017187f710933ba3c97c0843d99c286567d9f72567df0196d1dfed72b1dac1c7900c9676e49424b1e05bd1f04e5d"

RPROVIDES:${PN} += "ocaml(Astring) \
ocaml(Astring_base) \
ocaml(Astring_char) \
ocaml(Astring_escape) \
ocaml(Astring_string) \
ocaml(Astring_sub) \
ocaml(Astring_top) \
ocaml(Astring_unsafe) \
ocaml-astring-devel \
ocaml-astring-devel(aarch-64) \
ocamlfind(astring) \
ocamlfind(astring.top) \
ocamlx(Astring) \
ocamlx(Astring_base) \
ocamlx(Astring_char) \
ocamlx(Astring_escape) \
ocamlx(Astring_string) \
ocamlx(Astring_sub) \
ocamlx(Astring_top) \
ocamlx(Astring_unsafe)"

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
ocaml(Stdlib__Array) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Int64) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Nativeint) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Subst) \
ocaml(Toploop) \
ocaml(Type_immediacy) \
ocaml(Types) \
ocaml(Warnings) \
ocaml-astring \
ocamlfind(compiler-libs.toplevel) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Int32) \
ocamlx(Stdlib__Int64) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Nativeint) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
ocamlx(Toploop)"

inherit rpm
