SUMMARY = "Docker API Client"
DESCRIPTION = "Provides the functionality needed to operate the pseudo-tty (PTY) allocated to \
a docker container, using the Python client."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python39-dockerpty-0.4.1-5.5.noarch.rpm"
RPM_HASH = "d8388de91af7e1c62a88575607cae34be8efdd09904529f2e0887f1e80f0159e9155fccb142ad4e40a160fb31ef544bea49a73b66cb9dc7f5c32c3951730505e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dockerpty \
python39-dockerpty \
python3dist-dockerpty"

RDEPENDS:${PN} += "python-abi \
python39-docker \
python39-six"

inherit rpm
