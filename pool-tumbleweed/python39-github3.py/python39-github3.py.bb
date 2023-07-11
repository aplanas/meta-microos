SUMMARY = "Python wrapper for the GitHub API"
DESCRIPTION = "Github3.py is wrapper for v3 of the GitHub API written in python."
LICENSE = "BSD-3-Clause"

PV = "4.0.1"

RPM_NAME = "python39-github3.py-4.0.1-1.1.noarch.rpm"
RPM_HASH = "9362ba6b199a7c09a4099ed5933ce8bd7e5c743c856a4454ba46a18b258af740e65593a37cef6d6c179c8a66bc3c252af56b1f993f3c2c163645c283167b65d7"
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
