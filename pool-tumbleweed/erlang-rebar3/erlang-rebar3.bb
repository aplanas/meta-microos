SUMMARY = "Tool for working with Erlang projects"
DESCRIPTION = "Rebar3 is an Erlang tool that makes it easy to create, develop, and release \
Erlang libraries, applications, and systems in a repeatable manner. \
 \
Rebar3 is the spiritual successor to rebar 2.x, which was the first usable \
build tool for Erlang that ended up seeing widespread community adoption. It \
however had several shortcomings that made it difficult to use with larger \
projects or with teams with users new to Erlang."
LICENSE = "Apache-2.0"

PV = "3.18.0"

RPM_NAME = "erlang-rebar3-3.18.0-1.2.aarch64.rpm"
RPM_HASH = "2e2d43705634de17cf1e4a449fe1935edddcb74c466b6cda98d96b4ee1d9f43e4473763e73e810b27f7699b7ea2a3d859ff126d0a3b527469d2417448e6821e7"

RPROVIDES:${PN} += "erlang-rebar3"

RDEPENDS:${PN} += "/usr/bin/escript \
erlang \
erlang-erlware-commons \
erlang-providers"

inherit rpm
