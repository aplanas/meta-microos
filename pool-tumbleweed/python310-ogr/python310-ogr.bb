SUMMARY = "One API for multiple git forges"
DESCRIPTION = "One API for multiple git forges."
LICENSE = "MIT"

PV = "0.45.0"

RPM_NAME = "python310-ogr-0.45.0-2.1.noarch.rpm"
RPM_HASH = "f47ffde358b67e380a1996c6c7d3157270b5227ba3f8878052fb7522c709d7110a651a2f72fcd8dcdb752dd01c2fa8064eecafa087ce79f2bccce18577e21b23"
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
