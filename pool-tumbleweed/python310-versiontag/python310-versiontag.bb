SUMMARY = "Python git tag based version numbers"
DESCRIPTION = "Simple git tag based version numbers."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python310-versiontag-1.2.0-2.8.noarch.rpm"
RPM_HASH = "ddb10928ecd9b025daa2eaa9d4f55b31b5e1ebc90e8ba6554a598b23422582a2609cce1483d2e06a72ddf8671f5a4e267480f7c6aae6bd809cdfea2e7f1dca70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versiontag \
python3.10dist(versiontag) \
python310-versiontag \
python3dist(versiontag)"

RDEPENDS:${PN} += "git-core \
python(abi)"

inherit rpm
