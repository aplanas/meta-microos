SUMMARY = "CLI Go test runner with output optimized for human readability"
DESCRIPTION = "Go test runner with output optimized for humans, JUnit XML for CI integration, \
and a summary of the test results."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "gotestsum-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "e6cc0189483dbea80e34872f045872207a10cc1659e0237cdb0c25e1afc8e0dfb3663426a00b508d2c947a25f4fae3b6765c0aeac9c42c0b43e6663c52156f12"

RPROVIDES:${PN} += "gotestsum"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
