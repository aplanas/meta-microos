SUMMARY = "Erlang/OTP wx application sources"
DESCRIPTION = "Erlang sources for the wx application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-wx-src-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "66244d6f64c216e04e9a7a28711714ca21b71875089d42d52c702700a23f7b04317662b54578a6e10bd1fc7fe777d33ca0790d6c5556e6b694ad3436e704dc74"

RPROVIDES:${PN} += "erlang-wx-src"

RDEPENDS:${PN} += "erlang-wx"

inherit rpm
