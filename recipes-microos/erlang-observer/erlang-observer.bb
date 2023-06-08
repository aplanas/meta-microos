SUMMARY = "A GUI tool for observing an erlang system"
DESCRIPTION = "The observer is gui frontend containing various tools to inspect a system. \
It displays system information, application structures, process information, \
ets or mnesia tables and a frontend for tracing with ttb."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-observer-25.3-1.1.aarch64.rpm"
RPM_HASH = "3e7036e1f78368183310cabf8aca6c68e7835e04e5de8ac2f692d2901c5e2480b46f6cd09dd57e10040f793cdd99850dfdd647625a23ca51df5ead8bb4843792"

RPROVIDES:${PN} += "erlang-observer erlang-observer(aarch-64)"
RDEPENDS:${PN} += "/bin/sh erlang erlang-wx"

inherit rpm
