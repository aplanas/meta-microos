SUMMARY = "Low Level Client for Crossref Search API"
DESCRIPTION = "Low Level Client for Crossref Search API"
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python39-habanero-1.2.3-1.5.noarch.rpm"
RPM_HASH = "dd2d8b9314ae4abe823bae873297f90f25b4d9bdbadb40b87dafb5c72bba5cb2c5e23803c21ab2c59488c32e92197117e3e7896f89675c5989e288270e405b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-habanero \
python39-habanero \
python3dist-habanero"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-tqdm"

inherit rpm
