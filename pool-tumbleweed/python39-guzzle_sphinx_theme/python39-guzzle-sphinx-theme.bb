SUMMARY = "Sphinx theme used by Guzzle"
DESCRIPTION = "This package contains the python bindings of the Sphinx theme used by Guzzle."
LICENSE = "MIT & OFL-1.1"

PV = "0.7.11"

RPM_NAME = "python39-guzzle_sphinx_theme-0.7.11-2.17.noarch.rpm"
RPM_HASH = "8a2e3d5d644a38ded5aec102c8ee084fddfed8b67650c83621183b9bdbc9581daf1aa2c753633913e0887242d7648f8d6a155d13ddc205afd9b3631c5f5e0c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-guzzle-sphinx-theme \
python39-guzzle-sphinx-theme \
python3dist-guzzle-sphinx-theme"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
