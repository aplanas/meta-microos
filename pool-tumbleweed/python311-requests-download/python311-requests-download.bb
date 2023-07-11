SUMMARY = "Python module to download and save files using python-requests"
DESCRIPTION = "This module downloads files using requests and saves them to a target path."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-requests-download-0.1.2-3.1.noarch.rpm"
RPM_HASH = "2570e55fb0bb970d18bc072d6057a91907e0cdbac03976b7f977b9acf9836e87d0bc23c9a875e5b3c07f5540f768142bc1b7da34909ac4247733df90381c1eaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-download \
python3.11dist-requests-download \
python311-requests-download \
python3dist-requests-download"

RDEPENDS:${PN} += "python-abi \
python311-progressbar \
python311-requests"

inherit rpm
