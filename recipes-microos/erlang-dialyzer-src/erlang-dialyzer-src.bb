SUMMARY = "Erlang/OTP dialyzer application sources"
DESCRIPTION = "Erlang sources for the dialyzer application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-dialyzer-src-25.3-1.1.aarch64.rpm"
RPM_HASH = "077d5dc56f256696948fa3ec915a1402d5f511f0ba08a905fb1af6c372ba015d23c9079addcba4ff64943fb9f8035fc37329e6d5838ab70f2693d0493a9a34db"

RPROVIDES:${PN} += "erlang-dialyzer-src erlang-dialyzer-src(aarch-64)"
RDEPENDS:${PN} += "erlang-dialyzer"

inherit rpm
