SUMMARY = "The official unofficial pip API"
DESCRIPTION = "The official unofficial pip API."
LICENSE = "Apache-2.0"

PV = "0.0.30"

RPM_NAME = "python310-pip-api-0.0.30-2.1.noarch.rpm"
RPM_HASH = "40838f9b84adf97f1d82abf5b78222f0bf8cc4dd858b78fb663f870136aff179f5709f9369fb10db11a11ccbe606b43927ef5e28c6fb8e459178717f58fd362b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-api \
python3.10dist(pip-api) \
python310-pip-api \
python3dist(pip-api)"

RDEPENDS:${PN} += "python(abi) \
python310-pip"

inherit rpm
