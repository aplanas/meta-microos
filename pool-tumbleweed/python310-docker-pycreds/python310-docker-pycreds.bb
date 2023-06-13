SUMMARY = "Python bindings for the Docker credentials store API"
DESCRIPTION = "This package contains the Python bindings for the Docker credentials \
store API."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python310-docker-pycreds-0.4.0-2.1.noarch.rpm"
RPM_HASH = "06a8a380c5d1ae20fb4676e58003502eb83df7a35a4b7459b649f2c5906124a20c5ee7ea0fbe2539475717dd2e024b5e194e2504c95f59a42c13fad50ec33e5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docker-pycreds \
python3.10dist(docker-pycreds) \
python310-docker-pycreds \
python3dist(docker-pycreds)"

RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
