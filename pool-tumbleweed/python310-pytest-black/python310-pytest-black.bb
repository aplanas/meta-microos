SUMMARY = "Black format checking plugin for pytest"
DESCRIPTION = "A pytest plugin to enable format checking with black."
LICENSE = "MIT"

PV = "0.3.12"

RPM_NAME = "python310-pytest-black-0.3.12-2.12.noarch.rpm"
RPM_HASH = "05f61e4761154788da1942eec89146a61d281d51af42034401b4cdf67f1fe3a6cffcf1a38f2ed4c6088ec88b886d67282451c75669f59518db843cb85ff19afe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-black \
python310-pytest-black \
python3dist-pytest-black"

RDEPENDS:${PN} += "python-abi \
python310-black \
python310-pytest \
python310-toml"

inherit rpm
