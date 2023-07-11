SUMMARY = "Python bindings for the Docker credentials store API"
DESCRIPTION = "This package contains the Python bindings for the Docker credentials \
store API."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python311-docker-pycreds-0.4.0-2.3.noarch.rpm"
RPM_HASH = "a7f5b0d1c7cb09adbc20d2a6917ba0349b2dd12e68ef7f3c748063264c4e9e87156b3bcc73b45925202a63465d080a20f96eb941abe16151f477cf156c6de3cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docker-pycreds \
python3.11dist-docker-pycreds \
python311-docker-pycreds \
python3dist-docker-pycreds"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
