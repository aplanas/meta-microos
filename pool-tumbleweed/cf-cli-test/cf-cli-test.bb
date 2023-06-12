SUMMARY = "Cloud Foundry command line client"
DESCRIPTION = "This is the official command line client for Cloud Foundry."
LICENSE = "Apache-2.0"

PV = "6.51.0"

RPM_NAME = "cf-cli-test-6.51.0-2.7.aarch64.rpm"
RPM_HASH = "259fd9264a121dc2336be9d41744af0be68ce1c89402bb0dc5990e1cf2870c4ec09177b2d0126fa5a7dfd39e686b963e7c0b082f506313f4a9f2be263961b260"

RPROVIDES:${PN} += "cf-cli-test \
cf-cli-test(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
