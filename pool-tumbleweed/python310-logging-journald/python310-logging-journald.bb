SUMMARY = "Pure python logging handler for writing logs to the journald using native protocol"
DESCRIPTION = "Pure python logging handler for writing logs to the journald using native protocol"
LICENSE = "MIT"

PV = "0.6.5"

RPM_NAME = "python310-logging-journald-0.6.5-1.1.noarch.rpm"
RPM_HASH = "db6f708d55583f6a54e67ddb9e1553c6c679b8866836fab2384cf9d079d77ad76dae49035fab1385d4e10245f099ca801e79cf27f713c42627c289e6b7e325a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-logging-journald \
python3.10dist-logging-journald \
python310-logging-journald \
python3dist-logging-journald"

RDEPENDS:${PN} += "python-abi"

inherit rpm
