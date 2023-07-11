SUMMARY = "Erlang/OTP debugger application sources"
DESCRIPTION = "Erlang sources for the debugger application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-debugger-src-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "8ae870f5f4035ca24ebb0843a26673b7a9b09793b10213f162d6c69340be4a574e00cab82b36d2f0fe8bf2eec85c44bd4263d2f3bc5533d6c91e99c846cd7728"

RPROVIDES:${PN} += "erlang-debugger-src"

RDEPENDS:${PN} += "erlang-debugger"

inherit rpm
