SUMMARY = "JsonDecoder for ndjson"
DESCRIPTION = "JsonDecoder for ndjson"
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python310-ndjson-0.3.1-1.3.noarch.rpm"
RPM_HASH = "9da39d97049bd5227b795d02bd7f34358704c08d2b4cad97287e6b788a0773584a486b0b9cb6a1dd5fe4697838d0b71e33fe22af72ff70c34fd5fb2e09849b04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ndjson \
python3.10dist-ndjson \
python310-ndjson \
python3dist-ndjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
