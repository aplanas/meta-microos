SUMMARY = "Erlang/OTP et application sources"
DESCRIPTION = "Erlang sources for the et application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-et-src-25.3-1.1.aarch64.rpm"
RPM_HASH = "eb3fa42e6854217a63b9f28062ec67007087d5bce2a5ed53ae8328891994ce69b7ed36befb3e4c3f9af8404ea4df2a529f75dca24aa0484eddc8ae8ae8585b5a"

RPROVIDES:${PN} += "erlang-et-src erlang-et-src(aarch-64)"
RDEPENDS:${PN} += "erlang-et"

inherit rpm
