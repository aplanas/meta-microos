SUMMARY = "OCAML bindings for libhivex"
DESCRIPTION = "This subpackage contains the OCAML bindings for hivex. \
Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "ocaml-hivex-1.3.23-2.6.aarch64.rpm"
RPM_HASH = "8e5649ed81535c485642dadedb4c438ddf9616ec1ef318c7195944eac75d793af2a0f3ee173b14db6e3c03bc318bf33f033d1be981a8f9c5221d71fcd50ba08c"

RPROVIDES:${PN} += "ocaml-hivex"

RDEPENDS:${PN} += ""

inherit rpm
