SUMMARY = "One API for multiple git forges"
DESCRIPTION = "One API for multiple git forges."
LICENSE = "MIT"

PV = "0.45.0"

RPM_NAME = "python310-ogr-0.45.0-1.1.noarch.rpm"
RPM_HASH = "464a0b356f0fd19011714a190e2264adbc064c468bea2ab4a7c51ce6a8dcebabbca4bfe661f1847b21b5c392188eb7769bb93b1a2877f8a608c46fa74d4ff97f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ogr \
python310-ogr \
python3dist-ogr"

RDEPENDS:${PN} += "python-abi \
python310-Deprecated \
python310-GitPython \
python310-PyGithub \
python310-PyYAML \
python310-cryptography \
python310-python-gitlab \
python310-requests"

inherit rpm
