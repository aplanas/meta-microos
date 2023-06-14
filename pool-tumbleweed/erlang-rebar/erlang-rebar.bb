SUMMARY = "A sophisticated build-tool for Erlang projects that follows OTP principles"
DESCRIPTION = "rebar is an Erlang build tool that makes it easy to compile and \
test Erlang applications, port drivers and releases. \
 \
rebar is a self-contained Erlang script, so it's easy to distribute or even \
embed directly in a project. Where possible, rebar uses standard Erlang/OTP \
conventions for project structures, thus minimizing the amount of build \
configuration work. rebar also provides dependency management, enabling \
application writers to easily re-use common libraries from a variety of \
locations (git, hg, etc)."
LICENSE = "Apache-2.0"

PV = "2.6.4+git20180201.b6d3094"

RPM_NAME = "erlang-rebar-2.6.4+git20180201.b6d3094-3.6.aarch64.rpm"
RPM_HASH = "063006cb5bb6a5e473b699a71fc54a6c96d07d04e070da75dc35e9d868878cefc2391d9cad4418504a0c482ef21fb4f2dd7d0f63385c555c54bc5f4c5de35a99"

RPROVIDES:${PN} += "erlang-rebar \
rebar \
rpm-macro-rebar \
rpm-macro-rebar-compile \
rpm-macro-rebar-set-vsn-cache"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
erlang"

inherit rpm
