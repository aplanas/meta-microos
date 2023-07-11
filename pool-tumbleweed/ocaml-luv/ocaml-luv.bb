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

RPM_NAME = "ocaml-luv-0.5.12-1.2.aarch64.rpm"
RPM_HASH = "6f7dc0c99dc6028f958d5aca0a6b08540b148ef7ba5f0105bd11e7088fc79af7e48e9828ffc4e846e40fba30876237b1730bfacfc7c34a3be8e98136a33d6792"

RPROVIDES:${PN} += "ocaml-luv"

RDEPENDS:${PN} += "libc.so.6 \
libuv.so.1"

inherit rpm
