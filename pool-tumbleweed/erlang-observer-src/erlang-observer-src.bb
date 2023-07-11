SUMMARY = "Erlang/OTP observer application sources"
DESCRIPTION = "Erlang sources for the observer application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-observer-src-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "1fdd875d4bf1ada61caff10facd4fc4cbeebcee0b2ea9f82af1c1c008a385c83dcba31e851323c32021570ef9d4525a5b2d9a78750a491b99a1b9604c7293bc6"

RPROVIDES:${PN} += "erlang-observer-src"

RDEPENDS:${PN} += "erlang-observer"

inherit rpm
