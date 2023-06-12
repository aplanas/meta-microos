SUMMARY = "Python wrapper for Subscene subtitle database"
DESCRIPTION = "Exposes the Subscene subtitle database API to Python."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python39-subscene-api-2.0.0-2.15.noarch.rpm"
RPM_HASH = "f630a460833ee76a43e22844252ce7951ac059ef1d53a2f5d3de52fb08562087dcd51a799d7426fe40b63fb152eb19998c6c83baaa4077f82df0bc250ea2057b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(subscene-api) \
python39-subscene-api \
python3dist(subscene-api)"
RDEPENDS:${PN} += "python(abi) \
python39-beautifulsoup4"

inherit rpm
