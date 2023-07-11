SUMMARY = "Python wrapper for the Kismet REST interface"
DESCRIPTION = "Simplified Python API for the Kismet REST interface."
LICENSE = "GPL-2.0"

PV = "2019.05.02"

RPM_NAME = "python311-kismet-rest-2019.05.02-1.15.noarch.rpm"
RPM_HASH = "3153da914d80c2d981309780bc53028c5e793b3875d51e70d30fc68e850ef97fb492e8a1d7d6a650a4d4b6ec712632d5c9c6616c5870287e0b95416c65b89562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kismet-rest \
python3.11dist-kismet-rest \
python311-kismet-rest \
python3dist-kismet-rest"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
