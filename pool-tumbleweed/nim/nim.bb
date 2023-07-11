SUMMARY = "A statically typed compiled systems programming language"
DESCRIPTION = "Nim is a statically typed compiled systems programming language. It \
combines successful concepts from mature languages like Python, Ada \
and Modula. \
 \
Efficient: \
* Nim generates native dependency-free executables, not dependent on \
  a virtual machine, which are small and allow easy redistribution. \
* The Nim compiler and the generated executables support all major \
  platforms like Windows, Linux, BSD and macOS. \
* Nim's memory management is deterministic and customizable with \
  destructors and move semantics, inspired by C++ and Rust. It is \
  well-suited for embedded, hard-realtime systems. \
* Modern concepts like zero-overhead iterators and compile-time \
  evaluation of user-defined functions, in combination with the \
  preference of value-based datatypes allocated on the stack, lead \
  to extremely performant code. \
* Support for various backends: it compiles to C, C++ or JavaScript \
  so that Nim can be used for all backend and frontend needs. \
 \
Expressive: \
* Nim is self-contained: the compiler and the standard library are \
  implemented in Nim. \
* Nim has a powerful macro system which allows direct manipulation \
  of the AST, offering nearly unlimited opportunities. \
 \
Elegant: \
* Macros cannot change Nim's syntax because there is no need for it \
  — the syntax is flexible enough. \
* Modern type system with local type inference, tuples, generics and \
  sum types. \
* Statements are grouped by indentation but can span multiple lines."
LICENSE = "MIT"

PV = "1.6.14"

RPM_NAME = "nim-1.6.14-1.1.aarch64.rpm"
RPM_HASH = "9e6f834f5ce51df5c56bea38e9ff787369328769f542797a3e60de768a290f3cd5b77955e9d4135c3186ccafad106cee7f41aca28523b8d2e050541c1cf88339"

RPROVIDES:${PN} += "config-nim \
nim"

RDEPENDS:${PN} += "/usr/bin/bash \
gcc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
