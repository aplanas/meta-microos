SUMMARY = "Erlang/OTP debugger application sources"
DESCRIPTION = "Erlang sources for the debugger application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-debugger-src-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "f5bde9703dda6689fa837fd66e72a4d2f245e7fe835b7341a76c3a1520f63aa1a979497061e0dd33b9011b348c94aa5dd80b2cbdaaf36723c22df9c609533d7f"

RPROVIDES:${PN} += "erlang-debugger-src"

RDEPENDS:${PN} += "erlang-debugger"

inherit rpm
