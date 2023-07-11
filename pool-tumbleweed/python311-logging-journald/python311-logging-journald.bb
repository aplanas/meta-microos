SUMMARY = "Pure python logging handler for writing logs to the journald using native protocol"
DESCRIPTION = "Pure python logging handler for writing logs to the journald using native protocol"
LICENSE = "MIT"

PV = "0.6.5"

RPM_NAME = "python311-logging-journald-0.6.5-1.3.noarch.rpm"
RPM_HASH = "f6e7fdbea75352749f99dcd54b07bbcca0ba8ac915ff69dc3e0e23e93a3057e345308d928d3fb473086d5c2906342661b2cdd005b1f78aa12d2d9afd45dd8393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-logging-journald \
python3.11dist-logging-journald \
python311-logging-journald \
python3dist-logging-journald"

RDEPENDS:${PN} += "python-abi"

inherit rpm
