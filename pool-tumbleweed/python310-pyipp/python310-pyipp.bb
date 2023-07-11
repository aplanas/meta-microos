SUMMARY = "Asynchronous Python client for Internet Printing Protocol (IPP)"
DESCRIPTION = "Asynchronous Python client for Internet Printing Protocol (IPP)."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-pyipp-0.11.0-1.11.noarch.rpm"
RPM_HASH = "b4fe81ddbea088f4e01955a27be3909a233eb3ec6b2b93570f7eb2ec2ab7973bc56a237bb35715da4dbc444f07978cd069aa6e6879e234258e73243f03439c72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyipp \
python310-pyipp \
python3dist-pyipp"

RDEPENDS:${PN} += "python-abi \
python310-aiohttp \
python310-deepmerge \
python310-yarl"

inherit rpm
