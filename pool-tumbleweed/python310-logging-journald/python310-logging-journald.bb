SUMMARY = "Pure python logging handler for writing logs to the journald using native protocol"
DESCRIPTION = "Pure python logging handler for writing logs to the journald using native protocol"
LICENSE = "MIT"

PV = "0.6.5"

RPM_NAME = "python310-logging-journald-0.6.5-1.3.noarch.rpm"
RPM_HASH = "8c61cb7f5d9e0eca834d4c1467a85842941eec3eaab494f93452f164396f8370f5c6dae0b960d4d6185ab33c59cc267edd3de2f5e69c859eaaf6351e7e066aea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-logging-journald \
python310-logging-journald \
python3dist-logging-journald"

RDEPENDS:${PN} += "python-abi"

inherit rpm
