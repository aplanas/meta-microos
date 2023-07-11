SUMMARY = "Objective CAML package manager and build helper"
DESCRIPTION = "Findlib is a library manager for Objective Caml. It provides a \
convention how to store libraries, and a file format ('META') to \
describe the properties of libraries. There is also a tool (ocamlfind) \
for interpreting the META files, so that it is very easy to use \
libraries in programs and scripts."
LICENSE = "MIT"

PV = "1.9.5"

RPM_NAME = "ocaml-findlib-1.9.5-1.6.aarch64.rpm"
RPM_HASH = "84a4985a02a1a32ad5ba025c6c85b413cdd96cf47eea680db441e13229cdeedc15a775789185fc95bad4e4b4d102b3a784103347589e698b8114c1f475c6b1d1"

RPROVIDES:${PN} += "ocaml-findlib \
ocamlfind"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
ocaml-compiler-libs \
ocaml-runtime"

inherit rpm
