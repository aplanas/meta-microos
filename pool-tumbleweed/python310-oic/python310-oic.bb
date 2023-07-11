SUMMARY = "A complete OpenID Connect implementation in Python"
DESCRIPTION = "This is a complete Python implementation of OpenID Connect as specified in \
the OpenID Connect Core specification. As a side effect, this is a complete \
implementation of OAuth2.0 too."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python310-oic-1.5.0-1.7.noarch.rpm"
RPM_HASH = "37695009913ab68ca1dc5a565b75cc57e3d3cca8dceb38f84e6547a51d12cf2bda40f7d8f800e6ba631bbb52d33ab9f2b0b1ddabba2d79ff2e3704bd0b4902bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-oic \
python310-oic \
python3dist-oic"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Beaker \
python310-Mako \
python310-cryptography \
python310-dbm \
python310-defusedxml \
python310-pycryptodomex \
python310-pyjwkest \
python310-requests \
python310-typing \
python310-typing-extensions"

inherit rpm
