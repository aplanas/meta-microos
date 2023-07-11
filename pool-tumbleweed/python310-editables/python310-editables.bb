SUMMARY = "Editable installations"
DESCRIPTION = "A Python library for creating 'editable wheels' \
 \
This library supports the building of wheels which, when installed, will expose \
packages in a local directory on sys.path in 'editable mode'. In other words, \
changes to the package source will be reflected in the package visible to \
Python, without needing a reinstall."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "python310-editables-0.3-2.2.noarch.rpm"
RPM_HASH = "d1ddfc4190bd1c940a5d9e788b2406f872a5a8977cae2ffdeeebbc020a91f7844b23ed48a16d62c9ed3679e6dc348b1fe2c69bb4fe5cd94726e506cb156a7b5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-editables \
python310-editables \
python3dist-editables"

RDEPENDS:${PN} += "python-abi"

inherit rpm
