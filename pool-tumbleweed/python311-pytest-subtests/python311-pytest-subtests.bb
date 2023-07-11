SUMMARY = "Python unittest subTest() support and subtests fixture"
DESCRIPTION = "Python unittest subTest() support and subtests fixture."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-pytest-subtests-0.11.0-1.3.noarch.rpm"
RPM_HASH = "ee62edfb5b7dd90c92e09b0ddd7a373dab99fa77b4eea25c2da912209445744a807a6f0be88ec29d2d15094c3f0b3d11d572220a866a79154b322f65be8b2e97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-subtests \
python3.11dist-pytest-subtests \
python311-pytest-subtests \
python3dist-pytest-subtests"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
