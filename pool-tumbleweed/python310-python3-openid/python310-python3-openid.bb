SUMMARY = "OpenID support for Python"
DESCRIPTION = "This is a set of Python packages to support the use of \
the OpenID decentralized identity system in applications. \
Includes example code and support for a variety of storage back-ends."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python310-python3-openid-3.2.0-2.1.noarch.rpm"
RPM_HASH = "3c29cff70a087449b2979f3d80789527599091e71958de3e259ee12cc419463f3bbf8d1e8779a0582dffb81d603bc7a8bb49e47c10091c6ccc52ec585e78d401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python3-openid \
python310-python3-openid \
python3dist-python3-openid"

RDEPENDS:${PN} += "python-abi \
python310-defusedxml"

inherit rpm
