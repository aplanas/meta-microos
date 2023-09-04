SUMMARY = "Microsoft Azure CLI Telemetry Package"
DESCRIPTION = "Microsoft Azure CLI Telemetry Package \
 \
This is the Microsoft Azure CLI Telemetry package. It is not intended to be installed directly by the end user. \
 \
This package includes: \
1. Support API for Azure CLI to gather telemetry. \
2. Telemetry upload process."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "azure-cli-telemetry-1.1.0-1.1.noarch.rpm"
RPM_HASH = "5f2e2a0083d3f0b3c12ffe559ee82317b03dc6123a652f4d8e8d66b80ac342c42bb743a79a1afff7da1efa562f3e8e57b66d3f70e3a4171ae7a0fe3a9fb7f3cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azure-cli-telemetry \
python3.11dist-azure-cli-telemetry \
python3dist-azure-cli-telemetry"

RDEPENDS:${PN} += "azure-cli-nspkg \
python-abi \
python3-applicationinsights \
python3-azure-nspkg \
python3-portalocker"

inherit rpm
