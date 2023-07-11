SUMMARY = "Erlang/OTP applications sources"
DESCRIPTION = "Erlang sources for all the applications in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-src-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "d887416978931fcfd05921603e46eb23a2757615c2ae9e6361e9609dc7fe3f249b773ede67b4e5c2973f0c0bff39b573af18a3e6eec15d87fdc1063f50cca3ed"

RPROVIDES:${PN} += "erlang-src"

RDEPENDS:${PN} += "erlang"

inherit rpm
