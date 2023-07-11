SUMMARY = "The official unofficial pip API"
DESCRIPTION = "The official unofficial pip API."
LICENSE = "Apache-2.0"

PV = "0.0.30"

RPM_NAME = "python310-pip-api-0.0.30-3.3.noarch.rpm"
RPM_HASH = "918e0338b9281969086ed00cfb61d7985f3c2ef2d4746424f8d98729a44e8f0724c35f7486bef75619d2843cf46ea325bceae36a69ba6299be151b6b6835ff61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pip-api \
python310-pip-api \
python3dist-pip-api"

RDEPENDS:${PN} += "python-abi \
python310-pip"

inherit rpm
