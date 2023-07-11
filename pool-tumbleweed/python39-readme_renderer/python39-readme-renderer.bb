SUMMARY = "A library for rendering 'readme' descriptions"
DESCRIPTION = "Readme Renderer is a library that will safely render arbitrary ``README`` files \
into HTML. It is designed to be used in Warehouse to render the \
long_description for packages."
LICENSE = "Apache-2.0"

PV = "37.3"

RPM_NAME = "python39-readme_renderer-37.3-3.3.noarch.rpm"
RPM_HASH = "e7c77213335fd09c83341c2357f7989c6d2a89a82fe7effab39d23d33e33f2df189aa572854e68cd357e2bcb4aa368acae4a8fa390fb90b3e17c5482f6fb63e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-readme-renderer \
python39-readme-renderer \
python3dist-readme-renderer"

RDEPENDS:${PN} += "python-abi \
python39-Pygments \
python39-bleach \
python39-docutils"

inherit rpm
