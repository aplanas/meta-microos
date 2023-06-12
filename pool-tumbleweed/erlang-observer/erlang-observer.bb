SUMMARY = "A GUI tool for observing an erlang system"
DESCRIPTION = "The observer is gui frontend containing various tools to inspect a system. \
It displays system information, application structures, process information, \
ets or mnesia tables and a frontend for tracing with ttb."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-observer-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "61ed0b764f0e01d464a277c3288dcdb96e1e3c796eeb8c044d6f0f8c045d3deb058403de3ef9ae5aab7d9120d8a1c5b079721fadd11a4d4ef4d1ce39665a8f1a"

RPROVIDES:${PN} += "erlang-observer \
erlang-observer(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
erlang \
erlang-wx"

inherit rpm
