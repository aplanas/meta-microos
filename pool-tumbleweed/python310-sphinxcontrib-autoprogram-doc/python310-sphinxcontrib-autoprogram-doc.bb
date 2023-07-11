SUMMARY = "Documentation for sphinxcontrib-autoprogram"
DESCRIPTION = "This package contains the documentation for the package \
python-sphinxcontrib-autoprogram."
LICENSE = "BSD-2-Clause"

PV = "0.1.8"

RPM_NAME = "python310-sphinxcontrib-autoprogram-doc-0.1.8-2.3.noarch.rpm"
RPM_HASH = "5899ec52fe8e686b5b96c1857670bbcc1a2c0a1b792fef2d432ed076be631c7522ce02180042a7306d430e123e70f364fc4ee072fd893958f983ddc31ab419bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-sphinxcontrib-autoprogram-doc"

RDEPENDS:${PN} += "python310-Sphinx"

inherit rpm
