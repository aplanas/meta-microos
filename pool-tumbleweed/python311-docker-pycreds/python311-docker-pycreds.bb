SUMMARY = "Python bindings for the Docker credentials store API"
DESCRIPTION = "This package contains the Python bindings for the Docker credentials \
store API."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python311-docker-pycreds-0.4.0-2.1.noarch.rpm"
RPM_HASH = "3296b99991d842b611d4d9c7df15a3d3ad23100f1be732444840c1885a6ed82146961eb2652b4574a3d96bbf123298418f4f5831a07f8bc93c4617e54d4e59b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(docker-pycreds) \
python311-docker-pycreds \
python3dist(docker-pycreds)"
RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
