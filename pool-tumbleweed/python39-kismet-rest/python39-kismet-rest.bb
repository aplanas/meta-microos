SUMMARY = "Python wrapper for the Kismet REST interface"
DESCRIPTION = "Simplified Python API for the Kismet REST interface."
LICENSE = "GPL-2.0"

PV = "2019.05.02"

RPM_NAME = "python39-kismet-rest-2019.05.02-1.15.noarch.rpm"
RPM_HASH = "b53a6795415cfbe9f88064a1049b331372f42d4ed011986d8e5bb0e33b6b4974870b4659b566b2496409d8bbe7e84e6e6307da1bfb47d5d44cab11dd0ff47aea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-kismet-rest \
python39-kismet-rest \
python3dist-kismet-rest"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
