SUMMARY = "Declarative definition of command line interfaces for OCaml"
DESCRIPTION = "Cmdliner is a module for the declarative definition of command line interfaces. \
 \
It provides a simple and compositional mechanism to convert command line \
arguments to OCaml values and pass them to your functions. The module \
automatically handles syntax errors, help messages and UNIX man page \
generation. It supports programs with single or multiple commands and respects \
most of the POSIX and GNU conventions."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "ocaml-cmdliner-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "76f36995e99792bca0599b123bb87be69807acf70d5b72df483c2c0b756dcd3f10f74efd4d622930a920da90d3d24553ef0854aba2219d4f36698730af07a926"

RPROVIDES:${PN} += "ocaml-cmdliner"

RDEPENDS:${PN} += ""

inherit rpm
