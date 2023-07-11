SUMMARY = "Determine if shell has a light or dark background"
DESCRIPTION = "A python module to determine if a shell has a light or dark background."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python311-term-background-1.0.1-1.8.noarch.rpm"
RPM_HASH = "87807ff58a93e6a04d27709188b2f6b116d4966f4a2f94639b5c866d9cd33c8fd15284fd82fcf23a28eca3f43056637929050fdd54e9a15cc0c9f59566319364"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-term-background \
python3.11dist-term-background \
python311-term-background \
python3dist-term-background"

RDEPENDS:${PN} += "python-abi"

inherit rpm
