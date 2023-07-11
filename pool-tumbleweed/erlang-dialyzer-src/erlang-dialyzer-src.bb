SUMMARY = "Erlang/OTP dialyzer application sources"
DESCRIPTION = "Erlang sources for the dialyzer application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-dialyzer-src-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "73c5cc1a5dee81e64bade8db3820dca3ea548444d944e78976f7ade5ff3041a5a9f1476bd49f6e8010f45c274b467e21a987f1586e9c50565b9e2cc7fca382f4"

RPROVIDES:${PN} += "erlang-dialyzer-src"

RDEPENDS:${PN} += "erlang-dialyzer"

inherit rpm
