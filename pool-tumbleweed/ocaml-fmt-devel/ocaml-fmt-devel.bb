SUMMARY = "Development files for ocaml-fmt"
DESCRIPTION = "The ocaml-fmt-devel package contains libraries and signature files for \
developing applications that use ocaml-fmt."
LICENSE = "ISC"

PV = "0.9.0"

RPM_NAME = "ocaml-fmt-devel-0.9.0-1.11.aarch64.rpm"
RPM_HASH = "6604c4a79c39bdd906f4cecd3649d19fc8fc9be266b3e98f285c3940abbb6d8e7936f1bf3e50f6d8d3606ca04fcc02a85164a4c9839e253f82426d68629ee50a"

RPROVIDES:${PN} += "ocaml(Fmt) \
ocaml(Fmt_cli) \
ocaml(Fmt_top) \
ocaml(Fmt_tty) \
ocaml-fmt-devel \
ocaml-fmt-devel(aarch-64) \
ocamlfind(fmt) \
ocamlfind(fmt.cli) \
ocamlfind(fmt.top) \
ocamlfind(fmt.tty) \
ocamlx(Fmt) \
ocamlx(Fmt_cli) \
ocamlx(Fmt_top) \
ocamlx(Fmt_tty)"

RDEPENDS:${PN} += "ocaml(Asttypes) \
ocaml(Build_path_prefix_map) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(Cmdliner) \
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
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Complex) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Fun) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Int64) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Option) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Queue) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__Stack) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Subst) \
ocaml(Toploop) \
ocaml(Type_immediacy) \
ocaml(Types) \
ocaml(Unix) \
ocaml(Warnings) \
ocaml-fmt \
ocamlfind(cmdliner) \
ocamlfind(compiler-libs.toplevel) \
ocamlfind(result) \
ocamlfind(unix) \
ocamlx(Cmdliner) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Fun) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Int) \
ocamlx(Stdlib__Int64) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Option) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__Queue) \
ocamlx(Stdlib__Seq) \
ocamlx(Stdlib__Stack) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
ocamlx(Stdlib__Uchar) \
ocamlx(Toploop) \
ocamlx(Unix)"

inherit rpm
