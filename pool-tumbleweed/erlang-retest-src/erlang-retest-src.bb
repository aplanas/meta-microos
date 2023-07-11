SUMMARY = "Erlang retest library"
DESCRIPTION = "Erlang retest library."
LICENSE = "MIT"

PV = "1.1.1+git20160312.ffef7d0"

RPM_NAME = "erlang-retest-src-1.1.1+git20160312.ffef7d0-1.26.aarch64.rpm"
RPM_HASH = "305bbd1816833941672349c2c21d9bd4a06d74223e33d7d656c0d9cded8384f8d17c9db7578988f391094488cf33780397caed12cb59da6a66caf9ea61f21d6d"

RPROVIDES:${PN} += "erlang-retest-src"

RDEPENDS:${PN} += "erlang-retest"

inherit rpm
