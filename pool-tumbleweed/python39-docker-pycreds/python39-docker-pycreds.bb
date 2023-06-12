SUMMARY = "Python bindings for the Docker credentials store API"
DESCRIPTION = "This package contains the Python bindings for the Docker credentials \
store API."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python39-docker-pycreds-0.4.0-2.1.noarch.rpm"
RPM_HASH = "d1188e232ec6cf83b2fa4d3188602648240b96c9020536b28eba105684db380f1b3d7e9f48bc64ac8547d87c12d3b5f1bd5879a307182adb8883cb6902eac0db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(docker-pycreds) \
python39-docker-pycreds \
python3dist(docker-pycreds)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
