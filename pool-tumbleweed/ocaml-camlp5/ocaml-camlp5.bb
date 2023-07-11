SUMMARY = "Preprocessor-Pretty-Printer for Objective Caml"
DESCRIPTION = "Camlp5 is a preprocessor-pretty-printer of OCaml, parsing a source file and printing some result on standard output."
LICENSE = "BSD-3-Clause"

PV = "8.01.00"

RPM_NAME = "ocaml-camlp5-8.01.00-1.2.aarch64.rpm"
RPM_HASH = "f3227e26f15d0986f84738bfb1507a3f790fe4317d341a734eb4f4aefe1a5e8e12d1f14983584223609684ba1a75476b92aea61ae462707d04e95a1364de0fa8"

RPROVIDES:${PN} += "ocaml-camlp5"

RDEPENDS:${PN} += "/usr/bin/ocamlrun \
libc.so.6 \
libm.so.6 \
libpcre.so.1"

inherit rpm
