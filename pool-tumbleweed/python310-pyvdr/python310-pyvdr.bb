SUMMARY = "Python library for accessing a Linux VDR via SVDRP"
DESCRIPTION = "Python library for accessing a Linux VDR via SVDRP."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python310-pyvdr-0.3.1-1.8.noarch.rpm"
RPM_HASH = "86a7878d7d981a91d35ce5c4c682a5fab2f9a7ea4dde0f4487424d60a5c305fd0731144a18f30666da81030b6343222181e5320e6a5fb15bdaea9dc1d25263bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyvdr \
python3.10dist(pyvdr) \
python310-pyvdr \
python3dist(pyvdr)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
