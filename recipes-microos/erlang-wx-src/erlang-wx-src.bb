SUMMARY = "Erlang/OTP wx application sources"
DESCRIPTION = "Erlang sources for the wx application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-wx-src-25.3-1.1.aarch64.rpm"
RPM_HASH = "95bd88f40d98b06803d0ccc4fd1abfa2c7a0ad41e77a9f71497eb1b36ec1ac04bef12dfaa0ccfac301a7914e70413c87222e9e1d933c6785a4d71084d7639945"

RPROVIDES:${PN} += "erlang-wx-src erlang-wx-src(aarch-64)"
RDEPENDS:${PN} += "erlang-wx"

inherit rpm
