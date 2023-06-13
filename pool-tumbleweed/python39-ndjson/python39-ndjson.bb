SUMMARY = "JsonDecoder for ndjson"
DESCRIPTION = "JsonDecoder for ndjson"
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python39-ndjson-0.3.1-1.3.noarch.rpm"
RPM_HASH = "05d1962fc8de944a2477cdacf13c04ebd4a090e2680fc994473c013a9907b9ac844e4543d5e1125b26a81860c30708ed8440c7cd95f9b25ea066c69d02a08b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ndjson) \
python39-ndjson \
python3dist(ndjson)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
