SUMMARY = "Add inline tabbed content to your Sphinx documentation"
DESCRIPTION = "Add inline tabbed content to your Sphinx documentation."
LICENSE = "MIT"

PV = "2023.4.21"

RPM_NAME = "python310-sphinx-inline-tabs-2023.4.21-1.3.noarch.rpm"
RPM_HASH = "286fdfbfe4b71e503fd9707c30eb353e70c5227f739466fbe15bae1dde59f328b891787ef445274b5423bbabe7e64a8f87d840eacacc81a9df4f6fca0a04ae72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-inline-tabs \
python310-sphinx-inline-tabs \
python3dist-sphinx-inline-tabs"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
