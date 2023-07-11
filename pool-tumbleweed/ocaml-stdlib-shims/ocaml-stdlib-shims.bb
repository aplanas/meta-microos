SUMMARY = "Shim to substitute Pervasives with Stdlib before 4.08"
DESCRIPTION = "Compiling against this library allows replacing uses of Pervasives \
with Stdlib before 4.08. For example, one can use Stdlib.compare \
instead of Pervasives.compare. It does not, however, provide \
the new functions and modules that were added in the Stdlib module."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "0.3.0"

RPM_NAME = "ocaml-stdlib-shims-0.3.0-1.12.aarch64.rpm"
RPM_HASH = "65ff173b6776bb8af6aebc4549e115fcad58cfdbd1267a7108d2a37b8d15dcaba7ef3e96f6fac8acf8095f4d56e4f2cf7632888d1bce51890c5871c1bfbaa414"

RPROVIDES:${PN} += "ocaml-stdlib-shims"

RDEPENDS:${PN} += ""

inherit rpm
