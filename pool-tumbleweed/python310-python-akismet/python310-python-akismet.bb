SUMMARY = "Akismet v1.1 module for Python"
DESCRIPTION = "Akismet v1.1 module for Python."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python310-python-akismet-0.4.3-1.3.noarch.rpm"
RPM_HASH = "d3c89ace601e0dbae011a5b3f7682d8a4c3bc4d218fcb10cb6048d4d16848beab75bb98f499c47a28094058ac819da775b5a1755f0993e725d71ca1d0323d724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-akismet \
python3.10dist-python-akismet \
python310-python-akismet \
python3dist-python-akismet"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
