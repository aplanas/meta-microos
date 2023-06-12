SUMMARY = "Development files for ocaml-luv"
DESCRIPTION = "The ocaml-luv-devel package contains libraries and signature files for \
developing applications that use ocaml-luv."
LICENSE = "MIT"

PV = "0.5.12"

RPM_NAME = "ocaml-luv-devel-0.5.12-1.1.aarch64.rpm"
RPM_HASH = "4864cac1f9c17fd1b5d26cfe2eb1aaad387c0b664ae3d01670caffb259807f19834d7c037d1074eddc6ad4f5c4d9a8cf21448610f92a74aff47e8bace1b14447"

RPROVIDES:${PN} += "ocaml(Luv) \
ocaml(Luv__) \
ocaml(Luv__Async) \
ocaml(Luv__Barrier) \
ocaml(Luv__Buffer) \
ocaml(Luv__C) \
ocaml(Luv__Check) \
ocaml(Luv__Compatibility) \
ocaml(Luv__Condition) \
ocaml(Luv__DLL) \
ocaml(Luv__DNS) \
ocaml(Luv__Env) \
ocaml(Luv__Error) \
ocaml(Luv__FS_event) \
ocaml(Luv__FS_poll) \
ocaml(Luv__File) \
ocaml(Luv__Handle) \
ocaml(Luv__Helpers) \
ocaml(Luv__Idle) \
ocaml(Luv__Loop) \
ocaml(Luv__Loop_watcher) \
ocaml(Luv__Metrics) \
ocaml(Luv__Mutex) \
ocaml(Luv__Network) \
ocaml(Luv__Once) \
ocaml(Luv__Os_fd) \
ocaml(Luv__Passwd) \
ocaml(Luv__Path) \
ocaml(Luv__Pid) \
ocaml(Luv__Pipe) \
ocaml(Luv__Poll) \
ocaml(Luv__Prepare) \
ocaml(Luv__Process) \
ocaml(Luv__Random) \
ocaml(Luv__Request) \
ocaml(Luv__Require) \
ocaml(Luv__Resource) \
ocaml(Luv__Rwlock) \
ocaml(Luv__Semaphore) \
ocaml(Luv__Signal) \
ocaml(Luv__Sockaddr) \
ocaml(Luv__Stream) \
ocaml(Luv__System_info) \
ocaml(Luv__TCP) \
ocaml(Luv__TLS) \
ocaml(Luv__TTY) \
ocaml(Luv__Thread) \
ocaml(Luv__Thread_pool) \
ocaml(Luv__Time) \
ocaml(Luv__Timer) \
ocaml(Luv__UDP) \
ocaml(Luv__Version) \
ocaml(Luv_c_function_descriptions) \
ocaml(Luv_c_generated_functions) \
ocaml(Luv_c_generated_types) \
ocaml(Luv_c_type_descriptions) \
ocaml(Luv_c_types) \
ocaml(Luv_unix) \
ocaml-luv-devel \
ocaml-luv-devel(aarch-64) \
ocamlfind(luv) \
ocamlfind(luv.c) \
ocamlfind(luv.c_function_descriptions) \
ocamlfind(luv.c_type_descriptions) \
ocamlfind(luv_unix) \
ocamlx(Luv) \
ocamlx(Luv__) \
ocamlx(Luv__Async) \
ocamlx(Luv__Barrier) \
ocamlx(Luv__Buffer) \
ocamlx(Luv__C) \
ocamlx(Luv__Check) \
ocamlx(Luv__Compatibility) \
ocamlx(Luv__Condition) \
ocamlx(Luv__DLL) \
ocamlx(Luv__DNS) \
ocamlx(Luv__Env) \
ocamlx(Luv__Error) \
ocamlx(Luv__FS_event) \
ocamlx(Luv__FS_poll) \
ocamlx(Luv__File) \
ocamlx(Luv__Handle) \
ocamlx(Luv__Helpers) \
ocamlx(Luv__Idle) \
ocamlx(Luv__Loop) \
ocamlx(Luv__Loop_watcher) \
ocamlx(Luv__Metrics) \
ocamlx(Luv__Mutex) \
ocamlx(Luv__Network) \
ocamlx(Luv__Once) \
ocamlx(Luv__Os_fd) \
ocamlx(Luv__Passwd) \
ocamlx(Luv__Path) \
ocamlx(Luv__Pid) \
ocamlx(Luv__Pipe) \
ocamlx(Luv__Poll) \
ocamlx(Luv__Prepare) \
ocamlx(Luv__Process) \
ocamlx(Luv__Random) \
ocamlx(Luv__Request) \
ocamlx(Luv__Require) \
ocamlx(Luv__Resource) \
ocamlx(Luv__Rwlock) \
ocamlx(Luv__Semaphore) \
ocamlx(Luv__Signal) \
ocamlx(Luv__Sockaddr) \
ocamlx(Luv__Stream) \
ocamlx(Luv__System_info) \
ocamlx(Luv__TCP) \
ocamlx(Luv__TLS) \
ocamlx(Luv__TTY) \
ocamlx(Luv__Thread) \
ocamlx(Luv__Thread_pool) \
ocamlx(Luv__Time) \
ocamlx(Luv__Timer) \
ocamlx(Luv__UDP) \
ocamlx(Luv__Version) \
ocamlx(Luv_c_function_descriptions) \
ocamlx(Luv_c_generated_functions) \
ocamlx(Luv_c_generated_types) \
ocamlx(Luv_c_type_descriptions) \
ocamlx(Luv_c_types) \
ocamlx(Luv_unix)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libuv.so.1()(64bit) \
ocaml(Bigarray_compat) \
ocaml(CamlinternalFormatBasics) \
ocaml(ComplexL) \
ocaml(Cstubs_internals) \
ocaml(Ctypes) \
ocaml(Ctypes_bigarray) \
ocaml(Ctypes_memory_stubs) \
ocaml(Ctypes_primitive_types) \
ocaml(Ctypes_ptr) \
ocaml(Ctypes_static) \
ocaml(Ctypes_types) \
ocaml(LDouble) \
ocaml(PosixTypes) \
ocaml(Signed) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Complex) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Nativeint) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Unix) \
ocaml(Unsigned) \
ocaml-luv \
ocamlfind(ctypes) \
ocamlfind(threads) \
ocamlfind(unix) \
ocamlx(Cstubs_internals) \
ocamlx(Ctypes) \
ocamlx(Ctypes_static) \
ocamlx(PosixTypes) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Bigarray) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Nativeint) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
ocamlx(Unsigned) \
pkgconfig(libuv)"

inherit rpm