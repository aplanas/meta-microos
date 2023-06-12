SUMMARY = "Erlang/OTP applications sources"
DESCRIPTION = "Erlang sources for all the applications in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-src-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "d3529a51dc96a4c353bb0781cc09989d77091a6cd5c736f7a9001c3713414e405d56c54efddd9d3abb5a0b0eb98990ef9f0e021b8d8c38492de85b3c2c08afc1"

RPROVIDES:${PN} += "erlang-src \
erlang-src(aarch-64)"
RDEPENDS:${PN} += "erlang"

inherit rpm
