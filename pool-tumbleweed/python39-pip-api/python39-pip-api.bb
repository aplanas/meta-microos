SUMMARY = "The official unofficial pip API"
DESCRIPTION = "The official unofficial pip API."
LICENSE = "Apache-2.0"

PV = "0.0.30"

RPM_NAME = "python39-pip-api-0.0.30-3.3.noarch.rpm"
RPM_HASH = "9f4fbc71673895384825820501f16d420792b6405e62bdee90fc551faac4ba77c1322368e00560665fc42d3dd77a9989a79b69f9bebcae063ca8669350993d0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pip-api \
python39-pip-api \
python3dist-pip-api"

RDEPENDS:${PN} += "python-abi \
python39-pip"

inherit rpm
