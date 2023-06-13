SUMMARY = "Fuzzy string matching in python"
DESCRIPTION = "Fuzzy string matching in python"
LICENSE = "GPL-2.0-only"

PV = "0.18.0"

RPM_NAME = "python311-fuzzywuzzy-0.18.0-2.8.noarch.rpm"
RPM_HASH = "c9a55fa673fea390f14f246f74e5bba445ecd1498dacf6844c45fe16f021049c140a0e1cf22c97752ff0db1d88210b5aeff552cb91e7784fea5ad22fb0da84d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fuzzywuzzy) \
python311-fuzzywuzzy \
python3dist(fuzzywuzzy)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
