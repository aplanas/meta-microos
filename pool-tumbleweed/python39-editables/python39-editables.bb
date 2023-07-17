SUMMARY = "Editable installations"
DESCRIPTION = "A Python library for creating 'editable wheels' \
 \
This library supports the building of wheels which, when installed, will expose \
packages in a local directory on sys.path in 'editable mode'. In other words, \
changes to the package source will be reflected in the package visible to \
Python, without needing a reinstall."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python39-editables-0.4-1.1.noarch.rpm"
RPM_HASH = "8d24dbd91a3bcfa86374880745908b26cff52cd64bfc14e53d3f3f7164ebb699c4c1354ea6033c053d19e28417a6494a7a0dbb0e2234055f4d042b33ce0e70ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-editables \
python39-editables \
python3dist-editables"

RDEPENDS:${PN} += "python-abi"

inherit rpm
