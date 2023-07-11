SUMMARY = "Python unittest subTest() support and subtests fixture"
DESCRIPTION = "Python unittest subTest() support and subtests fixture."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-pytest-subtests-0.11.0-1.3.noarch.rpm"
RPM_HASH = "860df72bab2a6b49816dee29276092b3d96baae64510ddcc36d5b34ec4f0699ff45c432a201c6ff0ad8859f84332dfd398ce0b1de99b9bc11235132d01cae965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-subtests \
python310-pytest-subtests \
python3dist-pytest-subtests"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
