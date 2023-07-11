SUMMARY = "Docker API Client"
DESCRIPTION = "Provides the functionality needed to operate the pseudo-tty (PTY) allocated to \
a docker container, using the Python client."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python311-dockerpty-0.4.1-5.5.noarch.rpm"
RPM_HASH = "e66cbedb3fe7a95d514782eb2dc91f4a1621bafe744bbdd4b58f83407a1187cb605722a0460c2ed6af491e917785dbd024ff7e47cc0a1e567849b80c000272d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dockerpty \
python3.11dist-dockerpty \
python311-dockerpty \
python3dist-dockerpty"

RDEPENDS:${PN} += "python-abi \
python311-docker \
python311-six"

inherit rpm
