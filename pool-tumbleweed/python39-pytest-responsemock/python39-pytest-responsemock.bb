SUMMARY = "Simplified requests calls mocking for pytest"
DESCRIPTION = "Simplified requests calls mocking for pytest."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python39-pytest-responsemock-1.1.1-1.5.noarch.rpm"
RPM_HASH = "ae0542f86154484885348239d3810986726e6876ac40ad28e55569e7ba484d3ad395a69d7954e9a8d990f4ea387ad88f8d931ba64e613c89b55d284b54ca260c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-responsemock) \
python39-pytest-responsemock \
python3dist(pytest-responsemock)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest \
python39-responses"

inherit rpm
