SUMMARY = "Python git tag based version numbers"
DESCRIPTION = "Simple git tag based version numbers."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python310-versiontag-1.2.0-2.9.noarch.rpm"
RPM_HASH = "60f6287fec910a6744b1af14875905dd7b50e13c27be06685f289385dcaec65ea7cf4f9790226b3492f229b3c49cc8a304871d52e31fa35d3e69868f1dd0e2b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-versiontag \
python310-versiontag \
python3dist-versiontag"

RDEPENDS:${PN} += "git-core \
python-abi"

inherit rpm
