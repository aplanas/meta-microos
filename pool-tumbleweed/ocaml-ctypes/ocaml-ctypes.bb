SUMMARY = "Combinators for binding to C libraries without writing any C"
DESCRIPTION = "ctypes is a library for binding to C libraries using pure OCaml. The primary aim is to make writing C extensions as straightforward as possible. \
 \
The core of ctypes is a set of combinators for describing the structure of C types -- numeric types, arrays, pointers, structs, unions and functions. You can use these combinators to describe the types of the functions that you want to call, then bind directly to those functions -- all without writing or generating any C!"
LICENSE = "ISC"

PV = "0.21.0"

RPM_NAME = "ocaml-ctypes-0.21.0-1.1.aarch64.rpm"
RPM_HASH = "e15e9c4e54382009d6d5410c4fd07efb56db51923454d4e7b83cfa97223568177c949c72f13271dd284fc08ba881e9ad30053c923f43de93827fbdc0af3b5235"

RPROVIDES:${PN} += "ocaml-ctypes"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8"

inherit rpm
