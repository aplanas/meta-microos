SUMMARY = "Sphinx theme used by Guzzle"
DESCRIPTION = "This package contains the python bindings of the Sphinx theme used by Guzzle."
LICENSE = "MIT & OFL-1.1"

PV = "0.7.11"

RPM_NAME = "python310-guzzle_sphinx_theme-0.7.11-3.1.noarch.rpm"
RPM_HASH = "44dc1992075c2e5800ce4a75efb533c9bb1afbe04c82bc42db13c5bdee7d5b941d6e1974dc94daa3556ff2349d3e9e180e666084dd974605386681c7c190f812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-guzzle-sphinx-theme \
python310-guzzle-sphinx-theme \
python3dist-guzzle-sphinx-theme"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
