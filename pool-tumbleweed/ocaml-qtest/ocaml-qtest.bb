SUMMARY = "Inline (Unit) Tests for OCaml"
DESCRIPTION = "qtest extracts inline unit tests written using a special syntax in \
comments. Those tests are then run using the oUnit framework and the \
qcheck library. The possibilities range from trivial tests \
to sophisticated random generation of test cases."
LICENSE = "GPL-3.0-or-later"

PV = "2.11.2"

RPM_NAME = "ocaml-qtest-2.11.2-2.2.aarch64.rpm"
RPM_HASH = "d1f01a5e6fb3772673f4724e06e1909125b22ca5b0a117b23ed6816234f86c3b91a4b5bdcb3ab0c83fa234de61f35a5577f9487963a2bd4d01de66127eabc0ec"

RPROVIDES:${PN} += "ocaml-qtest"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
