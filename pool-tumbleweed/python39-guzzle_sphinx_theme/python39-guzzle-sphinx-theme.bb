SUMMARY = "Sphinx theme used by Guzzle"
DESCRIPTION = "This package contains the python bindings of the Sphinx theme used by Guzzle."
LICENSE = "MIT & OFL-1.1"

PV = "0.7.11"

RPM_NAME = "python39-guzzle_sphinx_theme-0.7.11-3.1.noarch.rpm"
RPM_HASH = "73de3e846c8d106e23ce35546e63ee1e5855d9a411a913ddd88250ff8cc828a0e538240d4903c96b5f089dd067f0dbda722da824927e90f8dcc135dcf503a49a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-guzzle-sphinx-theme \
python39-guzzle-sphinx-theme \
python3dist-guzzle-sphinx-theme"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
