SUMMARY = "Ocaml Constraint Programming Library"
DESCRIPTION = "FaCiLe is a constraint programming library on integer and integer set \
finite domains written in OCaml. It offers all usual facilities to \
create and manipulate finite domain variables, arithmetic expressions \
and constraints (possibly non-linear), built-in global constraints \
(difference, cardinality, sorting etc.) and search and optimization \
goals. FaCiLe as well allows you to build easily user-defined \
constraints and goals (including recursive ones), making pervasive use \
of OCaml higher-order functionals to provide a simple and flexible \
interface for the user. As FaCiLe is an OCaml library and not 'yet \
another language', the user benefits from type inference and strong \
typing discipline, high level of abstraction, a modules and objects \
system, as well as native code compilation efficiency, garbage \
collection and replay debugger, all features of OCaml (among many \
others) that allow to prototype and experiment quickly: modeling, data \
processing and interface are implemented with the same powerful and \
efficient language."
LICENSE = "LGPL-2.1+"

PV = "1.1.4"

RPM_NAME = "ocaml-facile-1.1.4-2.12.aarch64.rpm"
RPM_HASH = "3146fb2aa1786808f3198a9a2e8014249f1cac83ec843912f6b473689ec4d2d51706fd76dc7b826a1b1007d835a2132966667c0e7c39112b63f6d4b0ac4ed05e"

RPROVIDES:${PN} += "ocaml-facile"

RDEPENDS:${PN} += ""

inherit rpm
