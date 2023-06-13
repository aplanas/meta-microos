SUMMARY = "CLA extension for python-openid"
DESCRIPTION = "CLA extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "python310-python-openid-cla-1.2-1.18.noarch.rpm"
RPM_HASH = "44637f220d8d4297216daec1fe2aa049c16a8f9d8b76e70b22954781b83274a03c0ba5ad41517e0a1bd19580549bbc9c393ab53a805ac3e65b7ea8e327fddb1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-openid-cla \
python3.10dist(python-openid-cla) \
python310-python-openid-cla \
python3dist(python-openid-cla)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
