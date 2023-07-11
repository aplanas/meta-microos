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

RPM_NAME = "erlang-rebar-2.6.4+git20180201.b6d3094-3.7.aarch64.rpm"
RPM_HASH = "aae448730d79bfc473182f3da8096d5a0ee8d0c99164815116218463bf4ec4f17f7b5f2b18f4f9ae2392d7c86623a2d911c123b68be8e2ae7b40fbfd3141ca49"

RPROVIDES:${PN} += "erlang-rebar \
rebar \
rpm-macro-rebar \
rpm-macro-rebar-compile \
rpm-macro-rebar-set-vsn-cache"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
erlang"

inherit rpm
