SUMMARY = "An event tracer for Erlang programs"
DESCRIPTION = "An event tracer for Erlang programs."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-et-25.3-1.1.aarch64.rpm"
RPM_HASH = "fd38a3bd420e6fccc0eccc1f3df2809714e1907ac780cb7b9ab6436b446a43cc264cfa6cf227b16f7b8d3fe1376c48b964bf615b46ba1894306b7b76ea183db0"

RPROVIDES:${PN} += "erlang-et erlang-et(aarch-64)"
RDEPENDS:${PN} += "erlang erlang-wx"

inherit rpm
