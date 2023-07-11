SUMMARY = "A complete OpenID Connect implementation in Python"
DESCRIPTION = "This is a complete Python implementation of OpenID Connect as specified in \
the OpenID Connect Core specification. As a side effect, this is a complete \
implementation of OAuth2.0 too."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python39-oic-1.5.0-1.7.noarch.rpm"
RPM_HASH = "cf3545787c66b4336bf7c0e1991ed7a3c09add138cb9c7b6cd9cbad3c7d237500b28e666f09b00df9175fd71027a0e3c8638d19cafa07027d6945e526fc49dec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-oic \
python39-oic \
python3dist-oic"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Beaker \
python39-Mako \
python39-cryptography \
python39-dbm \
python39-defusedxml \
python39-pycryptodomex \
python39-pyjwkest \
python39-requests \
python39-typing \
python39-typing-extensions"

inherit rpm
