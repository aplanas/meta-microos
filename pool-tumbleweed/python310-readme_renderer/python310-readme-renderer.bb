SUMMARY = "A library for rendering 'readme' descriptions"
DESCRIPTION = "Readme Renderer is a library that will safely render arbitrary ``README`` files \
into HTML. It is designed to be used in Warehouse to render the \
long_description for packages."
LICENSE = "Apache-2.0"

PV = "41.0"

RPM_NAME = "python310-readme_renderer-41.0-1.1.noarch.rpm"
RPM_HASH = "492954e1b89ed92a87e7bd98143bd1008f8db9855089224e1543decb0387c723f383218186ac081e3f071ee6a315df9352386e90ab46b4d29d9d54779b782d2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-readme-renderer \
python310-readme-renderer \
python3dist-readme-renderer"

RDEPENDS:${PN} += "python-abi \
python310-Pygments \
python310-bleach \
python310-docutils"

inherit rpm
