SUMMARY = "Python package to work with Document Object Identifier (doi)"
DESCRIPTION = "Python package to work with Document Object Identifier (doi)"
LICENSE = "GPL-3.0-only"

PV = "0.2.0"

RPM_NAME = "python310-python-doi-0.2.0-1.3.noarch.rpm"
RPM_HASH = "c2433482c3f31d144bde8811e08f6e17924954398fb865811e6e7b9d25b23664432deb2dedd34ab4d490e921846a5e5c143a30ed2869a18b9b8e0af173125fbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-doi \
python3.10dist(python-doi) \
python310-python-doi \
python3dist(python-doi)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
