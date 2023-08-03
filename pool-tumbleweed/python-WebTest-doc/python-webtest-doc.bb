SUMMARY = "Helper to test WSGI applications - Documentation"
DESCRIPTION = "This package contains documentation files for python-WebTest."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python-WebTest-doc-3.0.0-5.1.noarch.rpm"
RPM_HASH = "4299b253e9e3bc90cf80a7fce9804ee1b8364371aaeb178e3c79321764732e6856ab8d26eea3b1d7a45621bc69632ba8b2c20fdb53fe167c86740465bcff6f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-WebTest-doc \
python310-WebTest-doc \
python311-WebTest-doc \
python39-WebTest-doc"

RDEPENDS:${PN} += ""

inherit rpm
