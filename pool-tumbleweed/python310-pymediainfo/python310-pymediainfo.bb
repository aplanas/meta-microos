SUMMARY = "Python wrapper for the mediainfo library"
DESCRIPTION = "This module is a Python wrapper for the mediainfo library."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python310-pymediainfo-6.0.1-3.1.noarch.rpm"
RPM_HASH = "239d3af6b4bfbcf1e168468ffe83d7800acb4fe077fbfec57e0818cb6f60a08114326e25cd3651b570457f584e1a85d77696a2c22991b1a9d048a296feb48e1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymediainfo \
python310-pymediainfo \
python3dist-pymediainfo"

RDEPENDS:${PN} += "libmediainfo0 \
python-abi"

inherit rpm
