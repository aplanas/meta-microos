SUMMARY = "Erlang/OTP Diameter application sources"
DESCRIPTION = "Erlang sources for the Diameter application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-diameter-src-25.3-1.1.aarch64.rpm"
RPM_HASH = "459ba1e9b5b53893d3589d01b35ab2c1db6c4e9710f33512e4a4b8f84badd96ea28ae6a026ac7a46becab165d2ff8f7afada3d44d4b4749acb7c9d5e9d2eb1e5"

RPROVIDES:${PN} += "erlang-diameter-src erlang-diameter-src(aarch-64)"
RDEPENDS:${PN} += "erlang-diameter"

inherit rpm
