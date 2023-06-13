SUMMARY = "Development files for ocaml-integers"
DESCRIPTION = "The ocaml-integers-devel package contains libraries and signature files for \
developing applications that use ocaml-integers."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "ocaml-integers-devel-0.7.0-1.11.aarch64.rpm"
RPM_HASH = "d49ae0e0b8c858b6acf25159a4900d9f0a40a829ddf3ac9aa78ceec33d00d15002e4d1d7f15a3eef6388a93b1820ee020039445eb5c4782255dc0637e40e4a65"

RPROVIDES:${PN} += "ocaml(Install_integer_printers) \
ocaml(Integer_printers) \
ocaml(Signed) \
ocaml(Unsigned) \
ocaml-integers-devel \
ocaml-integers-devel(aarch-64) \
ocamlfind(integers) \
ocamlfind(integers.top) \
ocamlx(Signed) \
ocamlx(Unsigned)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
ocaml(Asttypes) \
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
ocaml(Stdlib__Int64) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Nativeint) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Uchar) \
ocaml(Subst) \
ocaml(Toploop) \
ocaml(Type_immediacy) \
ocaml(Types) \
ocaml(Warnings) \
ocaml-integers \
ocamlfind(compiler-libs) \
ocamlfind(stdlib-shims) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Int32) \
ocamlx(Stdlib__Int64)"

inherit rpm
