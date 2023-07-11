SUMMARY = "Mock HTTPX with request patterns and response side effects"
DESCRIPTION = "Python library to mock httpx with request patterns and responses"
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "python311-respx-0.20.1-2.1.noarch.rpm"
RPM_HASH = "64ee677e2c188cf7203a3b2c25c5d5d77d7da9d638305dbc9372b43cd1733a792d3702531f8d122154628d79bda801346b4bcd18d28c257d71f7bd9f7e19c13b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-respx \
python3.11dist-respx \
python311-respx \
python3dist-respx"

RDEPENDS:${PN} += "python-abi"

inherit rpm
