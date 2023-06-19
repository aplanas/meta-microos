SUMMARY = "Pure OCaml regular expressions"
DESCRIPTION = "Pure OCaml regular expressions, with support for Perl and POSIX-style strings."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "1.10.4"

RPM_NAME = "ocaml-re-1.10.4-1.5.aarch64.rpm"
RPM_HASH = "ae933b507eebf478603b9b96825eaab70a9ab741b068e3cd7ffe1fc4d7ebf39d3e0c79bdfcf9c0e1fad036f29e742b338e54d347798038b3c6133b43cfe38a84"

RPROVIDES:${PN} += "ocaml-re"

RDEPENDS:${PN} += ""

inherit rpm
