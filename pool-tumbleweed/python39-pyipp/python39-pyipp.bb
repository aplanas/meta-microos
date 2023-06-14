SUMMARY = "Asynchronous Python client for Internet Printing Protocol (IPP)"
DESCRIPTION = "Asynchronous Python client for Internet Printing Protocol (IPP)."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-pyipp-0.11.0-1.9.noarch.rpm"
RPM_HASH = "57af565ddbdb01f57fc0c6e69c699159fbb8213cfa06b962ec745e90c5f57fa5ff83d6e6a387a63d0929bc8e118a7468e725153f5a38590542b410d2525716ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyipp \
python39-pyipp \
python3dist-pyipp"

RDEPENDS:${PN} += "python-abi \
python39-aiohttp \
python39-deepmerge \
python39-yarl"

inherit rpm
