SUMMARY = "Erlang/OTP reltool application sources"
DESCRIPTION = "Erlang sources for the reltool application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-reltool-src-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "03dd4ccf53970f85ef8a46ec208d0d5974bbf1937a40aa5f621e42eecd47cd4661546702dc9dc5f41f7f3476f40387775c9f4af432d116006add8758afde2191"

RPROVIDES:${PN} += "erlang-reltool-src \
erlang-reltool-src(aarch-64)"
RDEPENDS:${PN} += "erlang-reltool"

inherit rpm
