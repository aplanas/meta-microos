SUMMARY = "Declarative definition of command line interfaces for OCaml"
DESCRIPTION = "Cmdliner is a module for the declarative definition of command line interfaces. \
 \
It provides a simple and compositional mechanism to convert command line \
arguments to OCaml values and pass them to your functions. The module \
automatically handles syntax errors, help messages and UNIX man page \
generation. It supports programs with single or multiple commands and respects \
most of the POSIX and GNU conventions."
LICENSE = "ISC"

PV = "1.1.1"

RPM_NAME = "ocaml-cmdliner-1.1.1-1.10.aarch64.rpm"
RPM_HASH = "ea90d516436eb9f4857d9a565e9f3760a83866738e69451247c0bcf9efe46fb3d4d020cc5363ad910ef51fb136cb16581d8904669ec211cc7750d1bb9f7cc879"

RPROVIDES:${PN} += "ocaml-cmdliner"

RDEPENDS:${PN} += ""

inherit rpm
