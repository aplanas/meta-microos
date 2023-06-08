SUMMARY = "Erlang/OTP jinterface application sources"
DESCRIPTION = "Erlang sources for the jinterface application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-jinterface-src-25.3-1.1.aarch64.rpm"
RPM_HASH = "794a21b8d88084b39b42e85d2dbcef77e4a22234bd10700ecc88538949546d66891cf1b3b3609868b67f31024e5cc1c0ec88c022e375c2cd3c6615b61b5c9136"

RPROVIDES:${PN} += "erlang-jinterface-src erlang-jinterface-src(aarch-64)"
RDEPENDS:${PN} += "erlang-jinterface"

inherit rpm
