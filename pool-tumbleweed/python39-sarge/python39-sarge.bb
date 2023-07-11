SUMMARY = "Command pipelines for python"
DESCRIPTION = "A wrapper for subprocess which provides command pipeline functionality."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.post1"

RPM_NAME = "python39-sarge-0.1.7.post1-1.4.noarch.rpm"
RPM_HASH = "8e0b0a00d090a8aca93dc563cb27019dbe5106ad6f37e7d303b540babf9f6cc2c06416afaff1a65af0ce64b6850c984397adfbb0b5e20935e036c96c51ae5722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sarge \
python39-sarge \
python3dist-sarge"

RDEPENDS:${PN} += "python-abi"

inherit rpm
