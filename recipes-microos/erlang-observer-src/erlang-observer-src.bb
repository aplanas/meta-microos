SUMMARY = "Erlang/OTP observer application sources"
DESCRIPTION = "Erlang sources for the observer application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-observer-src-25.3-1.1.aarch64.rpm"
RPM_HASH = "df62f8dd8491026f2f6c896a148a79447028628649d7d82233862dce002070a2fedfc79a86c83817bb8ff3bffc5a68e1cc7d3934e98eda999e2c5ae6e0c2817e"

RPROVIDES:${PN} += "erlang-observer-src erlang-observer-src(aarch-64)"
RDEPENDS:${PN} += "erlang-observer"

inherit rpm
