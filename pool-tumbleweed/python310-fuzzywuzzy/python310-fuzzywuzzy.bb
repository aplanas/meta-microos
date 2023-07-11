SUMMARY = "Fuzzy string matching in python"
DESCRIPTION = "Fuzzy string matching in python"
LICENSE = "GPL-2.0-only"

PV = "0.18.0"

RPM_NAME = "python310-fuzzywuzzy-0.18.0-2.10.noarch.rpm"
RPM_HASH = "875f188c1d7c657b01194aa229b98834e97c0a017dbbfaeac2a3fb6c11b979f098a94a9dbd7e11c1c20b520f6daacb632cfeb5932f68fb65454157bed8377951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fuzzywuzzy \
python310-fuzzywuzzy \
python3dist-fuzzywuzzy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
