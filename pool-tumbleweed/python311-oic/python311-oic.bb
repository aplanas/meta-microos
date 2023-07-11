SUMMARY = "A complete OpenID Connect implementation in Python"
DESCRIPTION = "This is a complete Python implementation of OpenID Connect as specified in \
the OpenID Connect Core specification. As a side effect, this is a complete \
implementation of OAuth2.0 too."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python311-oic-1.5.0-1.7.noarch.rpm"
RPM_HASH = "e9bcdeb9dca8bc837c1035831b20917a7bf9a9c5887e0f1b4d62775830e9f08e5dc7ba7afe217f0d25aaabc5fdf9e6b575901deef47ab2283e5b637d6d51be58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oic \
python3.11dist-oic \
python311-oic \
python3dist-oic"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Beaker \
python311-Mako \
python311-cryptography \
python311-dbm \
python311-defusedxml \
python311-pycryptodomex \
python311-pyjwkest \
python311-requests \
python311-typing \
python311-typing-extensions"

inherit rpm
