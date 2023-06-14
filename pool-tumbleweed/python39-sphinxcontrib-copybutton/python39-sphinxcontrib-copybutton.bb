SUMMARY = "Add a copy button to each of your code cells"
DESCRIPTION = "Add a copy button to each of your code cells."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python39-sphinxcontrib-copybutton-0.5.1-1.3.noarch.rpm"
RPM_HASH = "c0a6cc2d3bd6656ed5b69470fbda2e7302346da8b5442afd4eabf494e0d1622215983d243c6afdc6340d1ecb9d7dc0a253602917df16446c3d1c39b9d3c1e4e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-copybutton \
python39-sphinxcontrib-copybutton \
python3dist-sphinx-copybutton"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
