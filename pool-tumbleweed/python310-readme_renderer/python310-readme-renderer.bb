SUMMARY = "A library for rendering 'readme' descriptions"
DESCRIPTION = "Readme Renderer is a library that will safely render arbitrary ``README`` files \
into HTML. It is designed to be used in Warehouse to render the \
long_description for packages."
LICENSE = "Apache-2.0"

PV = "37.3"

RPM_NAME = "python310-readme_renderer-37.3-3.3.noarch.rpm"
RPM_HASH = "dee6a66139d2063bb82c3810bc5f2547a91774e48d4f82be52890d100e84d82abd351b884d9556cc37b66d2aa75e4193ad45713259a665c4996f1a2fae5c3382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-readme-renderer \
python310-readme-renderer \
python3dist-readme-renderer"

RDEPENDS:${PN} += "python-abi \
python310-Pygments \
python310-bleach \
python310-docutils"

inherit rpm
