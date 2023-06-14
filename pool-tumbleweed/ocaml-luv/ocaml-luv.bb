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

RPM_NAME = "ocaml-luv-0.5.12-1.1.aarch64.rpm"
RPM_HASH = "0f00348d1fca51407b20daef31df3d44c8ef256f87b7900a85bb1ae09da4c08a1e614a2a6dc38400e68802e0473a882209d33097deaa82238bdb668d99059cc9"

RPROVIDES:${PN} += "ocaml-luv"

RDEPENDS:${PN} += "libc.so.6 \
libuv.so.1"

inherit rpm
