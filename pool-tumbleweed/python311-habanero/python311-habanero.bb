SUMMARY = "Low Level Client for Crossref Search API"
DESCRIPTION = "Low Level Client for Crossref Search API"
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python311-habanero-1.2.3-1.5.noarch.rpm"
RPM_HASH = "3938e5f633210b54eebe2851a5c6ba259346358675d5024c0d85364eb53144bae46e4c2f2ea8c91854d5e0c60de1b4e915ea6c3ed074523ff62b09655240b943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-habanero \
python3.11dist-habanero \
python311-habanero \
python3dist-habanero"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-tqdm"

inherit rpm
