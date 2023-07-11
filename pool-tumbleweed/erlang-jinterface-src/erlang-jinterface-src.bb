SUMMARY = "Erlang/OTP jinterface application sources"
DESCRIPTION = "Erlang sources for the jinterface application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-jinterface-src-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "6ffacd8a03ac800a932f0e6b843e807f66f643ee5d9e8e45c99b8d4cf010cb84c08a034fdc70fd51e7963c65256c764cfdcf05a37c05dd3f379ec04f6b6a2639"

RPROVIDES:${PN} += "erlang-jinterface-src"

RDEPENDS:${PN} += "erlang-jinterface"

inherit rpm
