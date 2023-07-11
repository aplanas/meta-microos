SUMMARY = "Erlang/OTP et application sources"
DESCRIPTION = "Erlang sources for the et application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-et-src-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "33560bbf2b9e4fa8558d2e3ecfb750505e6f73888ed085e271acdca3cbacf0e8a0e82c1b1a6ed5cff66f6a9766c2cff9abefa59bec2560b09aecbe6209d6c521"

RPROVIDES:${PN} += "erlang-et-src"

RDEPENDS:${PN} += "erlang-et"

inherit rpm
