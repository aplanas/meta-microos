SUMMARY = "Various signed and unsigned integer types for OCaml"
DESCRIPTION = "The ocaml-integers library provides a number of 8-, 16-, 32- and 64-bit \
signed and unsigned integer types, together with aliases such as long \
and size_t whose sizes depend on the host platform."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "ocaml-integers-0.7.0-1.11.aarch64.rpm"
RPM_HASH = "fc2038f7fd409e66372e2bf54e248b8717e7f37450516df908055f39b904873baefa2f97a789e7daf4cd9d7645ed2b0e57b09d64bcd6f06ec9dfb38bf260040c"

RPROVIDES:${PN} += "ocaml-integers \
ocaml-integers(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
