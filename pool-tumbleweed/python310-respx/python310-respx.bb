SUMMARY = "Mock HTTPX with request patterns and response side effects"
DESCRIPTION = "Python library to mock httpx with request patterns and responses"
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "python310-respx-0.20.1-1.3.noarch.rpm"
RPM_HASH = "fbecc2ae8c37a420009d7925dc211a6faa1063cef327e6cc675aea6f61c355bf29d150ad125b9eeb7b831bc456e64ca31af624cc47adc7f0f1b2f0eb303b023e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-respx \
python3.10dist(respx) \
python310-respx \
python3dist(respx)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
