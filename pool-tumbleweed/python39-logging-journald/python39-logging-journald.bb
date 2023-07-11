SUMMARY = "Pure python logging handler for writing logs to the journald using native protocol"
DESCRIPTION = "Pure python logging handler for writing logs to the journald using native protocol"
LICENSE = "MIT"

PV = "0.6.5"

RPM_NAME = "python39-logging-journald-0.6.5-1.3.noarch.rpm"
RPM_HASH = "8e990978a02e50f9098f4e679266f8e77af8aa009a4f5de3c8d0e3ee74173b57d6f48f09a354176cfc2ff7f92900475b65b3fdc10d9e9c2117675ad65a6d9048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-logging-journald \
python39-logging-journald \
python3dist-logging-journald"

RDEPENDS:${PN} += "python-abi"

inherit rpm
