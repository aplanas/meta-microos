SUMMARY = "Erlang Java Interface"
DESCRIPTION = "JInterface module for accessing erlang from Java"
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-jinterface-25.3-1.1.aarch64.rpm"
RPM_HASH = "d6bacd61eff35a89ea46188c65e7f5a9a78f817c9342bf2e1fd895785ab0b318f3767a61eb2a0b56185b5091287be9f4610ddeac7813684689b274bf74c32e77"

RPROVIDES:${PN} += "erlang-jinterface erlang-jinterface(aarch-64)"
RDEPENDS:${PN} += "erlang java"

inherit rpm
