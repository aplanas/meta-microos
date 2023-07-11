SUMMARY = "Editable installations"
DESCRIPTION = "A Python library for creating 'editable wheels' \
 \
This library supports the building of wheels which, when installed, will expose \
packages in a local directory on sys.path in 'editable mode'. In other words, \
changes to the package source will be reflected in the package visible to \
Python, without needing a reinstall."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "python39-editables-0.3-2.2.noarch.rpm"
RPM_HASH = "1d8db2161a751c4b351a8b64418518e1494aec778fc31296543ab88b558f68795118f603d78c5016a9ecd477673e5a9848cb238c2d21ad344ff89c8645fc69ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-editables \
python39-editables \
python3dist-editables"

RDEPENDS:${PN} += "python-abi"

inherit rpm
