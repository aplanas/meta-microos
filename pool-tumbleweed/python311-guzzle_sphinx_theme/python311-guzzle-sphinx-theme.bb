SUMMARY = "Sphinx theme used by Guzzle"
DESCRIPTION = "This package contains the python bindings of the Sphinx theme used by Guzzle."
LICENSE = "MIT & OFL-1.1"

PV = "0.7.11"

RPM_NAME = "python311-guzzle_sphinx_theme-0.7.11-3.1.noarch.rpm"
RPM_HASH = "f8764c3275a111475337ddc2dc39d86e53683f0ecd1a87454222fe7d5af88b525bbd329e56beae89ad36d3156708a7b1801dd4e4ee920a114063750c42492a45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-guzzle-sphinx-theme \
python3.11dist-guzzle-sphinx-theme \
python311-guzzle-sphinx-theme \
python3dist-guzzle-sphinx-theme"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
