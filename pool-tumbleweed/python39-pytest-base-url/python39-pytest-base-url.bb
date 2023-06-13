SUMMARY = "Pytest plugin for URL based testing"
DESCRIPTION = "pytest plugin for URL based testing."
LICENSE = "MPL-2.0"

PV = "2.0.0"

RPM_NAME = "python39-pytest-base-url-2.0.0-1.9.noarch.rpm"
RPM_HASH = "c810c1396a27b35eea5121aef9a60312430cb557e8898bb42b2d1871d603b599dd9e49915f1213207b01e2d9ba48e5c1e5865785f6c9f5dc50e21ef6893f0d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-base-url) \
python39-pytest-base-url \
python3dist(pytest-base-url)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest \
python39-requests"

inherit rpm
