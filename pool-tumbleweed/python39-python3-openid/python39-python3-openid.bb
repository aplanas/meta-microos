SUMMARY = "OpenID support for Python"
DESCRIPTION = "This is a set of Python packages to support the use of \
the OpenID decentralized identity system in applications. \
Includes example code and support for a variety of storage back-ends."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python39-python3-openid-3.2.0-2.1.noarch.rpm"
RPM_HASH = "737bf43080ed0da01b47083e8c2d59b714cb83c01a79118505e3900725eed1e16678e86a7b1c2bcdabf95e5baceb0ce6a4469340c7ea36f66e4ae1f769a3e1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python3-openid \
python39-python3-openid \
python3dist-python3-openid"

RDEPENDS:${PN} += "python-abi \
python39-defusedxml"

inherit rpm
