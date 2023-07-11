SUMMARY = "Type-driven code generation"
DESCRIPTION = "ppx_deriving provides common infrastructure for generating \
code based on type definitions, and a set of useful plugins \
for common tasks."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "ocaml-ppx_deriving-5.2.1-2.2.aarch64.rpm"
RPM_HASH = "7b56a64803311e4e180cd7c65e249d6f3f25b15e148b887bb1990df87f7b8f0fa25b4cdba555f140469ee4e71c7662880bce73edd5210dc6cf00beebd81a2219"

RPROVIDES:${PN} += "ocaml-ppx-deriving"

RDEPENDS:${PN} += ""

inherit rpm
