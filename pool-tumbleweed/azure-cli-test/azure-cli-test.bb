SUMMARY = "Microsoft Azure CLI 2.0"
DESCRIPTION = "Microsoft Azure CLI 2.0 Command Line Utilities"
LICENSE = "MIT"

PV = "2.51.0"

RPM_NAME = "azure-cli-test-2.51.0-1.1.aarch64.rpm"
RPM_HASH = "84bdb3805252e83d46c3cf3b30e8ad74d22477e6d95a42bfdd631f2d2a9c3fe3d2a1de004517f12fb0d0c347f30da98a6f33bed27f0d3daaa399c87b3c96bcbd"

RPROVIDES:${PN} += "azure-cli-test"

RDEPENDS:${PN} += ""

inherit rpm
