SUMMARY = "Static file serving for WSGI applications"
DESCRIPTION = "Static file serving for WSGI applications."
LICENSE = "MIT"

PV = "6.2.0"

RPM_NAME = "python310-whitenoise-6.2.0-2.1.noarch.rpm"
RPM_HASH = "08824e7cc300ba5cdd4ccbba0dac3f82fab66bd092f7e065a908d940e0c9e06f02d84859e2affeb39d88bc5cb2a7252c18b86d2a269bdda0a7320b3d95afc339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-whitenoise \
python310-whitenoise \
python3dist-whitenoise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
