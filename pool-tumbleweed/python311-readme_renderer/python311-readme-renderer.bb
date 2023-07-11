SUMMARY = "A library for rendering 'readme' descriptions"
DESCRIPTION = "Readme Renderer is a library that will safely render arbitrary ``README`` files \
into HTML. It is designed to be used in Warehouse to render the \
long_description for packages."
LICENSE = "Apache-2.0"

PV = "37.3"

RPM_NAME = "python311-readme_renderer-37.3-3.3.noarch.rpm"
RPM_HASH = "ba68034008a5bfe53516d8b5bbbcbb17903723ccb0315d902d6c61b3bd940342fc3c77687b266cc0129eb200bba8a877786ba0d2569c562452a19dd7cfafd1e2"
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
