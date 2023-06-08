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

RPM_NAME = "azure-cli-telemetry-1.0.8-1.2.noarch.rpm"
RPM_HASH = "a0252e324aeb593482cde556fd5243547cccc3f8cfc09cec6d93e0b62381f78ee3cc20777aa729fee8777e29eb547bdc7058bd06e7668c8026acb3fd587e645e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azure-cli-telemetry python3.10dist(azure-cli-telemetry) python3dist(azure-cli-telemetry)"
RDEPENDS:${PN} += "azure-cli-nspkg python(abi) python3-applicationinsights python3-azure-nspkg python3-portalocker"

inherit rpm
