SUMMARY = "Unicode library for OCaml"
DESCRIPTION = "Camomile is a Unicode library for ocaml. Camomile provides Unicode \
character type, UTF-8, UTF-16, UTF-32 strings, conversion to/from \
about 200 encodings, collation and locale-sensitive case mappings, and \
more."
LICENSE = "LGPL-2.0+"

PV = "1.0.2"

RPM_NAME = "ocaml-camomile-1.0.2-3.25.aarch64.rpm"
RPM_HASH = "f25ae8ec05f5236cb1aa799a1763af2eeea1e4b449c861382eeca217d478542fb100beb188384312e4e8c91157feade763379fe08a904c1b646f39bf79d4b808"

RPROVIDES:${PN} += "ocaml-camomile \
ocaml-camomile(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
