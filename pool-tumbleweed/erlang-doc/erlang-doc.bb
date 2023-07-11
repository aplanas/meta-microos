SUMMARY = "Erlang documentation"
DESCRIPTION = "Documentation for Erlang."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-doc-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "cf8ae427af98937f9f61209320d581dd01608f25657d7dbbe4b01d68ea8cfff43e80a2d4e0b63411127daada6f2f839d3f359376d9ea1457c30c4d979a4f10f7"

RPROVIDES:${PN} += "erlang-doc"

RDEPENDS:${PN} += "erlang"

inherit rpm
