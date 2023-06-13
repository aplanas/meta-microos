SUMMARY = "Cloud Foundry command line client"
DESCRIPTION = "This is the official command line client for Cloud Foundry."
LICENSE = "Apache-2.0"

PV = "6.51.0"

RPM_NAME = "cf-cli-6.51.0-2.11.aarch64.rpm"
RPM_HASH = "9a973b9da94d3fef95be367f54128a96b3ea14e4a5870f8ee892e6b6ce6afcef7f9c571c42217e26988a56e3ef260bc30d1c6578120df72e4e06b0b7b6579b7c"

RPROVIDES:${PN} += "cf-cli \
cf-cli(aarch-64) \
config(cf-cli)"

RDEPENDS:${PN} += ""

inherit rpm
