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

RPM_NAME = "erlang-rebar3-3.18.0-1.1.aarch64.rpm"
RPM_HASH = "acf17d04f7480c009e906646ffc0aeca3f87d15f4232651e2dbdf1804a451d8ed412376f8a07a7648ea3991c6a59144e977ec0872f0856e6f1d7b2a4b3ecd453"

RPROVIDES:${PN} += "erlang-rebar3 \
erlang-rebar3(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/escript \
erlang \
erlang-erlware_commons \
erlang-providers"

inherit rpm
