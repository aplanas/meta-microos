SUMMARY = "Standalone tool for opam install files"
DESCRIPTION = "Handles (un)installation of package files following instructions from \
OPAM *.install files."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "2.1.5"

RPM_NAME = "opam-installer-2.1.5-1.2.aarch64.rpm"
RPM_HASH = "015895424feb4eb6c45a74f09ef906c79955178214fd53fb9861105f95a490acc8ee04fd4ecb6a533fb73f750ea2f6a18313d3c1939eb584169b37bbe99432fb"

RPROVIDES:${PN} += "opam-installer"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
opam"

inherit rpm
