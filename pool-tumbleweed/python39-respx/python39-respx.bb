SUMMARY = "Mock HTTPX with request patterns and response side effects"
DESCRIPTION = "Python library to mock httpx with request patterns and responses"
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "python39-respx-0.20.1-1.3.noarch.rpm"
RPM_HASH = "b929aa9977511bafe754a6e4c2c1dded98345b4df1356fab16d63f204a8d2565e2e617de0753464e5de56ef3bb244ed63fda25202fdc2b547c374d5c3d988a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(respx) \
python39-respx \
python3dist(respx)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
