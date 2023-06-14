SUMMARY = "An Erlang providers library"
DESCRIPTION = "An Erlang providers library."
LICENSE = "Apache-2.0"

PV = "1.8.1"

RPM_NAME = "erlang-providers-1.8.1-1.1.aarch64.rpm"
RPM_HASH = "4cb007892a8657fbfa4c1cdf3894572acd92c38f7c9404954852cdeda217e5c836d5c5681f99a3a134bcdf8633d8b1a267a1d6ab89f0c6dbb135d16b361b74cc"

RPROVIDES:${PN} += "erlang-providers"

RDEPENDS:${PN} += "erlang \
erlang-getopt"

inherit rpm
