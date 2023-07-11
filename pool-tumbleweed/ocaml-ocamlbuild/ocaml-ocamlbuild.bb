SUMMARY = "Generic build tool for building OCaml library and programs"
DESCRIPTION = "OCamlbuild is a generic build tool, that has built-in rules for \
building OCaml library and programs. \
 \
OCamlbuild was distributed as part of the OCaml distribution for \
OCaml versions between 3.10.0 and 4.02.3. Starting from OCaml \
4.03, it is now released separately."
LICENSE = "LGPL-2.0-only-with-OCaml-LGPL-linking-exception"

PV = "0.14.2"

RPM_NAME = "ocaml-ocamlbuild-0.14.2-1.5.aarch64.rpm"
RPM_HASH = "40b90b43a709b898b44a2cf6ea9d9b983c5322c6d4472195a51052ee0f8e1644bfe829596ce60af755bcb3a0b97156d6ac96a13bdb1c62cbffc5b55900914550"

RPROVIDES:${PN} += "ocaml-ocamlbuild"

RDEPENDS:${PN} += "/usr/bin/ocamlrun \
libc.so.6 \
libm.so.6 \
ocaml-ocamlbuild-devel"

inherit rpm
