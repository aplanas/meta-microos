SUMMARY = "OCaml Compiler and Programming Environment"
DESCRIPTION = "OCaml is a high-level, strongly-typed, functional and object-oriented \
programming language from the ML family of languages. \
 \
This package comprises two batch compilers (a fast bytecode compiler \
and an optimizing native-code compiler), an interactive top level \
system, Lex&Yacc tools, a replay debugger, and a comprehensive library."
LICENSE = "QPL-1.0 & SUSE-LGPL-2.0-with-linking-exception"

PV = "4.14.1"

RPM_NAME = "ocaml-4.14.1-1.3.aarch64.rpm"
RPM_HASH = "09977dcc0e3fca8665503ffb20755fad46ebdd090d040adb1cb477420c11c715ea19a18f4d70221e1596f0f420c64f7d36b2f0449c090519f33db1b7b8f1afc2"

RPROVIDES:${PN} += "libasmrun_shared.so()(64bit) \
libcamlrun_shared.so()(64bit) \
ocaml \
ocaml(Bigarray) \
ocaml(CamlinternalAtomic) \
ocaml(CamlinternalFormat) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(CamlinternalMod) \
ocaml(CamlinternalOO) \
ocaml(Condition) \
ocaml(Dynlink) \
ocaml(Dynlink_common) \
ocaml(Dynlink_compilerlibs) \
ocaml(Dynlink_platform_intf) \
ocaml(Dynlink_types) \
ocaml(Event) \
ocaml(Mutex) \
ocaml(Profiling) \
ocaml(Semaphore) \
ocaml(Std_exit) \
ocaml(Stdlib) \
ocaml(Stdlib__Arg) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__ArrayLabels) \
ocaml(Stdlib__Atomic) \
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Bool) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__BytesLabels) \
ocaml(Stdlib__Callback) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Complex) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Ephemeron) \
ocaml(Stdlib__Filename) \
ocaml(Stdlib__Float) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Fun) \
ocaml(Stdlib__Gc) \
ocaml(Stdlib__Genlex) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__In_channel) \
ocaml(Stdlib__Int) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Int64) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__ListLabels) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Marshal) \
ocaml(Stdlib__MoreLabels) \
ocaml(Stdlib__Nativeint) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Oo) \
ocaml(Stdlib__Option) \
ocaml(Stdlib__Out_channel) \
ocaml(Stdlib__Parsing) \
ocaml(Stdlib__Pervasives) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Queue) \
ocaml(Stdlib__Random) \
ocaml(Stdlib__Result) \
ocaml(Stdlib__Scanf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__Stack) \
ocaml(Stdlib__StdLabels) \
ocaml(Stdlib__Stream) \
ocaml(Stdlib__String) \
ocaml(Stdlib__StringLabels) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Stdlib__Unit) \
ocaml(Stdlib__Weak) \
ocaml(Str) \
ocaml(Thread) \
ocaml(ThreadUnix) \
ocaml(Unix) \
ocaml(UnixLabels) \
ocaml(aarch-64) \
ocaml(compiler) \
ocaml(ocaml.opt) \
ocaml(ocaml_base_version) \
ocaml-seq \
ocaml-seq-debuginfo \
ocaml-seq-devel \
ocamlfind(bigarray) \
ocamlfind(bytes) \
ocamlfind(dynlink) \
ocamlfind(raw_spacetime) \
ocamlfind(seq) \
ocamlfind(stdlib) \
ocamlfind(str) \
ocamlfind(threads) \
ocamlfind(threads.none) \
ocamlfind(threads.posix) \
ocamlfind(threads.vm) \
ocamlfind(uchar) \
ocamlfind(unix) \
ocamlx(Bigarray) \
ocamlx(CamlinternalAtomic) \
ocamlx(CamlinternalFormat) \
ocamlx(CamlinternalFormatBasics) \
ocamlx(CamlinternalLazy) \
ocamlx(CamlinternalMod) \
ocamlx(CamlinternalOO) \
ocamlx(Condition) \
ocamlx(Dynlink) \
ocamlx(Dynlink_common) \
ocamlx(Dynlink_compilerlibs) \
ocamlx(Dynlink_platform_intf) \
ocamlx(Dynlink_types) \
ocamlx(Event) \
ocamlx(Mutex) \
ocamlx(Profiling) \
ocamlx(Semaphore) \
ocamlx(Std_exit) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Arg) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__ArrayLabels) \
ocamlx(Stdlib__Atomic) \
ocamlx(Stdlib__Bigarray) \
ocamlx(Stdlib__Bool) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__BytesLabels) \
ocamlx(Stdlib__Callback) \
ocamlx(Stdlib__Char) \
ocamlx(Stdlib__Complex) \
ocamlx(Stdlib__Digest) \
ocamlx(Stdlib__Either) \
ocamlx(Stdlib__Ephemeron) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Float) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Fun) \
ocamlx(Stdlib__Gc) \
ocamlx(Stdlib__Genlex) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__In_channel) \
ocamlx(Stdlib__Int) \
ocamlx(Stdlib__Int32) \
ocamlx(Stdlib__Int64) \
ocamlx(Stdlib__Lazy) \
ocamlx(Stdlib__Lexing) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__ListLabels) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Marshal) \
ocamlx(Stdlib__MoreLabels) \
ocamlx(Stdlib__Nativeint) \
ocamlx(Stdlib__Obj) \
ocamlx(Stdlib__Oo) \
ocamlx(Stdlib__Option) \
ocamlx(Stdlib__Out_channel) \
ocamlx(Stdlib__Parsing) \
ocamlx(Stdlib__Pervasives) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Queue) \
ocamlx(Stdlib__Random) \
ocamlx(Stdlib__Result) \
ocamlx(Stdlib__Scanf) \
ocamlx(Stdlib__Seq) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__Stack) \
ocamlx(Stdlib__StdLabels) \
ocamlx(Stdlib__Stream) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__StringLabels) \
ocamlx(Stdlib__Sys) \
ocamlx(Stdlib__Uchar) \
ocamlx(Stdlib__Unit) \
ocamlx(Stdlib__Weak) \
ocamlx(Str) \
ocamlx(Thread) \
ocamlx(ThreadUnix) \
ocamlx(Unix) \
ocamlx(UnixLabels)"

RDEPENDS:${PN} += "/usr/bin/ocamlrun \
gcc13 \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
ncurses-devel \
ocaml(runtime)"

inherit rpm
