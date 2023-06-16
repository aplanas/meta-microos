SUMMARY = "A complete OpenID Connect implementation in Python"
DESCRIPTION = "This is a complete Python implementation of OpenID Connect as specified in \
the OpenID Connect Core specification. As a side effect, this is a complete \
implementation of OAuth2.0 too."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python39-oic-1.5.0-1.5.noarch.rpm"
RPM_HASH = "51b8845dc2eeded0f4f2b7bc10956ffb0e7dbe176bc9b3102996095511244da71ea0d480cd8c90d17610922cd4354e103e18122d4e09ac9f199f9a0aec107052"
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
