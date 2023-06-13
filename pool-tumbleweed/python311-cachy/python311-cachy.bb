SUMMARY = "A caching library for Python"
DESCRIPTION = "Cachy provides a caching library."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-cachy-0.3.0-5.1.noarch.rpm"
RPM_HASH = "7c8c0bd141e007ec24c850b379fddea5adca52f54b601804ddc66e2053dea063988c1940ab80a1bb9c9106b9f631e9e96151b942de2f878439524a748b0a9cdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cachy) \
python311-cachy \
python3dist(cachy)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
