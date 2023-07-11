SUMMARY = "OCaml ExtLib additions to the standard library"
DESCRIPTION = "ExtLib is a project aiming at providing a complete - yet small - \
standard library for the OCaml programming language. The purpose of \
this library is to add new functions to OCaml Standard Library \
modules, to modify some functions in order to get better performances \
or more safety (tail-recursive) but also to provide new modules which \
should be useful for the average OCaml programmer."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "1.7.9"

RPM_NAME = "ocaml-extlib-1.7.9-2.5.aarch64.rpm"
RPM_HASH = "974dfadb13237cc6e010e01531e27c26fe584c666f90d6d7871f2e0769d473a1f91b5f011389c1c67745eedf55ed84581f956a8aa83cd91ab0cbd311c4ba4ac0"

RPROVIDES:${PN} += "ocaml-extlib"

RDEPENDS:${PN} += ""

inherit rpm
