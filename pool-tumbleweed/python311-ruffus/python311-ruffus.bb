SUMMARY = "Python computational pipeline management package"
DESCRIPTION = "The Ruffus module is a way to add support for running computational pipelines."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python311-ruffus-2.8.4-2.7.noarch.rpm"
RPM_HASH = "ce74213d0f2cb93deb51ee693cd2710826037ae966dac4e19e98dbecefc22c81786b6901965d709e1eaa16e2a8f9390be1ef71410ae50b915514f294b1818143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruffus \
python3.11dist-ruffus \
python311-ruffus \
python3dist-ruffus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
