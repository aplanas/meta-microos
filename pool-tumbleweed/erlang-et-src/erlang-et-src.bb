SUMMARY = "Erlang/OTP et application sources"
DESCRIPTION = "Erlang sources for the et application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-et-src-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "d914492a333a004f22279a720d4d54c2f92b57802f8712af6a0fa820d87232ff35a73d2c7e0812c0a9423a903958ead74aa5bcfaf3be5e6f498a7407c967e478"

RPROVIDES:${PN} += "erlang-et-src \
erlang-et-src(aarch-64)"

RDEPENDS:${PN} += "erlang-et"

inherit rpm
