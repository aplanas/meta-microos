SUMMARY = "Erlang/OTP wx application sources"
DESCRIPTION = "Erlang sources for the wx application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-wx-src-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "49a6fa73365203d4b280228a9c641acd38ad4ce4381110b8c4cd9e013bd8a4d8e84dad9016bd68aaaf5afff1edcc39cb1653277b863e7b52327fc3f4a9b379c3"

RPROVIDES:${PN} += "erlang-wx-src"

RDEPENDS:${PN} += "erlang-wx"

inherit rpm
