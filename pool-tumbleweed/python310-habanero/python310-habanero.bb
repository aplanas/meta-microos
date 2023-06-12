SUMMARY = "Low Level Client for Crossref Search API"
DESCRIPTION = "Low Level Client for Crossref Search API"
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python310-habanero-1.2.3-1.3.noarch.rpm"
RPM_HASH = "5a896562f01aeee9ce8ba6c170249aa30b0615ebcea0da40e364d9448f36e9b51445cb672779cb17cd76a664ab7e61de6d777cdc2c4d6a0f3d5644f640941799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-habanero \
python3.10dist(habanero) \
python310-habanero \
python3dist(habanero)"
RDEPENDS:${PN} += "python(abi) \
python310-requests \
python310-tqdm"

inherit rpm
