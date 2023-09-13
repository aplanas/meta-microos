SUMMARY = "A library for rendering 'readme' descriptions"
DESCRIPTION = "Readme Renderer is a library that will safely render arbitrary ``README`` files \
into HTML. It is designed to be used in Warehouse to render the \
long_description for packages."
LICENSE = "Apache-2.0"

PV = "41.0"

RPM_NAME = "python311-readme_renderer-41.0-1.1.noarch.rpm"
RPM_HASH = "08e1e2f958bd716667e688e7ff49bf6f5d4850730fb169a8b37c8da8dedd314856645852131b54fdc54c93151744681db2ebf20cd731a0190a03b6d7ffcb9299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-readme-renderer \
python3.11dist-readme-renderer \
python311-readme-renderer \
python3dist-readme-renderer"

RDEPENDS:${PN} += "python-abi \
python311-Pygments \
python311-bleach \
python311-docutils"

inherit rpm
