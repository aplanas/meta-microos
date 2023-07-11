SUMMARY = "Microsoft Azure CLI Telemetry Package"
DESCRIPTION = "Microsoft Azure CLI Telemetry Package \
 \
This is the Microsoft Azure CLI Telemetry package. It is not intended to be installed directly by the end user. \
 \
This package includes: \
1. Support API for Azure CLI to gather telemetry. \
2. Telemetry upload process."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "azure-cli-telemetry-1.0.8-1.3.noarch.rpm"
RPM_HASH = "0392fcf3cc5a03e8fa4b311acaca64275435f6eb20a21aabb378a89837ae7a7c8143c72f1cd0591490f66eed880734075a70c5f66b35dcddd1d90b113a49810c"
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
