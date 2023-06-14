SUMMARY = "Objective CAML package manager and build helper"
DESCRIPTION = "Findlib is a library manager for Objective Caml. It provides a \
convention how to store libraries, and a file format ('META') to \
describe the properties of libraries. There is also a tool (ocamlfind) \
for interpreting the META files, so that it is very easy to use \
libraries in programs and scripts."
LICENSE = "MIT"

PV = "1.9.5"

RPM_NAME = "ocaml-findlib-1.9.5-1.5.aarch64.rpm"
RPM_HASH = "88169196dc3b6bc025c456ae5d37f9abc74faa0925e23d3e5395852c63155652b8361a05b536609fb5d9bc2b2b221a3ae949a2e80e6fb2e2356515ff850a5d28"

RPROVIDES:${PN} += "ocaml-findlib \
ocamlfind"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
ocaml-compiler-libs \
ocaml-runtime"

inherit rpm
