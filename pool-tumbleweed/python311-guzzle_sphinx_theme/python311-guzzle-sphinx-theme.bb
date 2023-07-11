SUMMARY = "Sphinx theme used by Guzzle"
DESCRIPTION = "This package contains the python bindings of the Sphinx theme used by Guzzle."
LICENSE = "MIT & OFL-1.1"

PV = "0.7.11"

RPM_NAME = "python311-guzzle_sphinx_theme-0.7.11-2.17.noarch.rpm"
RPM_HASH = "7eaed1f29a4ef346f10e23002009d5d80bbd7f10b9a9f5a8a71a49cfe53a6ece3b365ad716de3d62c150e923dc54e84d2146f93cbb352002ef3964044bc78c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-guzzle-sphinx-theme \
python3.11dist-guzzle-sphinx-theme \
python311-guzzle-sphinx-theme \
python3dist-guzzle-sphinx-theme"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
