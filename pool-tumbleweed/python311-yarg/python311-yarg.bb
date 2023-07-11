SUMMARY = "A PyPI client"
DESCRIPTION = "A PyPI client."
LICENSE = "MIT"

PV = "0.1.9"

RPM_NAME = "python311-yarg-0.1.9-3.3.noarch.rpm"
RPM_HASH = "5df7b9335ab02e5551526ec294a54a4e27629f55a4ed5d907b4778688e246f721886bf1061f88c15ed213e13c642bb0a1d7ff4887db5e8ff7062d12ab738d543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yarg \
python3.11dist-yarg \
python311-yarg \
python3dist-yarg"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
