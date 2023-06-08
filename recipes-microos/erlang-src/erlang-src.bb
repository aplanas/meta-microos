SUMMARY = "Erlang/OTP applications sources"
DESCRIPTION = "Erlang sources for all the applications in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-src-25.3-1.1.aarch64.rpm"
RPM_HASH = "46a2b766f679ee8c5b95406b69b431615f8a3fad6f836b685e7ece3217fcb2285ea727525271607685eb74ad6f19d4572459f5386ef9a2539c51431008c1f1e1"

RPROVIDES:${PN} += "erlang-src erlang-src(aarch-64)"
RDEPENDS:${PN} += "erlang"

inherit rpm
