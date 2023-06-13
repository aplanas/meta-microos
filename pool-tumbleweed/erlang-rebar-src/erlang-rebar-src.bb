SUMMARY = "A sophisticated build-tool for Erlang projects that follows OTP principles"
DESCRIPTION = "rebar is an Erlang build tool that makes it easy to compile and \
test Erlang applications, port drivers and releases."
LICENSE = "Apache-2.0"

PV = "2.6.4+git20180201.b6d3094"

RPM_NAME = "erlang-rebar-src-2.6.4+git20180201.b6d3094-3.6.aarch64.rpm"
RPM_HASH = "7d25f1720931b3616ec4289e56135f195526727fc98491f40207db9e5d19f808e503b56a99f2c5c058344637a415ca24e65571d27516e284ef3421d9c667116e"

RPROVIDES:${PN} += "erlang-rebar-devel \
erlang-rebar-src \
erlang-rebar-src(aarch-64)"

RDEPENDS:${PN} += "erlang-rebar"

inherit rpm
