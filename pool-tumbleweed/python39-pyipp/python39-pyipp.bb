SUMMARY = "Asynchronous Python client for Internet Printing Protocol (IPP)"
DESCRIPTION = "Asynchronous Python client for Internet Printing Protocol (IPP)."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-pyipp-0.11.0-1.11.noarch.rpm"
RPM_HASH = "920789e6bfccee4aa51f762d216322bcead6bb0bec129c21126e50d2c67a198f3fa230ea14bc68bc17bde000d1634b4472b3d1cf17c9ed9ab897b9c19600a376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyipp \
python39-pyipp \
python3dist-pyipp"

RDEPENDS:${PN} += "python-abi \
python39-aiohttp \
python39-deepmerge \
python39-yarl"

inherit rpm
