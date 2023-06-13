SUMMARY = "Development files for ocaml-bos"
DESCRIPTION = "The ocaml-bos-devel package contains libraries and signature files for \
developing applications that use ocaml-bos."
LICENSE = "ISC"

PV = "0.2.1"

RPM_NAME = "ocaml-bos-devel-0.2.1-1.1.aarch64.rpm"
RPM_HASH = "45001239e54d48702c1945c9df517d8266c4600213f0bc9d2f61c3981d265caf7dce49a766a84254bb7c8425be768e09277edf11a11ccb9d1be5ee125750c3a8"

RPROVIDES:${PN} += "ocaml(Bos) \
ocaml(Bos_base) \
ocaml(Bos_cmd) \
ocaml(Bos_log) \
ocaml(Bos_os_arg) \
ocaml(Bos_os_cmd) \
ocaml(Bos_os_dir) \
ocaml(Bos_os_env) \
ocaml(Bos_os_file) \
ocaml(Bos_os_path) \
ocaml(Bos_os_tmp) \
ocaml(Bos_os_u) \
ocaml(Bos_pat) \
ocaml(Bos_setup) \
ocaml(Bos_top) \
ocaml-bos-devel \
ocaml-bos-devel(aarch-64) \
ocamlfind(bos) \
ocamlfind(bos.setup) \
ocamlfind(bos.top) \
ocamlx(Bos) \
ocamlx(Bos_base) \
ocamlx(Bos_cmd) \
ocamlx(Bos_log) \
ocamlx(Bos_os_arg) \
ocamlx(Bos_os_cmd) \
ocamlx(Bos_os_dir) \
ocamlx(Bos_os_env) \
ocamlx(Bos_os_file) \
ocamlx(Bos_os_path) \
ocamlx(Bos_os_tmp) \
ocamlx(Bos_os_u) \
ocamlx(Bos_pat) \
ocamlx(Bos_setup) \
ocamlx(Bos_top)"

RDEPENDS:${PN} += "ocaml(Astring) \
ocaml(Asttypes) \
ocaml(Build_path_prefix_map) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(Cmi_format) \
ocaml(Env) \
ocaml(Fmt) \
ocaml(Fmt_tty) \
ocaml(Fpath) \
ocaml(Ident) \
ocaml(Identifiable) \
ocaml(Load_path) \
ocaml(Location) \
ocaml(Logs) \
ocaml(Logs_fmt) \
ocaml(Longident) \
ocaml(Misc) \
ocaml(Outcometree) \
ocaml(Parsetree) \
ocaml(Path) \
ocaml(Primitive) \
ocaml(Rresult) \
ocaml(Shape) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Complex) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Filename) \
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
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Queue) \
ocaml(Stdlib__Random) \
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
ocaml-bos \
ocamlfind(astring) \
ocamlfind(astring.top) \
ocamlfind(compiler-libs.toplevel) \
ocamlfind(fmt) \
ocamlfind(fmt.top) \
ocamlfind(fmt.tty) \
ocamlfind(fpath) \
ocamlfind(fpath.top) \
ocamlfind(logs) \
ocamlfind(logs.fmt) \
ocamlfind(logs.top) \
ocamlfind(rresult) \
ocamlfind(rresult.top) \
ocamlfind(unix) \
ocamlx(Astring) \
ocamlx(CamlinternalLazy) \
ocamlx(Fmt) \
ocamlx(Fmt_tty) \
ocamlx(Fpath) \
ocamlx(Logs) \
ocamlx(Logs_fmt) \
ocamlx(Rresult) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Random) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__Sys) \
ocamlx(Toploop) \
ocamlx(Unix)"

inherit rpm
