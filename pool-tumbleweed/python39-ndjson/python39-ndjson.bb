SUMMARY = "JsonDecoder for ndjson"
DESCRIPTION = "JsonDecoder for ndjson"
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python39-ndjson-0.3.1-1.5.noarch.rpm"
RPM_HASH = "bea98f4ce26c2d0810cd140082389ab511c0d642679e16692cd82e80d27a100d61cb774b4a496b99fdb0836879154fd39fc7a010ee80b1f9f6618f3803d55c90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ndjson \
python39-ndjson \
python3dist-ndjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
