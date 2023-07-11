SUMMARY = "Asynchronous Python client for Internet Printing Protocol (IPP)"
DESCRIPTION = "Asynchronous Python client for Internet Printing Protocol (IPP)."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-pyipp-0.11.0-1.11.noarch.rpm"
RPM_HASH = "9f93e9842c9d4ec42bbc7795515546b184426521a5c37e855b7ce19b55849dc96c8b6d6f3bb96da604ad7c7b4c9830a6103e2b72e51f57f3c27b4fbe5dc7cef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyipp \
python3.11dist-pyipp \
python311-pyipp \
python3dist-pyipp"

RDEPENDS:${PN} += "python-abi \
python311-aiohttp \
python311-deepmerge \
python311-yarl"

inherit rpm
