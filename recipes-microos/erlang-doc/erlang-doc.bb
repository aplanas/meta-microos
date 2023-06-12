SUMMARY = "Erlang documentation"
DESCRIPTION = "Documentation for Erlang."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-doc-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "98268d0d13327ae1a929ff8095d2f01a53654997dbdac2baecc5640a65a422efdf3e7dd4a20f972f9792bf2fe9ad4127f3aea665c36f4212fd285c6c8bd5a10d"

RPROVIDES:${PN} += "erlang-doc erlang-doc(aarch-64)"
RDEPENDS:${PN} += "erlang"

inherit rpm
