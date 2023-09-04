SUMMARY = "Static file serving for WSGI applications"
DESCRIPTION = "Static file serving for WSGI applications."
LICENSE = "MIT"

PV = "6.2.0"

RPM_NAME = "python311-whitenoise-6.2.0-2.1.noarch.rpm"
RPM_HASH = "0c9bedfdf8f746edb733044b1faa279ad2b8818ee51371a4f8553c26a3f1a3bdfb724d1176181d5e13fa08adbbcb6fabe18148ee22a59ebc6713b48d1a948a6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whitenoise \
python3.11dist-whitenoise \
python311-whitenoise \
python3dist-whitenoise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
