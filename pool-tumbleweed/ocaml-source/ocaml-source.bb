SUMMARY = "Source code for OCaml libraries"
DESCRIPTION = "OCaml is a high-level, strongly-typed, functional and object-oriented \
programming language from the ML family of languages. \
 \
This package contains source code for OCaml libraries."
LICENSE = "QPL-1.0 & SUSE-LGPL-2.0-with-linking-exception"

PV = "4.14.1"

RPM_NAME = "ocaml-source-4.14.1-1.4.aarch64.rpm"
RPM_HASH = "12aa91422d185d42b811d0eebc2f462cc666a5b2e76b4a4a3322dff45a78d42374919751fea958066dbcf3ec246ea7d94a7248e4b2acb43e9c7cba77c0d81b62"

RPROVIDES:${PN} += "ocaml-source"

RDEPENDS:${PN} += ""

inherit rpm
