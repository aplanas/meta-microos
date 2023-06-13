SUMMARY = "Fuzzy string matching in python"
DESCRIPTION = "Fuzzy string matching in python"
LICENSE = "GPL-2.0-only"

PV = "0.18.0"

RPM_NAME = "python310-fuzzywuzzy-0.18.0-2.8.noarch.rpm"
RPM_HASH = "2fab79d0926ac98f747969a83a389126c04abc778458aeef2af04d4e3e76591fb551f024e3ec2477cf2b6205653ff4e3d4a00229c773d8ede42b28058b78f788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fuzzywuzzy \
python3.10dist(fuzzywuzzy) \
python310-fuzzywuzzy \
python3dist(fuzzywuzzy)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
