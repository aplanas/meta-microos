SUMMARY = "Type-driven code generation"
DESCRIPTION = "ppx_deriving provides common infrastructure for generating \
code based on type definitions, and a set of useful plugins \
for common tasks."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "ocaml-ppx_deriving-5.2.1-2.3.aarch64.rpm"
RPM_HASH = "276f0a9da4d8992988e9dbfd7ca01a70d2b9ea6843b91c9f618e219f035b9fe35a2f084938151e7f86a07f6b51314f8baca6b8bb8547012f90a4e17d44f363d4"

RPROVIDES:${PN} += "ocaml-ppx-deriving"

RDEPENDS:${PN} += ""

inherit rpm
