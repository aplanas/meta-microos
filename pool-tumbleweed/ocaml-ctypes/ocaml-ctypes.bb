SUMMARY = "Combinators for binding to C libraries without writing any C"
DESCRIPTION = "ctypes is a library for binding to C libraries using pure OCaml. The primary aim is to make writing C extensions as straightforward as possible. \
 \
The core of ctypes is a set of combinators for describing the structure of C types -- numeric types, arrays, pointers, structs, unions and functions. You can use these combinators to describe the types of the functions that you want to call, then bind directly to those functions -- all without writing or generating any C!"
LICENSE = "ISC"

PV = "0.20.1"

RPM_NAME = "ocaml-ctypes-0.20.1-2.1.aarch64.rpm"
RPM_HASH = "ad5cf577d558ca9860f05b31febe1ecfd0129e6d63289ff8606c10ca6a7cb6b21eb26d2b31589ac832f86141090d2400248ff40707babd29f87fd741d022fa74"

RPROVIDES:${PN} += "ocaml-ctypes \
ocaml-ctypes(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit)"

inherit rpm
