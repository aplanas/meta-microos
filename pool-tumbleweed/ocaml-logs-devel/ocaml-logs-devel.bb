SUMMARY = "Development files for ocaml-logs"
DESCRIPTION = "The ocaml-logs-devel package contains libraries and signature files for \
developing applications that use ocaml-logs."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "ocaml-logs-devel-0.7.0-3.4.aarch64.rpm"
RPM_HASH = "8a5e03152a1d1ff3cb6907bedf956cf1dcf54a32a3d4d72d1b71f363d039fb1b212b11a5634b2dd0f0d1fed2857538a32eb81036eb9b89484a53a35862e75b83"

RPROVIDES:${PN} += "ocaml(Logs) \
ocaml(Logs_cli) \
ocaml(Logs_fmt) \
ocaml(Logs_threaded) \
ocaml(Logs_top) \
ocaml-logs-devel \
ocaml-logs-devel(aarch-64) \
ocamlfind(logs) \
ocamlfind(logs.cli) \
ocamlfind(logs.fmt) \
ocamlfind(logs.threaded) \
ocamlfind(logs.top) \
ocamlx(Logs) \
ocamlx(Logs_cli) \
ocamlx(Logs_fmt) \
ocamlx(Logs_threaded) \
ocamlx(Logs_top)"

RDEPENDS:${PN} += "ocaml(Asttypes) \
ocaml(Build_path_prefix_map) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(Cmdliner) \
ocaml(Cmi_format) \
ocaml(Env) \
ocaml(Fmt) \
ocaml(Ident) \
ocaml(Identifiable) \
ocaml(Load_path) \
ocaml(Location) \
ocaml(Longident) \
ocaml(Misc) \
ocaml(Mutex) \
ocaml(Outcometree) \
ocaml(Parsetree) \
ocaml(Path) \
ocaml(Primitive) \
ocaml(Shape) \
ocaml(Stdlib) \
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
ocaml(Warnings) \
ocaml-logs \
ocamlfind(cmdliner) \
ocamlfind(compiler-libs.toplevel) \
ocamlfind(fmt) \
ocamlfind(result) \
ocamlfind(threads) \
ocamlx(Cmdliner) \
ocamlx(Fmt) \
ocamlx(Mutex) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
ocamlx(Toploop)"

inherit rpm
