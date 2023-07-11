SUMMARY = "Erlang/OTP reltool application sources"
DESCRIPTION = "Erlang sources for the reltool application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-reltool-src-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "a9ecd87e74dd9e5acbdf5d5b1fd3f8c54ed14593728a194dcfd1ad19a297c9f388893302fb8fc1da46d99cbe93740d0b7cde6b1287363a867fb49c7ee9722496"

RPROVIDES:${PN} += "erlang-reltool-src"

RDEPENDS:${PN} += "erlang-reltool"

inherit rpm
