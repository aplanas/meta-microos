SUMMARY = "A debugger for debugging and testing of Erlang programs"
DESCRIPTION = "A debugger for debugging and testing of Erlang programs."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-debugger-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "385614a6d8f0537c5283fbc9941a3bdafe0ac77d76272d1ad86372f63037935312693a4d14113473c3c51992a58ea332061f2385e097d8949719009b8ecc466a"

RPROVIDES:${PN} += "erlang-debugger erlang-debugger(aarch-64)"
RDEPENDS:${PN} += "erlang erlang-wx"

inherit rpm
