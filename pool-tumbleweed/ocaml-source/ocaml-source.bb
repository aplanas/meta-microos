SUMMARY = "Source code for OCaml libraries"
DESCRIPTION = "OCaml is a high-level, strongly-typed, functional and object-oriented \
programming language from the ML family of languages. \
 \
This package contains source code for OCaml libraries."
LICENSE = "QPL-1.0 & SUSE-LGPL-2.0-with-linking-exception"

PV = "4.14.1"

RPM_NAME = "ocaml-source-4.14.1-1.3.aarch64.rpm"
RPM_HASH = "d9a6caa714fcd0fa2539366e9b3016546caddab94214cc0a98a5fee2ef1c138420c498c8370e3599b2e5899bf13fc57810c1e600557b43ad090114299e668491"

RPROVIDES:${PN} += "ocaml-source \
ocaml-source(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
