SUMMARY = "Describe-style plugin for pytest"
DESCRIPTION = "Describe-style plugin for pytest."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-pytest-describe-2.1.0-1.3.noarch.rpm"
RPM_HASH = "908e003d64aca2dc9239dcb58e500056b3baa2a8423a974d4eaf46b1d56c59a143bc543af00bb0ba111726053a5fc321519e4391480561c6127abaee2245399b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-describe \
python39-pytest-describe \
python3dist-pytest-describe"

RDEPENDS:${PN} += "python-abi \
python39-py \
python39-pytest"

inherit rpm
