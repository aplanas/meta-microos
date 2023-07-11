SUMMARY = "Cloud Foundry command line client"
DESCRIPTION = "This is the official command line client for Cloud Foundry."
LICENSE = "Apache-2.0"

PV = "6.51.0"

RPM_NAME = "cf-cli-6.51.0-2.12.aarch64.rpm"
RPM_HASH = "0019cd99815b9cf74f52ed54787d5629f1b16d72b5ddb6c659a073956f563cccbfe3e3a6a0ddaa6aead976c8718af139a93194f729769f40ebe3e80f242b6cdf"

RPROVIDES:${PN} += "cf-cli \
config-cf-cli"

RDEPENDS:${PN} += ""

inherit rpm
