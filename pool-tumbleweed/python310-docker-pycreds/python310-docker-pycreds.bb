SUMMARY = "Python bindings for the Docker credentials store API"
DESCRIPTION = "This package contains the Python bindings for the Docker credentials \
store API."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python310-docker-pycreds-0.4.0-2.3.noarch.rpm"
RPM_HASH = "9056e7788d0a89012d9872a8c11327535fdd5963868d8429e182e29731f3586bbb0be6f4e39e570260cbe70411aac020e491d60840252f1d13b22218a29e3037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-docker-pycreds \
python310-docker-pycreds \
python3dist-docker-pycreds"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
