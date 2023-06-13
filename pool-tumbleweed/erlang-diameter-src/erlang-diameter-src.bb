SUMMARY = "Erlang/OTP Diameter application sources"
DESCRIPTION = "Erlang sources for the Diameter application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-diameter-src-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "64688c532efa4c9b11f98adc07aa48088d2e94dd7f5f7228c9a8084938bd5b5d79c74de67ebea14212d7ee57d884df34032c56a0e05c478755d714be63f730d7"

RPROVIDES:${PN} += "erlang-diameter-src \
erlang-diameter-src(aarch-64)"

RDEPENDS:${PN} += "erlang-diameter"

inherit rpm
