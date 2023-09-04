SUMMARY = "CLI Go test runner with output optimized for human readability"
DESCRIPTION = "Go test runner with output optimized for humans, JUnit XML for CI integration, \
and a summary of the test results."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "gotestsum-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "0b959f0e8ed2db43afceb5d0a347a6e046d13ecc48cb472c90ac633cd1c32d5b1ed61d6068230fcba015d18d36286398c8069c8c0006d7aaab4a839240ab5239"

RPROVIDES:${PN} += "gotestsum"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
