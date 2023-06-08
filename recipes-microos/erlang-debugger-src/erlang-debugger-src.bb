SUMMARY = "Erlang/OTP debugger application sources"
DESCRIPTION = "Erlang sources for the debugger application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-debugger-src-25.3-1.1.aarch64.rpm"
RPM_HASH = "46a83fbbea0c4f4c52774687e1ee225eb035d25994239e80e5647ce108063b9dcba9e21413e98d73406feeea8abe5536d532e5e66f54301e861793c0b94cda0a"

RPROVIDES:${PN} += "erlang-debugger-src erlang-debugger-src(aarch-64)"
RDEPENDS:${PN} += "erlang-debugger"

inherit rpm
