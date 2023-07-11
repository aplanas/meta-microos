SUMMARY = "Tabbed views for Sphinx"
DESCRIPTION = "Create tabbed content in Sphinx documentation when building HTML."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "python39-sphinx-tabs-3.4.1-2.3.noarch.rpm"
RPM_HASH = "1decf7050621a1c8df6da51a53b4d146deea0c559342c9603fd80a5a5c1dfeb08c9a1f6bb6a94861c0b303b52d00f70f6840a0823b1149a635474a972653edd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-tabs \
python39-sphinx-tabs \
python3dist-sphinx-tabs"

RDEPENDS:${PN} += "python-abi \
python39-Pygments \
python39-Sphinx \
python39-docutils"

inherit rpm
