SUMMARY = "Erlang/OTP Diameter application sources"
DESCRIPTION = "Erlang sources for the Diameter application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-diameter-src-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "a04894022935989c7b1a713a546b23069ecd84bd3a8f6ea41c815c342bfadd75167d0df30cb1330253c9daf6f489b33d3b0386664ddfd855e78b54b4fbefbfb9"

RPROVIDES:${PN} += "erlang-diameter-src"

RDEPENDS:${PN} += "erlang-diameter"

inherit rpm
