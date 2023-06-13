SUMMARY = "Preprocessor-Pretty-Printer for Objective Caml"
DESCRIPTION = "Camlp5 is a preprocessor-pretty-printer of OCaml, parsing a source file and printing some result on standard output."
LICENSE = "BSD-3-Clause"

PV = "8.01.00"

RPM_NAME = "ocaml-camlp5-8.01.00-1.1.aarch64.rpm"
RPM_HASH = "86fef334c8eb655efa8aea16ef8c2307effb8edee7fb14bdacac1bbefa5999599a2cf2025e8a1c209e154c940d3adf92e82d7675cbc30eeb98c2ea2674e6a7fb"

RPROVIDES:${PN} += "ocaml-camlp5 \
ocaml-camlp5(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/ocamlrun \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libpcre.so.1()(64bit)"

inherit rpm
