SUMMARY = "A library for rendering 'readme' descriptions"
DESCRIPTION = "Readme Renderer is a library that will safely render arbitrary ``README`` files \
into HTML. It is designed to be used in Warehouse to render the \
long_description for packages."
LICENSE = "Apache-2.0"

PV = "41.0"

RPM_NAME = "python39-readme_renderer-41.0-1.1.noarch.rpm"
RPM_HASH = "7973a736b6563aa2dcff55c4b6e84a5454f317f50e3e32f4e0f6cbfb43a99bc04c3de84bd116d65618add0e389c57e0336faa46b35d182b64f37c1839d2776d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-readme-renderer \
python39-readme-renderer \
python3dist-readme-renderer"

RDEPENDS:${PN} += "python-abi \
python39-Pygments \
python39-bleach \
python39-docutils"

inherit rpm
