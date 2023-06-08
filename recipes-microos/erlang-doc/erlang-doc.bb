SUMMARY = "Erlang documentation"
DESCRIPTION = "Documentation for Erlang."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-doc-25.3-1.1.aarch64.rpm"
RPM_HASH = "23119708f3466bde6875a1315a8e404ef4ee0ed1e6c432fce50012e5df5dddc3bea4acd8c7d58f6dc6396d8626a0ab474103678202ef90a8b05327d58e07089f"

RPROVIDES:${PN} += "erlang-doc erlang-doc(aarch-64)"
RDEPENDS:${PN} += "erlang"

inherit rpm
