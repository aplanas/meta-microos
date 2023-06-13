SUMMARY = "The official unofficial pip API"
DESCRIPTION = "The official unofficial pip API."
LICENSE = "Apache-2.0"

PV = "0.0.30"

RPM_NAME = "python311-pip-api-0.0.30-2.1.noarch.rpm"
RPM_HASH = "2c1da15a70d61de93f8cff71d5102646e2a0fa576507d4b796750aa28bd394f2100ad74f2cc52aa0b04245ec5e14e2c705361496711cc93e443dbbce1d1bb732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pip-api) \
python311-pip-api \
python3dist(pip-api)"

RDEPENDS:${PN} += "python(abi) \
python311-pip"

inherit rpm
