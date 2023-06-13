SUMMARY = "Erlang/OTP dialyzer application sources"
DESCRIPTION = "Erlang sources for the dialyzer application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-dialyzer-src-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "d8b07620bc48e180f76cebc668ee0edb779c270d24478656d6615a865768f0696a7499faaaf7707e9755d81bfcc213fd505befef1fb932d9fd73c502a3fb15d5"

RPROVIDES:${PN} += "erlang-dialyzer-src \
erlang-dialyzer-src(aarch-64)"

RDEPENDS:${PN} += "erlang-dialyzer"

inherit rpm
