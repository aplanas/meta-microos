SUMMARY = "Static file serving for WSGI applications"
DESCRIPTION = "Static file serving for WSGI applications."
LICENSE = "MIT"

PV = "6.2.0"

RPM_NAME = "python39-whitenoise-6.2.0-1.3.noarch.rpm"
RPM_HASH = "c13f5ee1e1e146fdfbbcf1d1d16352f35ba9e9b5d7ccdce9030e9b12dc81a0bf9f7209a2dd8789559302405840e34b2cc0b4328b6ff6b859307dd2068fdd7a5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-whitenoise \
python39-whitenoise \
python3dist-whitenoise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
