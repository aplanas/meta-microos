SUMMARY = "A library for rendering 'readme' descriptions"
DESCRIPTION = "Readme Renderer is a library that will safely render arbitrary ``README`` files \
into HTML. It is designed to be used in Warehouse to render the \
long_description for packages."
LICENSE = "Apache-2.0"

PV = "37.3"

RPM_NAME = "python311-readme_renderer-37.3-3.1.noarch.rpm"
RPM_HASH = "118e2ec94f09920c115024dc83de867ed2180b8f6e47e9ff669aef1da1164570002636b2e80827c1f4619b30abbc1571c74840f31826e56eb19ffaa0c8fb5e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(readme-renderer) \
python311-readme_renderer \
python3dist(readme-renderer)"
RDEPENDS:${PN} += "python(abi) \
python311-Pygments \
python311-bleach \
python311-docutils"

inherit rpm
