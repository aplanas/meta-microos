SUMMARY = "Fuzzy string matching in python"
DESCRIPTION = "Fuzzy string matching in python"
LICENSE = "GPL-2.0-only"

PV = "0.18.0"

RPM_NAME = "python39-fuzzywuzzy-0.18.0-2.10.noarch.rpm"
RPM_HASH = "c3cfa255c50337d1aa33629ba616a68a259a4362869fa7b13507562b201644ab3c7b26ea57353aec15f1bcb9f3020aa381dc9d8642fabdd8a42944bf64f341f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fuzzywuzzy \
python39-fuzzywuzzy \
python3dist-fuzzywuzzy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
