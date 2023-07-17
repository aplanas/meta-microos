SUMMARY = "Python wrapper for the Kismet REST interface"
DESCRIPTION = "Simplified Python API for the Kismet REST interface."
LICENSE = "GPL-2.0"

PV = "2019.05.02"

RPM_NAME = "python311-kismet-rest-2019.05.02-2.1.noarch.rpm"
RPM_HASH = "8990a6e0af497722387988f5bdfb4eac7905295a857de9ec11a8e03c5b9632b9edb5aed629a7bd139b66ea080053aa71204a1469bb2db70a555822786e9bd626"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kismet-rest \
python3.11dist-kismet-rest \
python311-kismet-rest \
python3dist-kismet-rest"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
