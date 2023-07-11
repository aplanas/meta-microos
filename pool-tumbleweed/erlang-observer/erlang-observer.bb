SUMMARY = "A GUI tool for observing an erlang system"
DESCRIPTION = "The observer is gui frontend containing various tools to inspect a system. \
It displays system information, application structures, process information, \
ets or mnesia tables and a frontend for tracing with ttb."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-observer-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "a600895dd4c09de219b235d2a051420341230919302ef02889a88eb28cb0dc6fd7d3094559626423abaa116246cb9af3cce54fc60e65063e667723805681d85d"

RPROVIDES:${PN} += "erlang-observer"

RDEPENDS:${PN} += "/usr/bin/sh \
erlang \
erlang-wx"

inherit rpm
