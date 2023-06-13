SUMMARY = "Sphinx theme used by Guzzle"
DESCRIPTION = "This package contains the python bindings of the Sphinx theme used by Guzzle."
LICENSE = "MIT & OFL-1.1"

PV = "0.7.11"

RPM_NAME = "python39-guzzle_sphinx_theme-0.7.11-2.15.noarch.rpm"
RPM_HASH = "acc2a38602e9a38f2708d9161ed1fb72d37272ec2ba932bda922b3c772f91ae94bc259ba1942077e2d144f462d3e5fe424c6a49f8f50288d0b6fcfc53797b56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(guzzle-sphinx-theme) \
python39-guzzle_sphinx_theme \
python3dist(guzzle-sphinx-theme)"

RDEPENDS:${PN} += "python(abi) \
python39-Sphinx"

inherit rpm
