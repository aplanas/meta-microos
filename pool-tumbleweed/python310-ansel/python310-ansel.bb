SUMMARY = "Codecs for reading/writing documents in the ANSEL character set"
DESCRIPTION = "Codecs for reading/writing documents in the ANSEL character set."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-ansel-1.0.0-2.3.noarch.rpm"
RPM_HASH = "e17f737294d42826a090e0f66df4f31575c1b2607cce96aa58e8a1285c516f5d611a39bb0f0e3bd53bb09fd26714631e6e3fd406ee3a86e9a47e0074d0ad9e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ansel \
python310-ansel \
python3dist-ansel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
