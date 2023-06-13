SUMMARY = "Development files for ocaml-pyml"
DESCRIPTION = "The ocaml-pyml-devel package contains libraries and signature files for \
developing applications that use ocaml-pyml."
LICENSE = "BSD-2-Clause"

PV = "20220905"

RPM_NAME = "ocaml-pyml-devel-20220905-1.4.aarch64.rpm"
RPM_HASH = "0f456bf82331eff24733d2b13488b01f6204e6f8661b3a0b178f829f72a2c26a0bd416f3bd132741a16e63f1d8b52b7b5fcbeab43a5a857f4f1657de40a194c1"

RPROVIDES:${PN} += "ocaml(Numpy) \
ocaml(Py) \
ocaml(Pycaml) \
ocaml(Pyml_arch) \
ocaml(Pyops) \
ocaml(Pytypes) \
ocaml(Pyutils) \
ocaml(Pywrappers) \
ocaml-pyml-devel \
ocaml-pyml-devel(aarch-64) \
ocamlfind(pyml) \
ocamlx(Numpy) \
ocamlx(Py) \
ocamlx(Pycaml) \
ocamlx(Pyml_arch) \
ocamlx(Pyops) \
ocamlx(Pytypes) \
ocamlx(Pyutils) \
ocamlx(Pywrappers)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(CamlinternalOO) \
ocaml(Stdcompat) \
ocaml(Stdcompat__arg_s) \
ocaml(Stdcompat__arrayLabels_s) \
ocaml(Stdcompat__array_s) \
ocaml(Stdcompat__atomic_s) \
ocaml(Stdcompat__bool_s) \
ocaml(Stdcompat__buffer_s) \
ocaml(Stdcompat__bytesLabels_s) \
ocaml(Stdcompat__bytes_s) \
ocaml(Stdcompat__char_s) \
ocaml(Stdcompat__digest_s) \
ocaml(Stdcompat__either_s) \
ocaml(Stdcompat__ephemeron_s) \
ocaml(Stdcompat__filename_s) \
ocaml(Stdcompat__float_s) \
ocaml(Stdcompat__format_s) \
ocaml(Stdcompat__fun_s) \
ocaml(Stdcompat__hashtbl) \
ocaml(Stdcompat__hashtbl_ext) \
ocaml(Stdcompat__hashtbl_s) \
ocaml(Stdcompat__in_channel_s) \
ocaml(Stdcompat__init) \
ocaml(Stdcompat__int32_s) \
ocaml(Stdcompat__int64_s) \
ocaml(Stdcompat__int_s) \
ocaml(Stdcompat__lazy_s) \
ocaml(Stdcompat__lexing_s) \
ocaml(Stdcompat__listLabels_s) \
ocaml(Stdcompat__list_s) \
ocaml(Stdcompat__map_s) \
ocaml(Stdcompat__nativeint_s) \
ocaml(Stdcompat__option_s) \
ocaml(Stdcompat__out_channel_s) \
ocaml(Stdcompat__pervasives_s) \
ocaml(Stdcompat__printexc_s) \
ocaml(Stdcompat__printf_s) \
ocaml(Stdcompat__queue_s) \
ocaml(Stdcompat__random_s) \
ocaml(Stdcompat__result_s) \
ocaml(Stdcompat__seq) \
ocaml(Stdcompat__seq_s) \
ocaml(Stdcompat__set_s) \
ocaml(Stdcompat__stack_s) \
ocaml(Stdcompat__stdlib_s) \
ocaml(Stdcompat__stringLabels_s) \
ocaml(Stdcompat__string_s) \
ocaml(Stdcompat__sys_s) \
ocaml(Stdcompat__uchar_s) \
ocaml(Stdcompat__unit_s) \
ocaml(Stdcompat__weak_s) \
ocaml(Stdlib) \
ocaml(Stdlib__Arg) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__ArrayLabels) \
ocaml(Stdlib__Atomic) \
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Callback) \
ocaml(Stdlib__Complex) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Float) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Gc) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__In_channel) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Int64) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Nativeint) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Oo) \
ocaml(Stdlib__Out_channel) \
ocaml(Stdlib__Parsing) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Queue) \
ocaml(Stdlib__Random) \
ocaml(Stdlib__Scanf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__Stack) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Stdlib__Weak) \
ocaml(Unix) \
ocaml-pyml \
ocamlfind(bigarray) \
ocamlfind(stdcompat) \
ocamlfind(unix) \
ocamlx(CamlinternalLazy) \
ocamlx(Stdcompat) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Bigarray) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__Printf) \
ocamlx(Unix) \
which"

inherit rpm
