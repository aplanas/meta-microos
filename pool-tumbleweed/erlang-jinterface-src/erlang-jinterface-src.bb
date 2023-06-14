SUMMARY = "Erlang/OTP jinterface application sources"
DESCRIPTION = "Erlang sources for the jinterface application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-jinterface-src-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "041ff628fab574d16b226bcfa9eb0f847bcbb7dfef7c11ec63fc9e31957933ef1d0a3bf55455502c94d99f12d66887965b459a7d589fd7c9b298902c87b4f598"

RPROVIDES:${PN} += "erlang-jinterface-src"

RDEPENDS:${PN} += "erlang-jinterface"

inherit rpm
