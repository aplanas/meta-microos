SUMMARY = "Python wrapper for the GitHub API"
DESCRIPTION = "Github3.py is wrapper for v3 of the GitHub API written in python."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python39-github3.py-3.2.0-1.5.noarch.rpm"
RPM_HASH = "748ee8082a0039c3ba5d551f343f9630ee9dfdcc85b1c061a3f41e87601dd60d4d1a6de3a710eb0c52b6e1615888d8e71dfe26c824972520d6bede1f023f2a1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-github3.py \
python39-github3.py \
python3dist-github3.py"

RDEPENDS:${PN} += "python-abi \
python39-PyJWT \
python39-jwcrypto \
python39-python-dateutil \
python39-requests \
python39-uritemplate"

inherit rpm
