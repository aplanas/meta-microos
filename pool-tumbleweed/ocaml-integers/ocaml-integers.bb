SUMMARY = "Various signed and unsigned integer types for OCaml"
DESCRIPTION = "The ocaml-integers library provides a number of 8-, 16-, 32- and 64-bit \
signed and unsigned integer types, together with aliases such as long \
and size_t whose sizes depend on the host platform."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "ocaml-integers-0.7.0-1.12.aarch64.rpm"
RPM_HASH = "cf7a9bf9cce60387ca4a2310c0284ea4aa2d29419ff0f83fc296946a597c6a0a6bd3316ed12808a7f928c55019f98b2b0d3692e0f3e77d3cfc6ab7bbb45320ef"

RPROVIDES:${PN} += "ocaml-integers"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
