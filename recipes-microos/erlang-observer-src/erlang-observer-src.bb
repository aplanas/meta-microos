SUMMARY = "Erlang/OTP observer application sources"
DESCRIPTION = "Erlang sources for the observer application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-observer-src-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "1839f722c1816700f9d077976466313d0b84cdb5e149858ad3ed4a0af8c04ad929259c2e90374f1ca442a14e15110acd792f31b1094ea607958801cbbb0746fc"

RPROVIDES:${PN} += "erlang-observer-src \
erlang-observer-src(aarch-64)"
RDEPENDS:${PN} += "erlang-observer"

inherit rpm
