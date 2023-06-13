SUMMARY = "OCaml ExtLib additions to the standard library"
DESCRIPTION = "ExtLib is a project aiming at providing a complete - yet small - \
standard library for the OCaml programming language. The purpose of \
this library is to add new functions to OCaml Standard Library \
modules, to modify some functions in order to get better performances \
or more safety (tail-recursive) but also to provide new modules which \
should be useful for the average OCaml programmer."
LICENSE = "LGPL-2.1-or-later-WITH-OCaml-LGPL-linking-exception"

PV = "1.7.9"

RPM_NAME = "ocaml-extlib-1.7.9-2.4.aarch64.rpm"
RPM_HASH = "67ff60c4822a0abb3883e412a21ba122b67350b1e8d536e0a75c86aa8f0642b75a809a4707c90d94f2ef18a73783e093e863dbb5a40c9aab1c2e8dae1cc86f05"

RPROVIDES:${PN} += "ocaml-extlib \
ocaml-extlib(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
