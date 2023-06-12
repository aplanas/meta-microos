SUMMARY = "Mock HTTPX with request patterns and response side effects"
DESCRIPTION = "Python library to mock httpx with request patterns and responses"
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "python311-respx-0.20.1-1.3.noarch.rpm"
RPM_HASH = "b154f8bfa5ede5a4e0a63db4187b0784c65f534c2b4c587c7f2e95fb737fd64425f39df9f6e80ea61bafb01c844e2f0423be2f74288daa8fce70ec9b9a14be94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(respx) \
python311-respx \
python3dist(respx)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
