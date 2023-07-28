SUMMARY = "Standalone tool for opam install files"
DESCRIPTION = "Handles (un)installation of package files following instructions from \
OPAM *.install files."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "2.1.5"

RPM_NAME = "opam-installer-2.1.5-1.3.aarch64.rpm"
RPM_HASH = "a4d6c6053dacb6f7888fdd127f326e205ee1e441943fe0dc4013699b4698eaf55d9213879e13619597a8093d378db094606a7977ec82bd4a26f379af4c260ee3"

RPROVIDES:${PN} += "opam-installer"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
opam"

inherit rpm
