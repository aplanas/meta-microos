SUMMARY = "Low Level Client for Crossref Search API"
DESCRIPTION = "Low Level Client for Crossref Search API"
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python310-habanero-1.2.3-1.5.noarch.rpm"
RPM_HASH = "f80f202e97fbd5e356fb8611eb456dae91767a72b45e4b0df2512dc25063033dca3fdc401965ceba908d1e3e9a9a7bff5ceae545561a69bc5ea8ca16088f3cdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-habanero \
python310-habanero \
python3dist-habanero"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-tqdm"

inherit rpm
