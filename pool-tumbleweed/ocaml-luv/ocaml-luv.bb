SUMMARY = "Binding to libuv cross-platform asynchronous I/O"
DESCRIPTION = "Luv is a binding to libuv, the cross-platform C library that does \
asynchronous I/O in Node.js and runs its main loop. \
 \
Besides asynchronous I/O, libuv also supports multiprocessing and \
multithreading. Multiple event loops can be run in different threads. libuv also \
exposes a lot of other functionality, amounting to a full OS API, and an \
alternative to the standard module Unix."
LICENSE = "MIT"

PV = "0.5.12"

RPM_NAME = "ocaml-luv-0.5.12-1.3.aarch64.rpm"
RPM_HASH = "28a3656e9a6d20b626d5a94364bd61feae8636824db9534062a82e40711a1f96d1cf46d7debc9bdb874e7f604caa00bb9d6fec44fb9f69f4bc73a82bceee8abb"

RPROVIDES:${PN} += "ocaml-luv"

RDEPENDS:${PN} += "libc.so.6 \
libuv.so.1"

inherit rpm
