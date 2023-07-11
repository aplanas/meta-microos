SUMMARY = "Parser and printer for the opam file syntax"
DESCRIPTION = "This is a parser and a printer for the opam file syntax."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "2.1.6"

RPM_NAME = "opam-file-format-2.1.6-1.2.aarch64.rpm"
RPM_HASH = "3aee7f7ce921834aeacd2432f8e7a7f399d298e0e85236900f9ad34082f11047ff2e508fc5dbabdcc0fc3bfd0ded86af55498b5a68bf1a66b79ac47d79654ec7"

RPROVIDES:${PN} += "opam-file-format"

RDEPENDS:${PN} += ""

inherit rpm
