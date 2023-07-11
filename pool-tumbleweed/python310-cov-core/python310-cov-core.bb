SUMMARY = "Plugin core for use by pytest-cov, nose-cov and nose2-cov"
DESCRIPTION = "This is a lib package for use by pytest-cov, nose-cov and nose2-cov.  Unless your developing a \
coverage plugin for a test framework then you probably want one of those."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python310-cov-core-1.15.0-4.16.noarch.rpm"
RPM_HASH = "6473604516b058893d5ce032824723415711439fae0f197431a91e23272552f2b3a0337b5b19f4eb3de6b290ed84087881ecb3bd0a486b4878efe58f3bfe65e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cov-core \
python310-cov-core \
python3dist-cov-core"

RDEPENDS:${PN} += "python-abi \
python310-coverage"

inherit rpm
