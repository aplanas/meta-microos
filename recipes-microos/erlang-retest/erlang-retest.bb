SUMMARY = "Erlang retest library"
DESCRIPTION = "Erlang retest library."
LICENSE = "MIT"

PV = "1.1.1+git20160312.ffef7d0"

RPM_NAME = "erlang-retest-1.1.1+git20160312.ffef7d0-1.25.aarch64.rpm"
RPM_HASH = "4bf6c029cc55c2b6975efc93442e9965fc821e3be49a4bd8c0c44cf52c77ce7293ac9047af69cfb41f6015e9d1a0f58ef3a3790187dca8b157eb0a29f6fe91a0"

RPROVIDES:${PN} += "erlang-retest erlang-retest(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env erlang"

inherit rpm
