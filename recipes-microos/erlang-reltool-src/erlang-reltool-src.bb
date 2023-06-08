SUMMARY = "Erlang/OTP reltool application sources"
DESCRIPTION = "Erlang sources for the reltool application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-reltool-src-25.3-1.1.aarch64.rpm"
RPM_HASH = "14cb1796daa26d2123f18bc017c003357ef8ff2a29fba687bbbf5d922d9d4b5a4770a5a2b58c51bec7d86a3aed6b67ced087b69b56cc67b16f9bd7bd9bbed5ee"

RPROVIDES:${PN} += "erlang-reltool-src erlang-reltool-src(aarch-64)"
RDEPENDS:${PN} += "erlang-reltool"

inherit rpm
