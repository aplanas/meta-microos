SUMMARY = "URL normalization for Python"
DESCRIPTION = "URL normalization for Python."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python310-url-normalize-1.4.3-2.3.noarch.rpm"
RPM_HASH = "f7477dd967ffc743c1ab8d09f07f8b333e247329b3049dc11a010d1e40524ab5ea9e7a0433cb5d5b97406353d27c3f6635ea29544f55a76ac3f65c9586b014ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-url-normalize \
python310-url-normalize \
python3dist-url-normalize"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
