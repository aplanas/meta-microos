SUMMARY = "Editable installations"
DESCRIPTION = "A Python library for creating 'editable wheels' \
 \
This library supports the building of wheels which, when installed, will expose \
packages in a local directory on sys.path in 'editable mode'. In other words, \
changes to the package source will be reflected in the package visible to \
Python, without needing a reinstall."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python310-editables-0.5-1.1.noarch.rpm"
RPM_HASH = "43f80e196c018d3396dd65ce84649495575169ba25974f439665cbc77038b10ad2555b125d962cc5ac9193ef723fdb8e1b7f5ed8fd8ad37d4ea39485aba6efea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-editables \
python310-editables \
python3dist-editables"

RDEPENDS:${PN} += "python-abi"

inherit rpm
