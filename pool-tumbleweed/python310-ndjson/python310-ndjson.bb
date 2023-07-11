SUMMARY = "JsonDecoder for ndjson"
DESCRIPTION = "JsonDecoder for ndjson"
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python310-ndjson-0.3.1-1.5.noarch.rpm"
RPM_HASH = "b41cc0188355dcd3aa41c656b590aae235e66abb1e0c8e953f4267b5bdc8998ff6e8596d8b71a6863d69921ddf325e7ef60153705f31dd05617a8f16b1eab3ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ndjson \
python310-ndjson \
python3dist-ndjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
